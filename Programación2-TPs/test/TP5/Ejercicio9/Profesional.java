
package TP5.Ejercicio9;

public class Profesional {
    private String nombre;
    private String especialidad;
    //Constructor con validación
    public Profesional(String nombre, String especialidad) {
        if ((nombre != null) && (especialidad != null)){
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    //Método toString
    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}
