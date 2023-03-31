package org.example;

import java.util.Scanner;

public class FyV extends Productos implements datos,Producto {
    private String tipo;
    private double preciokilo;

    public FyV(int sku, String nombre, double preciounidad) {
        super();
        this.preciounidad = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreciokilo() {
        return preciokilo;
    }

    public void setPreciokilo(double preciokilo) {
        this.preciokilo = preciokilo;
    }

    public FyV(int sku, String nombre, double preciounidad, String tipo, double preciokilo) {
        super(nombre, preciounidad, sku);
        this.tipo = tipo;
        this.preciokilo = preciokilo;
        this.preciounidad = 0;
    }
    @Override
    public void setDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el SKU del producto: ");
        setSku(sc.nextInt());
        System.out.println("Ingresa el nombre del producto: ");
        setNombre(sc.next());
        System.out.println("El producto es fruta o verdura?");
        setTipo(sc.next());
        System.out.println("Ingrese el precio por kilo: ");
        setPreciokilo(sc.nextDouble());
    }
    @Override
    public String toString() {
        String chain =
                "SKU: " + getSku() + "\n" + "Nombre: " + getNombre() + "\n" + "Tipo: " + getTipo() + "\n" + "Precio: " + getPreciokilo();
        return chain;
    }
}
