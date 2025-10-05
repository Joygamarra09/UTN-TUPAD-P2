
package TP5.Ejercicio8;

import java.time.LocalDate;

public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;

    public FirmaDigital(String codigoHash, LocalDate fecha) {
        if ((codigoHash != null) && (fecha != null)){
           this.codigoHash = codigoHash;
           this.fecha = fecha; 
        }
    }

    //Getters
    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    //Método toString
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
    }
}
