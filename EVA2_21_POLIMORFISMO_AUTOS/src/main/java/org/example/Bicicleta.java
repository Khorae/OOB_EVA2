package org.example;

public class Bicicleta extends Vehiculo implements controlarDatos{
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String marca, int velocidad, String tipo) {
        super(marca, velocidad);
        this.tipo = tipo;
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
    }
}
