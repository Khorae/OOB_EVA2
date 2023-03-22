package SuperClases;

public abstract class Electronica extends Productos{
    private String fabricante;
    private String modelo;
    private int garantia;

    public Electronica() {
        super();
        this.fabricante = "";
        this.modelo = "";
        this.garantia = 0;


    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public Electronica(String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(precio, nombre, unidadVenta);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }
}
