
package TP5.Ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    //Constructor
    public Titular(String nombre, String dni) {
        if ((nombre != null) && (dni != null)){
            this.nombre = nombre;
            this.dni = dni;
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    //Setter para cuenta
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    //Método toString
    @Override
    public String toString() {
        return "Titular{" + "Nombre=" + nombre + ", DNI=" + dni + ", Cuenta=" + cuenta + '}';
    }
    
    
}
