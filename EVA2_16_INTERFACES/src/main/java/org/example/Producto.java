package org.example;

public abstract class Producto {
    private double precio;
    private String nombre;

    public Producto() {
        this.precio = 0.0;
        this.nombre = "";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
}
