package com.cristo.Logica;


import java.util.ArrayList;
import java.util.List;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = new Nodo();

    }

    public void agregarPalabra(String palabra) {
        raiz.agregarPalabra(palabra.toLowerCase());
    }

    public void quitarPalabra(String palabra) {
        raiz.quitarPalabra(palabra.toLowerCase());
    }

    public boolean buscarPalabra(String palabra) {
        Nodo p = raiz;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            int index = c - 'a';
            if (p.getHijos()[index] != null) {
                p = p.getHijos()[index];
            } else {
                return false;
            }
        }
        if (p == raiz) {
            return false;
        }
        return true;
    }

    public List getPalabras(String prefix) {
        Nodo ultimoNodo = raiz;
        for (int i = 0; i < prefix.length(); i++) {
            ultimoNodo = ultimoNodo.getNodo(prefix.charAt(i));

            if (ultimoNodo == null) {
                return new ArrayList();
            }
        }
        System.out.println(ultimoNodo.getPalabras().toString());
        return ultimoNodo.getPalabras();
    }

}
