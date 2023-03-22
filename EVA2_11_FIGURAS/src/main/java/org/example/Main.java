package org.example;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(10,10);
        Figuras f = new Figuras();

        System.out.println(c);
        System.out.println(t);
        System.out.println(f);
    }
}