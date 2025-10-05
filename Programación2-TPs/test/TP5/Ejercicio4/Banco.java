
package TP5.Ejercicio4;

public class Banco {
    private String nombre;
    private String cuit;

    //Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    //Getter para cada objeto
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    //Método toString

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
    
    
    
}
