package com.backendJava.AContextual;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class TablaSimbolos {

    private LinkedList<Object> tabla;
    private int nivelActual;

    public TablaSimbolos() {
        tabla = new LinkedList<Object>();
        this.nivelActual=-1;
    }

    public class Ident{
        Token tok;
        String type;
        int nivel;
        //int valor;
        ParserRuleContext declCtx;

        public Ident(Token t,String tp, ParserRuleContext decl){
            tok = t;
            type = tp;
            nivel=nivelActual;
            //valor = 0;
            declCtx=decl;
        }

        /*public void setValue(int v){
            valor = v;
        }*/

        public int getNivel() {
            return nivel;
        }
        public String getType(){
            return type;
        }
    }

    public boolean insertar(Token id, String tipo, ParserRuleContext decl)
    {
        //no se puede insertar un elemento repetido en el mismo nivel
        Ident i = new Ident(id,tipo,decl);
        if (buscar(id.getText(), i.getNivel())==null){
            tabla.addFirst(i);
            return true;
        }else{
            return false;
        }
    }

    public Ident buscar(String nombre)
    {
        Ident temp=null;
        for(Object id : tabla)
            if ( ((Ident)id).tok.getText().equals(nombre))
                return ((Ident)id);
        return temp;
    }

    public String getType(String name){
        for(Object id : tabla)
            if ( ((Ident)id).tok.getText().equals(name))
                return ((Ident)id).type;
        return "";
    }


    public Ident buscar(String nombre, int nivel)
    {
        Ident temp=null;
        for(Object id : tabla)
            if ( ((Ident)id).tok.getText().equals(nombre) && ((Ident)id).getNivel()==(nivel) )
                return ((Ident)id);
        return temp;
    }

    public void openScope(){
        nivelActual++;
    }

    public void closeScope(){
        tabla.removeIf(n -> (((Ident)n).nivel == nivelActual));
        nivelActual--;
    }

    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        for (int i = 0; i < tabla.size(); i++) {
            Token s = (Token) ((Ident) tabla.get(i)).tok;
            System.out.println("Nombre: " + s.getText() + " - " + ((Ident) tabla.get(i)).nivel + " - " + ((Ident) tabla.get(i)).type);
/*            if (s.getType() == 0) System.out.println("\tTipo: Indefinido");
            else if (s.getType() == 1) System.out.println("\tTipo: Integer\n");
            else if (s.getType() == 2) System.out.println("\tTipo: String\n");*/
        }
        System.out.println("----- FIN TABLA ------");
    }

}
