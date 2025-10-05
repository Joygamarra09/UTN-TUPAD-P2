
package TP5.Ejercicio7;

public class Motor {
    private String tipo;
    private String numeroSerie;

    //Constructor con validación
    public Motor(String tipo, String numeroSerie) {
        if ((tipo != null) && (numeroSerie != null)){
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
       
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    //Método toString
    @Override
    public String toString() {
        return "Motor{" + "-tipo=" + tipo + ", \n-numeroSerie=" + numeroSerie + '}';
    }
    
    
    
}
