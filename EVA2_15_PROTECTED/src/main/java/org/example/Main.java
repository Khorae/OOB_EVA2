package org.example;
import Prueba.SuperClase;

public class Main {
    public static void main(String[] args) {
    }
}
class SubClase extends SuperClase{
    public void imprimirValor(){
        System.out.println("El valor es: " + valor);
    }
}