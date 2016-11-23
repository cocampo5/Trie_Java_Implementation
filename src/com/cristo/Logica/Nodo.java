package com.cristo.Logica;


import java.util.ArrayList;
import java.util.List;

public class Nodo {

    private boolean esHoja;
    private boolean esPalabra;
    private Nodo[] hijos;
    private Nodo padre;
    private char c;

    public Nodo() {
        hijos = new Nodo[26];
        esHoja = true;
        esPalabra = false;
    }

    public Nodo(char c) {
        this();
        this.c = c;
    }

    public void agregarPalabra(String palabra) {
        esHoja = false;
        int index = palabra.charAt(0) - 'a';

        if (hijos[index] == null) {
            hijos[index] = new Nodo(palabra.charAt(0));
            hijos[index].padre = this;
        }

        if (palabra.length() > 1) {
            hijos[index].agregarPalabra(palabra.substring(1));
        } else {
            hijos[index].esPalabra = true;
        }
    }
    
    public void quitarPalabra(String palabra){
        
    }
    
    

    protected Nodo getNodo(char c) {
        return hijos[c - 'a'];
    }

    protected List getPalabras() {
        List lista = new ArrayList();

        if (esPalabra) {
            lista.add(toString());
        }

        if (!esHoja) {
            for (Nodo hijo : hijos) {
                if (hijo != null) {
                    lista.addAll(hijo.getPalabras());
                }
            }
        }
        
        return lista;
    }

    @Override
    public String toString() {
        if (padre == null) {
            return "";
        } else {
            return padre.toString() + new String(new char[]{c});
        }
    }

    public Nodo[] getHijos() {
        return hijos;
    }

    public void setHijos(Nodo[] hijos) {
        this.hijos = hijos;
    }
    
    
}
