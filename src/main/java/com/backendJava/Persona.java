package com.backendJava;

import javax.persistence.*;


@Entity
//@Table(name = "persona")
public class Persona {
    //@Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY);

    public Persona(int id, String name, String apellidos) {
        this.id = id;
        this.name = name;
        this.apellidos = apellidos;
    }

    private int id;
    private String name;
    private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
