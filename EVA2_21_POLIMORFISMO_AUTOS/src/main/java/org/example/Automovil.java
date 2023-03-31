package org.example;

public class Automovil extends Vehiculo implements controlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "---";
        this.año = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Automovil(String marca, int velocidad, String modelo, int año) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }


    @Override
    public void cambiarVelocidad() {

    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >=0){
            velocidad = vel;
        }
    }


    @Override
    public void tablero() {
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Combustible: (PENDIENTE)");
        System.out.println("Revoluciones: (PENDIENTE)");
    }
}
