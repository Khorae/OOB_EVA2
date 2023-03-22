package org.example;

public class Main {
    public static void main(String[] args) {
       //NO SE PUEDE INSTANCIAR UNA INTEFAZ MostrarDatos mostrarDatos = new MostrarDatos();
        Persona persona = new Persona("Raul Fernandez", 18);
        persona.imprimirDatos();
        Computadora computadora = new Computadora(25000,"Lenovo Legion","Lenovo","Ryzen 7");
        computadora.imprimirDatos();
    }
}