
package TP5.Ejercicio3;

public class Editorial {
    private String nombre;
    private String direccion;
    
    //Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //Getter para cada objeto
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
}
