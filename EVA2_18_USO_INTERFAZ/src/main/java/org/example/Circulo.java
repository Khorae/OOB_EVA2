package org.example;

public class Circulo implements Figuras, Mostrardatos{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI*Math.pow(radio,2));
    }

    @Override
    public double calcularPeri() {
        return (Math.PI*(2*radio));
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Radio: "+radio);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPeri());
    }
}
