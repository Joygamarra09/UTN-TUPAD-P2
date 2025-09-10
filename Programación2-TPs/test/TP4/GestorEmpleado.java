
package TP4;

public class GestorEmpleado {

    public static void main(String[] args) {
        //Se crearon empleados con distintos constructores
        Empleado e1 = new Empleado("Joana Gamarra", "Desarrollador");
        Empleado e2 = new Empleado("Brenda Lucena", "Tester");
        Empleado e3 = new Empleado("Damian Sardi", "Analista");
        Empleado e4 = new Empleado("Santiago Romero", "Desarrollador");
        Empleado e5 = new Empleado(5, "Alan Gonzalez", "Analista", 1600000.0 ); //Este empleado se creó al final del proceso, por lo que no lo mostraremos por consola al comienzo.
        
        System.out.println("--------- GESTOR DE EMPLEADOS ---------");
        System.out.println("");
        
        //Se muestra por consola los datos ingresados de los empleados
        System.out.println("\n- Se han ingresado los datos de nuevos empleados correctamente: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        
        System.out.println("");
        
        //Se actualizan salarios con monto fijo y con porcentaje
        e1.actualizarSalario(250000.0);
        e2.actualizarSalario(200000.0);
        e3.aumentarSalarioPorcentaje(15);
        e4.aumentarSalarioPorcentaje(20);
        
        //Se muestran por consola
        System.out.println("\n- Actualización de salario de los empleados: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        
        //Se actualiza el sueldo de un empleado
        System.out.println("\n- Actualización de salario del empleado: ");
        e3.actualizarSalario(100000.0);
        System.out.println(e3.toString());
        
        //Se ingresan los datos de un nuevo empleado y se muestra por consola verificando que se asigne un id correcto
        System.out.println("\n- Se han ingresado los datos de un nuevo empleado correctamente: ");
        System.out.println(e5.toString());
        
        //Luego de varios meses, se actualiza el sueldo del último empleado ingresado al sistema
        System.out.println("\n- Actualización de salario del empleado: ");
        e5.aumentarSalarioPorcentaje(15);
        System.out.println(e5.toString());
        
        System.out.println("");
        
        //Confirmamos que el constructor se actualizó correctamente
        e1.mostrarTotalEmpleados();
        
        
        
        
    }
    
}
