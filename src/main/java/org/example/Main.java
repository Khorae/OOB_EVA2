package org.example;

import org.example.clases.Persona;
import org.example.clases.Tv;
import org.example.clases.Automovil;

public class Main {
    public static void main(String[] args) {
        Persona P = new Persona();
        Tv Tv = new Tv();
        Automovil Am = new Automovil();
        P.imprimirDatos();
        Tv.imprimirDatos();
        Am.imprimirDatos();
    }
}