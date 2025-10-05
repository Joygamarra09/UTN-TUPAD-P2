
package TP5.Ejercicio1;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    //Constructor completo
    public Titular(String nombre, String dni, Pasaporte pasaporte) {
        if ((nombre != null)&& (dni != null)){
            this.nombre = nombre;
            this.dni = dni;
            this.pasaporte = pasaporte;
        }
    }
        //Constructor sin pasaporte
    public Titular(String nombre, String dni) {
        if ((nombre != null)&& (dni != null)){
            this.nombre = nombre;
            this.dni = dni;
        }
       
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
  
    
    
}
