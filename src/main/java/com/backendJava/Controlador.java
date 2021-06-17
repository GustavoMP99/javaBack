package com.backendJava;
import com.backendJava.AContextual.AContextual;
import com.backendJava.Interprete.Interprete;
import generated.*;
import org.antlr.v4.runtime.*;

import generated.ScannerMain;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

import static com.backendJava.ErrorListenerControl.errorMsgs;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/compilador"})
public class Controlador {

    @PostMapping
    public ArrayList<Object> allCode(@RequestBody String code ){
        errorMsgs.clear();


        //System.out.println(code);
        ScannerMain inst = null;
        ParserMain parser = null;
        CharStream input=null;
        ParseTree tree=null;
        CommonTokenStream tokens = null;
        //ErrorListenerControl errorListener = null;

        List<String> respuesta = new ArrayList<String>();


        try {
            input = CharStreams.fromString(code);
            //input = CharStreams.fromFileName("test.txt");
            inst = new ScannerMain(input);
            tokens = new CommonTokenStream(inst);
            parser = new ParserMain(tokens);
            try {
                tree = parser.program();
            }catch(RecognitionException e){
                System.out.println("Error al crear el árbol!!!");
                e.printStackTrace();
            }

            AContextual ac = new AContextual();
            ac.visit(tree);

            System.out.println("Cantidad de errores: "+errorMsgs.size());

            if (errorMsgs.size() <= 0) {
                System.out.println("Compilación Exitosa!!\n");

                Interprete inter = new Interprete();
                inter.visit(tree);

                System.out.println("respuesta " + inter.retorno);

                return inter.retorno;
            }
            else {

                System.out.println("Compilación Fallida!!\n");

                //System.out.println(errorListener.toString());
                //Respuesta nr=new Respuesta(errorListener.toString(), "Error");
                Gson gson = new Gson();
                //String JSON = gson.toJson(nr);
                //System.out.println(JSON);

                //respuesta.add(errorListener.toString());
                ArrayList<Object> errores = new ArrayList<>();
                System.out.println(errores);
                errores.add(errorMsgs);

                return errores;

            }

        }

        catch ( Exception e) {
            System.out.println("ERROR GETTING ON CATCH");
            e.printStackTrace();
            Respuesta nr=new Respuesta("Hubo un error en el backend", "Error");
            Gson gson = new Gson();
            String JSON = gson.toJson(nr);
            respuesta.add(JSON);
            ArrayList<Object> errores = new ArrayList<>();
            errores.add("Hubo un error en el backend");
            return errores;
        }
    }

    private static boolean isNumeric_(Object cadena){
        try {
            Integer.parseInt((String) cadena);
            return true;
        } catch (Exception nfe){
            return false;
        }
    }
}
