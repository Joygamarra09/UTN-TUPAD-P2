
package TP7.Ejercicio1;

/**
 *
 * @author Joana Gamarra
 */
public class MainVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos un Auto con marca, modelo y cantidad de puertas
        Auto miAuto = new Auto("ElAutito", "Flama", 4);

        // Mostramos la información completa del auto
        miAuto.mostrarInfo();

    }
    
}
