package com.backendJava;
import com.backendJava.AContextual.AContextual;
import generated.*;
import org.antlr.v4.runtime.*;

import generated.ScannerMain;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/compilador"})
public class Controlador {

    /*@GetMapping
    public String getTest(){
        return "hola";
    }*/





    @PostMapping
    public List<String> allCode(@RequestBody String code ){
        System.out.println(code);
        ScannerMain inst = null;
        ParserMain parser = null;
        CharStream input=null;
        ParseTree tree=null;
        CommonTokenStream tokens = null;
        ErrorListenerControl errorListener = null;

        List<String> respuesta = new ArrayList<String>();


        input = CharStreams.fromString(code);
        inst = new ScannerMain(input);
        tokens = new CommonTokenStream(inst);
        parser = new ParserMain(tokens);

        tree = parser.program();

        AContextual ac = new AContextual();
        ac.visit(tree);

        return null;

        /*try {
            input = CharStreams.fromString(code);
            inst = new ScannerMain(input);
            tokens = new CommonTokenStream(inst);
            parser = new ParserMain(tokens);

            errorListener = new ErrorListenerControl();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            try {
                tree = parser.program();
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }

            if (errorListener.hasErrors() == false) {
                System.out.println("Compilación Exitosa!!\n");
                for (Token t : tokens.getTokens()) {
                    System.out.println(ScannerMain.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText());
                    Respuesta nr=new Respuesta(ScannerMain.VOCABULARY.getSymbolicName(t.getType()), t.getText());

                    Gson gson = new Gson();
                    String JSON = gson.toJson(nr);
                    respuesta.add(JSON);
                }
                return respuesta;
            }
            else {
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
                Respuesta nr=new Respuesta(errorListener.toString(), "Error");
                Gson gson = new Gson();
                String JSON = gson.toJson(nr);
                System.out.println(JSON);

                respuesta.add(errorListener.toString());
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
        }*/
    }
}
