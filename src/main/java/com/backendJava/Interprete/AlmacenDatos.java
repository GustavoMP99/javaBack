package com.backendJava.Interprete;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlmacenDatos {
    LinkedList<Instancia> almacen;

    public class Instancia{
        String nombre;
        Object valor;
        ArrayList<Object> valor_ = new ArrayList<Object>();
        ParserRuleContext ctx;

        public Instancia(String nombre, Object valor) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = null;
        }

        public Instancia(String nombre, Object valor, ParserRuleContext ctx) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = ctx;
        }

        public Instancia(String nombre, ArrayList<Object> valor, ParserRuleContext ctx) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = ctx;
        }
    }

    public AlmacenDatos() {
        this.almacen = new LinkedList<Instancia>();
    }

    public void agregarInstancia(String n, Object v){
        this.almacen.add(new Instancia(n,v));
    }

    public void agregarInstancia(String n, Object v, ParserRuleContext c){
        this.almacen.add(new Instancia(n,v,c));
    }

    public Instancia getInstancia(String n){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                return id;
        return null;
    }

    public void setInstancia(String n, Object v){
        for(Object id : almacen)
            if (((Instancia)id).nombre.equals(n))
                ((Instancia) id).valor = v;
    }
}
