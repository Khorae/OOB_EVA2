package org.example;

public class Main {
    public static void main(String[] args) {
        Estudiante E1 = new Estudiante();
        E1.setNombre("Raul");
        E1.setApellido("Fernandez");
        E1.setEdad(18);
        E1.setNoControl("22550319");
        System.out.println("Datos del estudiante: ");
        System.out.println(E1.getNombre());
        System.out.println(E1.getApellido());
        System.out.println(E1.getEdad());
        System.out.println(E1.getNoControl());
    }
}