package org.example;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Volkswagen",0,"Vocho",2000);
        modificarVel(automovil,50);
        Bicicleta bicicleta = new Bicicleta("Apache",0,"Montaña");
        modificarVel(bicicleta,20);
    }
    public static void  modificarVel(controlarDatos datos, int vel){
        datos.cambiarVelocidad(vel);
        datos.tablero();
    }
}