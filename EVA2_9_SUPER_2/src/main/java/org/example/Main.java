package org.example;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Raul Alejandro", "Fernandez Bordier", 18, "22550319");
        estudiante.imprimirDatos();

        Docente docente = new Docente("Ruben","Hernandez",25,"ISC");
        docente.imprimirDatos();
    }
}
