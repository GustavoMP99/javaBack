package com.backendJava;
import generated.*;
import org.antlr.v4.runtime.*;

import generated.ScannerMain;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import com.google.gson.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {


    @GetMapping
    public Integer listar(){

        ScannerMain inst = null;
        ParserMain parser = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new ScannerMain(input);
            tokens = new CommonTokenStream(inst);
            parser = new ParserMain(tokens);
            System.out.println("Compilación Terminada!!\n");

        }
        catch ( IOException e) {
            e.printStackTrace();
            return 500;
        }

        return 200;
    }

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

        try {
            //input = CharStreams.fromFileName("C:\\Users\\M-ROD\\OneDrive\\Documents\\TEC-I2021\\Compi\\backendJava\\backendJava\\test.txt");
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

                System.out.println(tokens.size());


                List<Token> lista2 = (List<Token>) inst.getAllTokens();
                for (Token t : tokens.getTokens()) {
                    System.out.println(ScannerMain.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText());
                }



                /*int cont=0;
                while (cont < tokens.size()-1){
                    //System.out.println(inst.getRuleNames()[tokens.get(cont).getType() -1]);


                    System.out.println(ScannerMain.VOCABULARY.getSymbolicName(tokens.get(cont).getType())+tokens.get(cont).getText());

                    Respuesta nr=new Respuesta(inst.getRuleNames()[tokens.get(cont).getType() -1], tokens.get(cont).getText());

                    Gson gson = new Gson();
                    String JSON = gson.toJson(nr);
                    respuesta.add(JSON);

                    cont++;
                }*/


                return respuesta;
            }
            else {
                System.out.println("Compilación Fallida!!\n");
                System.out.println();
                //respuesta.add(errorListener.toString());
                Respuesta nr=new Respuesta(errorListener.toString(), "Error");
                Gson gson = new Gson();
                String JSON = gson.toJson(nr);
                respuesta.add(JSON);
                return respuesta;
            }
        }
        catch ( Exception e) {
            System.out.println("CATCH***********");
            e.printStackTrace();
            //respuesta.add("Hubo un error en el backend");
            Respuesta nr=new Respuesta("Hubo un error en el backend", "Error");
            Gson gson = new Gson();
            String JSON = gson.toJson(nr);
            respuesta.add(JSON);
            return respuesta;
        }
    }

}
