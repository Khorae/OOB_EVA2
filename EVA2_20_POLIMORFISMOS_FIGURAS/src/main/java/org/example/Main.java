package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Circulo circulo = new Circulo(5);
        //circulo.imprimirdatos();

        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE FIGURAS
        /*Figuras figuras = circulo;
        System.out.println("USANDO FIGURAS: ");
        System.out.println("AREA: " + figuras.calcularArea());
        System.out.println("PERIMETRO: " + figuras.calcularPeri());*/

        /*int[] array = new int[10];
        //Arreglo que guarda 10 enteros, donde inicia y termina?
        //Inicia en 0 y termina en 9 (N-1, donde N es la cantidad de elementos en el arreglo)

        array[0] =100;
        System.out.println(array[0]);*/

        System.out.println("Cuantas figuras necesitas?");
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        Figuras[] figuras = new Figuras[cant];
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Que tipo de figura necesitas? 1.Circulo  2.Triangulo");
            int input = sc.nextInt();
            if (input==1){ //CIRCULO
                Circulo circulo = new Circulo();
                System.out.println("Introduce el radio: ");
                circulo.setRadio(sc.nextDouble());
                figuras[i] = circulo;
            }else { //TRIANGULO
                Triangulo triangulo = new Triangulo();
                System.out.println("Introduce la base: ");
                triangulo.setBase(sc.nextDouble());
                System.out.println("Introduce la altura: ");
                triangulo.setAltura(sc.nextDouble());
                figuras[i] = triangulo;
            }
        }
        //Imprimir resultados
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo) {
                System.out.println("Circulo: " + i);
                //CASTING
                Circulo circulo = (Circulo)figuras[i];
                circulo.imprimirdatos();
            }else {
                System.out.println("Triangulo: " + i);
                //CASTING
                Triangulo triangulo = (Triangulo)figuras[i];
                triangulo.imprimirdatos();
            }
            /*System.out.println("");
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPeri());
            */System.out.println("");
        }


        /*Circulo[] circulos = new Circulo[cant];
        for (int i = 0;i < circulos.length; i++){
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            System.out.println("Circulo No. " +i);
            circulos[i].imprimirdatos();
        }*/
    }
}