package SuperClases;

public abstract class Productos {
    protected double precio;
    private String nombre;
    private String unidadVenta;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    public Productos(double precio, String nombre, String unidadVenta) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidadVenta = unidadVenta;
    }

    public Productos() {
        this.precio = 0;
        this.nombre = "";
        this.unidadVenta = "";
    }

    public abstract double precioVenta(int cantidad);
}
