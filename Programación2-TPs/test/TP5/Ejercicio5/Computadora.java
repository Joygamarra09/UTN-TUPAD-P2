

package TP5.Ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; //Relación de composición
    private Propietario propietario;//Relación bidireccionl
    
    //Constructor con validación
    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        if ((marca != null) && (numeroSerie != null) && (placaMadre != null)){
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = placaMadre;
        }
        
    }

    //Getters para cada objeto
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    //Setter para propietario
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    //Método toString
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario.getNombre() + '}';
    }
    
    
}
