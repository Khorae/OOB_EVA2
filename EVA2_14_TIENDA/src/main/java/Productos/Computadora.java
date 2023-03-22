package Productos;
import SuperClases.Electronica;
public final class Computadora extends Electronica{
    private int memoria;
    private double tamaPantalla;
    private double discoDuro;
    private String procesador;
    public Computadora() {
        this.memoria = 0;
        this.tamaPantalla = 0;
        this.discoDuro = 0;
        this.procesador = "";

    }

    public Computadora(int memoria, double tamaPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(fabricante, modelo, garantia, precio, nombre, unidadVenta);
        this.memoria = memoria;
        this.tamaPantalla = tamaPantalla;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }


    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamaPantalla() {
        return tamaPantalla;
    }

    public void setTamaPantalla(double tamaPantalla) {
        this.tamaPantalla = tamaPantalla;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    @Override
    public double precioVenta(int cantidad) {

        // antes de cierta cantidad manejamos precio normal
        // despues de cierta cantidad hay un descuento

        if (cantidad<= 10)
            return precio * cantidad;
        else
            return (precio*0.8)*cantidad;
    }

    @Override
    public String toString(){
        String chain = "El valor precio de venta es: " + precio + " $ pesos.";
        return chain;
    }
}
/*
* final---> no se puede heredar la clase indicada con final
* class Laptop extends Computadora{
* }
* */