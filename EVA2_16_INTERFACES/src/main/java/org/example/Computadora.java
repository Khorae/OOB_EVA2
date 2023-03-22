package org.example;

public class Computadora extends Producto implements MostrarDatos{//Extends heredamos de clase; Implements implementamos interfaces
    private String marca;
    private String procesador;

    public Computadora() {
        this.marca = "";
        this.procesador = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Computadora(double precio, String nombre, String marca, String procesador) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
    }
}
