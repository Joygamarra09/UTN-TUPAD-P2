
package TP7.Ejercicio1;

/**
 *
 * @author Joana Gamarra
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // uso de super
        this.cantidadPuertas = cantidadPuertas;
    }

    //Método para mostrar información del auto
    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + ", marca: " + this.marca + 
                ", cantidad de puertas: " + cantidadPuertas);
    }

}
