package org.example;

public class Figuras {
    public double area;
    public double perimetro;
    public Figuras() {
        this.area = -1;
        this.perimetro = -1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Figuras(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public void imprimirDatos(){
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
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
