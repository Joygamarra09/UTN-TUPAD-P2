
package TP5.Ejercicio9;

public class Paciente {
    private String nombre;
    private String obraSocial;
    //Constructor con validación
    public Paciente(String nombre, String obraSocial) {
        if ((nombre != null) && (obraSocial != null)){
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    //Método toString
    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
}
