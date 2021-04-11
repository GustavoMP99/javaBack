package com.backendJava;
import generated.*;
import org.antlr.v4.runtime.*;

import generated.ScannerMain;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {


    List<Persona> lista = new ArrayList<Persona>();

    @GetMapping
    public List<Persona> listar(){
        System.out.println("lista usuarios");
        lista.clear();
        Persona p1 = new Persona(1,"Mere","Rodriguez");
        Persona p2 = new Persona(2,"Pepito","Perez");
        lista.add(p1);
        lista.add(p2);


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
        }


        return lista;
    }
}
