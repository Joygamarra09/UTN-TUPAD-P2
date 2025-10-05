
package TP5.Ejercicio10;

import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;
    //Constructor
    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    //Getters
    public String getCodigo() {
        return codigo;
    }

    public LocalDate getUltimaModificacion() {
        return ultimaModificacion;
    }
    //Método toString
    @Override
    public String toString() {
        return "ClaveSeguridad{" + "Codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }                      
}
