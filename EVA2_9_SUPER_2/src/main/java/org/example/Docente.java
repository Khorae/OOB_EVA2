package org.example;
    //SUBCLASE extends SUPERCLASE
    //CLASE DERIVADA extends CLASE BASE
    //CLASE HIJO extends CLASE PADRE
public class Docente extends Persona{
    private String plaza;

        public Docente() {
            super();
            this.plaza = "--------";
        }

        public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

        public Docente(String nombre, String apellido, int edad, String plaza) {
            super(nombre, apellido, edad);
            this.plaza = plaza;
        }
        @Override
        public void imprimirDatos(){
            super.imprimirDatos();
            System.out.println("No. de control: "+plaza);
        }
}
