
package TP8;

/**
 *
 * @author Joana Gamarra
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;

    //Constructor completo
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Método sobrescrito para calcular total
    @Override
    public double calcularTotal() {
        return precio;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
