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



        // Constructor
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


    //Agregar instancia al almacén.
    public void agregarInstancia(String n, ArrayList<Object> v, String t, ParserRuleContext c){
        this.almacen.add(new Instancia(n,v,t,c));
    }

    // Obtener una instancia dado el nombre.
    public Instancia getInstancia(String n){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                return id;
        return null;
    }

    // Actualizar el valor de una instancia tipo variable al almacén.
    public void setInstancia(String n, Object v){
        boolean band = false;
        for(Object id : almacen){
            if (((Instancia)id).nombre.equals(n)) {
                ((Instancia) id).valor_.set(0,v);
                band = true;
            }
        }
        if(!band)
            System.out.println("No se encontró " + n + " en el almacén de datos.");

    }


    // Actualizar una instancia tipo lista al almacén. (necesitan índice para asignar su valor)
    public void setInstancia(String n, int i, Object v){
        for(Object id : almacen)
            if (((Instancia)id).nombre.equals(n)){
                int conta = 0;
                int max;
                if(i > ((Instancia) id).valor_.size())
                    max = i;
                else
                    max = ((Instancia) id).valor_.size();

                while(conta <= max){
                    if(conta == i){
                        if(conta < ((Instancia) id).valor_.size()){
                            ((Instancia) id).valor_.set(conta,v);
                            break;
                        }
                        else ((Instancia) id).valor_.add(v);
                    }
                    else{
                        if(conta >= ((Instancia) id).valor_.size())
                            ((Instancia) id).valor_.add(null);
                    }
                    conta++;
                }
            }

    }

    // Imprimir los datos almacenados.
    public void verAlmacen(){
        for (Instancia i: almacen) {
            System.out.println(i.nombre);
            System.out.println(i.valor_);
        }
    }
}
