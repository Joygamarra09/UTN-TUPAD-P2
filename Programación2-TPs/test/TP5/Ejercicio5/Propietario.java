
package TP5.Ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; //Relación bidireccional
    
    //Constructor con validación
    public Propietario(String nombre, String dni) {
        if ((nombre != null) && (dni != null)){
            this.nombre = nombre;
            this.dni = dni;
        }
        
    }
    
    //Getters para cada objeto
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    //Setter para computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    //Método toString
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }
    
    
    
}
