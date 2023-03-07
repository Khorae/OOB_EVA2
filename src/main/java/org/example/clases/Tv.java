package org.example.clases;

public class Tv {
    private int canales = 5;
    private int volumen = 50;
    private boolean power = true;

    public Tv() {
    }

    public void imprimirDatos() {
        System.out.println("Canal: " + this.canales);
        System.out.println("Volumen: " + this.volumen);
        System.out.println("Power: " + this.power);
    }

    public int getCanales() {
        return this.canales;
    }

    public void setCanales(int canales) {
        this.canales = canales;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isPower() {
        return this.power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
