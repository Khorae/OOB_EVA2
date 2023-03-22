package Productos;
import SuperClases.Ropa;

public class Jeans extends Ropa {
    private String estilo;
    private String material;

    public Jeans() {
    }
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Jeans(char talla, String marca, String color, String estilo, String material) {
        super(talla, marca, color);
        this.estilo = estilo;
        this.material = material;
    }
    @Override
    public double precioVenta(int cantidad) {
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
