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
    public List<String> allCode(@RequestBody String code ){
        System.out.println(code);
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

            //errorListener = new ErrorListenerControl();

            inst.removeErrorListeners();
            //inst.addErrorListener( errorListener );


            parser.removeErrorListeners();
            //parser.addErrorListener ( errorListener );

            System.out.println("Cantidad de errores: "+errorMsgs.size());

            Interprete inter = new Interprete();
            inter.visit(tree);

            if (errorMsgs.size() <= 0) {
                System.out.println("Compilación Exitosa!!\n");
                for (Token t : tokens.getTokens()) {
                    // System.out.println(ScannerMain.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText()); DESCOMENTAR?
                    Respuesta nr=new Respuesta(ScannerMain.VOCABULARY.getSymbolicName(t.getType()), t.getText());

                    Gson gson = new Gson();
                    String JSON = gson.toJson(nr);
                    respuesta.add(JSON);
                }
                System.out.println("respuesta " + respuesta);

                return respuesta;
            }
            else {
                //System.out.println("Compilación Fallida!!\n");
                //System.out.println(errorListener.toString());
                //Respuesta nr=new Respuesta(errorListener.toString(), "Error");
                Gson gson = new Gson();
                //String JSON = gson.toJson(nr);
                //System.out.println(JSON);

                //respuesta.add(errorListener.toString());
                return respuesta;

            }

        }

        catch ( Exception e) {
            System.out.println("ERROR GETTING ON CATCH");
            e.printStackTrace();
            Respuesta nr=new Respuesta("Hubo un error en el backend", "Error");
            Gson gson = new Gson();
            String JSON = gson.toJson(nr);
            respuesta.add(JSON);
            return respuesta;
        }
    }
}
