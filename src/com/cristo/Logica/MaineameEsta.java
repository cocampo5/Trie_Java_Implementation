package com.cristo.Logica;

public class MaineameEsta {
    public static void main(String args[]){
        Arbol arbol = new Arbol();
        arbol.agregarPalabra("papuh");
        
        arbol.agregarPalabra("hola");
        arbol.agregarPalabra("hole");
        arbol.agregarPalabra("holi");
        arbol.agregarPalabra("holo");
        arbol.agregarPalabra("holu");
        arbol.agregarPalabra("sancocho");
        arbol.agregarPalabra("papa");
        arbol.agregarPalabra("criolla");
        arbol.getPalabras("");
        System.out.println(arbol.buscarPalabra(""));
    }
}
