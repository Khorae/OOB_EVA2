package SuperClases;


public abstract class Ropa extends Productos {
    private char talla;
    private String marca;
    private String color;

    public Ropa() {
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ropa(char talla, String marca, String color) {
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }
}
