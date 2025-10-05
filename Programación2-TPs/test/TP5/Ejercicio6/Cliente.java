
package TP5.Ejercicio6;

public class Cliente {
    private String nombre;
    private String telefono;

    //Constructor con validación
    public Cliente(String nombre, String telefono) {
        if ((nombre != null) && (telefono != null)){
            this.nombre = nombre;
            this.telefono = telefono;
        } 
    }

    //Getters para cada objeto
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    //Método toString
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
