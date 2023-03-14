package org.example;

public class Informe extends Documento{
    private String editorial;
    private String institucion;

    public Informe() {
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Informe(String editorial, String institucion) {
        this.editorial = editorial;
        this.institucion = institucion;
    }
}
