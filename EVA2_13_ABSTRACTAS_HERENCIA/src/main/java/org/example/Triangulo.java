package org.example;

public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return 100;
    }
    @Override
    public double calcPeri() {
        return 100;
    }
}
