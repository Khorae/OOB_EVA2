package org.example;

public class Main {
    public static void main(String[] args) {
        subClase obj = new subClase();
        obj.mensaje();
    }
}
class superClase{
    public void mensaje(){
        System.out.println("Hola");
    }
}
class subClase extends superClase{

}