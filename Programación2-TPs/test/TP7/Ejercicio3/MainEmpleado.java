
package TP7.Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Joana Gamarra
 */
public class MainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se inicializa un ArrayList de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        //Se crean empleados
        EmpleadoPlanta emp1 = new EmpleadoPlanta();
        EmpleadoPlanta emp2 = new EmpleadoPlanta();
        EmpleadoTemporal emp3 = new EmpleadoTemporal();
        EmpleadoTemporal emp4 = new EmpleadoTemporal();

        //Se agregan al ArrayList a los nuevos empleados
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        
        int i = 0;
        //Se recorre el ArrayList
        for(Empleado e : empleados) {
            System.out.println("El empleado " + i + 
                    " cobra como sueldo: " + e.calcularSueldo(e));
            i++;
        }  
    }
}
