package org.example;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Raul Fernandez",18);
        Persona p2 = new Persona();
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "--------";
        this.edad = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString(){
        System.out.println("");
        String chain = "Datos: \n" + "Nombre: " + nombre + "\n" + "Edad: " + edad;
        return chain;
    }
}