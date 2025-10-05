package TP5.Ejercicio1;

import java.time.LocalDate;

public class Pasaporte {
   private String numero;
   private LocalDate fechaEmision;
   private Foto foto;
   private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = null;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular.getNombre() + '}';
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    
   
}


