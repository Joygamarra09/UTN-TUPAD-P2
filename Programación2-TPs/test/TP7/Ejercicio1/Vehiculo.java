
package TP7.Ejercicio1;

/**
 *
 * @author Joana Gamarra
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;

    //Constructor completo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Método para mostrar información del vehiculo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
   
}


