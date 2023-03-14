package org.example;

public class Libro extends Documento{
    private String editorial;
    private int volumen;

    public Libro() {
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Libro(String editorial, int volumen) {
        this.editorial = editorial;
        this.volumen = volumen;
    }
}
