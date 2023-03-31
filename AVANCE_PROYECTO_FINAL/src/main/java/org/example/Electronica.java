package org.example;

import java.util.Scanner;

public class Electronica extends Productos implements datos,Producto {
    private String modelo;
    private String marca;

    public Electronica() {
        super();
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Electronica(int sku, String nombre, double preciounidad, String modelo, String marca) {
        super(nombre, preciounidad, sku);
        this.modelo = modelo;
        this.marca = marca;
    }
    @Override
    public void setDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el SKU del producto: ");
        setSku(sc.nextInt());
        System.out.println("Ingresa el nombre del producto: ");
        setNombre(sc.nextLine());
        System.out.println("Ingresa la marca del producto: ");
        setMarca(sc.nextLine());
        System.out.println("Ingresa el modelo del producto: ");
        setModelo(sc.nextLine());
        System.out.println("Ingresa el precio unitario del producto");
        setPreciounidad(sc.nextDouble());
    }
    @Override
    public String toString(){
        String chain = "SKU: " + getSku() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Precio por unidad: " + getPreciounidad();
        return chain;
    }
}
