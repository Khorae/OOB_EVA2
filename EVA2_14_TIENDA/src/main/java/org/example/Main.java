package org.example;
import Productos.Computadora;
import Productos.Jeans;
public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.precioVenta(11);
        System.out.println(computadora);

        Jeans jeans = new Jeans();
        jeans.precioVenta(15);
        System.out.println(jeans);
    }
}