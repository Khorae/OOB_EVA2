package org.example;

public class Circulo extends Figuras{
    private double radio;

    public Circulo() {
        this.area = 0;
        this.perimetro = 0;
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {;
        this.radio = radio;
    }


    public double getArea() {
        area = Math.PI*(radio*radio);
        return area;
    }

    public double getPerimetro(){
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    @Override
    public String toString(){
        area = getArea();
        perimetro = getPerimetro();
        System.out.println("Resultados circulo: \n");
        String chain = "Area: "+area+"\n"+"Perimetro: "+perimetro+"\n@Override\n" +
                "    public String toString(){\n" +
                "        area = getArea();\n" +
                "        perimetro = getPerimetro();\n" +
                "        System.out.println(\"Resultados triangulo: \\n\");\n" +
                "        String chain = \"Area: \"+area+\"\\n\"+\"Perimetro: \"+perimetro+\"\\n\";\n" +
                "        return chain;\n" +
                "    }";
        return chain;
    }
}
