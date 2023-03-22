package org.example;

public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
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



    public double getArea(){
        area = (base*altura)/2;
        return area;
    }

    public double getPerimetro(){
        perimetro = Math.PI*(base+base)+(altura+altura);
        return perimetro;
    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura ;
    }
    @Override
    public String toString(){
        area = getArea();
        perimetro = getPerimetro();
        System.out.println("Resultados triangulo: \n");
        String chain = "Area: "+area+"\n"+"Perimetro: "+perimetro+"\n";
        return chain;
    }
}
