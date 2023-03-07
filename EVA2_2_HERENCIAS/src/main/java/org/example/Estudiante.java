package org.example;


public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String NControl;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNControl() {
        return NControl;
    }

    public void setNControl(String NControl) {
        this.NControl = NControl;
    }

    public Estudiante(String nombre, String apellido, int edad, String NControl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.NControl = NControl;
    }
}
