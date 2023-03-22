package org.example;

    //CLASE DERIVADA extends CLASE BASE
    //CLASE HIJO extends CLASE PADRE
    //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona{
    public String NoControl;

        public Estudiante() { //Constructor default
            super(); //Invoca al constructor de la super clase
            this.NoControl = "--------";
        }

        public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String noControl) {
        NoControl = noControl;
    }

        public Estudiante(String nombre, String apellido, int edad, String noControl) {
            super(nombre, apellido, edad);
            this.NoControl = noControl;
        }
        @Override
        public void imprimirDatos(){
            super.imprimirDatos();
            System.out.println("No. de control: "+NoControl);
        }
    }
