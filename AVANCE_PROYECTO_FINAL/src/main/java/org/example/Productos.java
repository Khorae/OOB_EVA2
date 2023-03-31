package org.example;

public class Productos {
    protected int sku;
    protected String nombre;
    protected double preciounidad;
    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(double preciounidad) {
        this.preciounidad = preciounidad;
    }



    public Productos( String nombre, double preciounidad, int sku) {
        this.sku = sku;
        this.nombre = nombre;
        this.preciounidad = preciounidad;
    }
}
