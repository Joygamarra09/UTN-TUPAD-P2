
package TP5.Ejercicio7;

public class Conductor {
    private String nombre;
    private boolean licencia;
    private Vehiculo vehiculo;
    
    //Constructor 
    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "-nombre=" + nombre + ", \n-licencia=" + licencia + ", "
                + "\n-vehiculo=" + vehiculo + '}';
    }
    
    
    
}
