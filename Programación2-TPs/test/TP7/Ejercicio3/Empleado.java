
package TP7.Ejercicio3;

/**
 *
 * @author Joana Gamarra
 */
public abstract class Empleado {
    
    //Calcular el sueldo de un empleado según su tipo.
    public double calcularSueldo (Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 1200000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 1000000.0;
        } else {
            return 0;
        }
    }
}


