package com.backendJava.Interprete;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlmacenDatos {
    LinkedList<Instancia> almacen;

    public class Instancia{
        String nombre;
        Object valor;
        String tipo;
        ArrayList<Object> valor_ = new ArrayList<Object>();
        ParserRuleContext ctx;


        public Instancia(String nombre, Object valor, ParserRuleContext ctx) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = ctx;
        }

        // *** Mi constructor ***
        public Instancia(String nombre, ArrayList<Object> valor, String t, ParserRuleContext ctx) {
            this.nombre = nombre;
            this.valor_ = valor;
            this.tipo = t;
            this.ctx = ctx;
        }
    }

    public AlmacenDatos() {
        this.almacen = new LinkedList<Instancia>();
    }


    public void agregarInstancia(String n, Object v, ParserRuleContext c){
        this.almacen.add(new Instancia(n,v,c));
    }

    // *** Mi Agregar ***
    public void agregarInstancia(String n, ArrayList<Object> v, String t, ParserRuleContext c){
        this.almacen.add(new Instancia(n,v,t,c));
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

    // Set para las listas (necesitan índice para asignar su valor)
    public void setInstancia(String n, Object i, Object v){
        for(Object id : almacen)
            if (((Instancia)id).nombre.equals(n)){
                System.out.println("VALOR ACTUAL");
                System.out.println(((Instancia) id).valor_);

                for (Object value: ((Instancia) id).valor_) {
                    System.out.println(value);
                }
            }

    }
}
