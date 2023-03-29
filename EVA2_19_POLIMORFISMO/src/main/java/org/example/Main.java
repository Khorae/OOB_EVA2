package org.example;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Raul","Fernandez",18,"22550319");
        //estudiante.imprimirDatos();
        Docente docente = new Docente("Ruben","Hernandez",42,"Tiempo completo");
        //docente.imprimirDatos();

        //EN RESUMEN ESTO ES POLIMORFISMO
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona1 = estudiante;
        persona1.imprimirDatos();

        //AHORA EL REVES
        // NO SE PUEDE HACER CONVERSION DE SUPER CLASE A SUBCLASE
        // EN ESTE CASO, NO EXISTE LA PLAZA
        Docente docente1 = persona;


    }
}