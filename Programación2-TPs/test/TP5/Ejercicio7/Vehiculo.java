
package TP5.Ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    //Constructor con validación
    public Vehiculo(String patente, String modelo, Motor motor) {
        if ((patente != null) &&(modelo != null) && (motor != null)){
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
        }
    }

    //Getters 
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    //Setters para motor y conductor
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    //Método toString
    @Override
    public String toString() {
        return "Vehiculo{" + "-patente=" + patente + ", \n-modelo=" + modelo + ", \n-motor=" + motor + ", \n-conductor=" + conductor.getNombre() + '}';
    }
    
}
