
package TP5.Ejercicio2;

public class Bateria {
    private String modelo;
    private int capacidad;

    //Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    //Método toString
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
}
