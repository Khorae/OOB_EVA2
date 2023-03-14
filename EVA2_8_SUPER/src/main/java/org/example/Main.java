package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(100);
        Mamifero mamifero = new Mamifero(50, "Negro");
        Perros perros = new Perros();
    }
}
class Animal{
    private int peso;
    public Animal(){
        System.out.println("Animal: its alive!");
    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("Animal: its alive!  Constructor 2");
    }

    public void respirar(){
        System.out.println("Estoy respirando");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
}

class Mamifero extends Animal{
    private String colorPelo;
    public Mamifero() {
        super();
        //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE, EN NUESTRO CASO, LLAMA A Animal()
        //Siempre debemos llamar primero al constructor de la superclase
        System.out.println("Soy un mamifero!");
    }

    public Mamifero(int peso) {
        super(peso);
    }

    public Mamifero(int peso, String colorPelo) {
        super(peso); //SIEMPRE LLAMAR AL CONTRUCTOR DE LA SUPERCLASE
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero!  Constructor 2");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
}

class Perros extends Mamifero{
    public Perros() {
        //SIEMPRE HAY QUE INVOCAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("Soy Khory y soy un perro");
    }
}