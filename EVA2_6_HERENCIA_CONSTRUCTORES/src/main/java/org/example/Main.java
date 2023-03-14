package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clase animal: ");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("");

        System.out.println("Clase mamifero: ");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.respirar();
        mamifero.tenerPelo();

    }
}