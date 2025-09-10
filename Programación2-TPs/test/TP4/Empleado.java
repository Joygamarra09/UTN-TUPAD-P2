package TP4;

public class Empleado {

    //Atributos de la clase
    private static int contadorId = 1; // Comienza en 1 y se incrementa globalmente
    private int id = 0; //Identificador único de empleado
    private String nombre, puesto;  //Nombre completo y cargo que desempeña
    private double salario; //Salario actual
    public static int totalEmpleados = 0;

  
    //Se asignan los valores a los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; //cada vez que se ingresa un empleado, aumenta
    }
    
    //Constructor con dos parámetros
    public Empleado(String nombre, String puesto){
       this.nombre = nombre;
       this.puesto = puesto;
       this.id = contadorId++;
       this.salario = asignarSalario(puesto);
       totalEmpleados++;
    }
    
    //Método privado para asignar salario según el puesto
    private double asignarSalario(String puesto){
        switch (puesto.toLowerCase()){
            case "analista":
                return 1600000.0;
            case "desarrollador":
                return 1800000.0;
            case "tester":
                return 1700000.0;
            default: 
                return 1300000.0; //Salario base
        }
    }

    //toString para mostrar los atributos de la clase Empleado
    @Override
    public String toString() {
        return "ID del Empleado: " + id + "\nnombre completo: " + nombre + "\npuesto: " + puesto + "\nsalario: $" + salario;
    }

    //Método para mostrar totalEmpleados
    public void mostrarTotalEmpleados() {
        System.out.println("Cantidad de empleados actualizado: " + totalEmpleados + " empleados.");
        System.out.println("");
    }

    //Método para actualizar salario con monto fijo
    public void actualizarSalario(double montoFijo){
        if(montoFijo > 0){
            salario += montoFijo;
        } 
    }
    
    //Método para actualizar salario con porcentaje
    public void aumentarSalarioPorcentaje(double porcentaje){
        if (porcentaje > 0){
            salario += salario * (porcentaje / 100.0);
        }
    }
}
