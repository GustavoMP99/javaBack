package com.backendJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
    //Autowired
    //PersonaService service;

    List<Persona> lista = new ArrayList<Persona>();

    @GetMapping
    public List<Persona> listar(){
        System.out.println("llegó acá");
        lista.clear();  
        Persona p1 = new Persona(1,"Mere","Rodriguez");
        Persona p2 = new Persona(2,"Pepito","Perez");
        lista.add(p1);
        lista.add(p2);

        return lista;
    }
}
