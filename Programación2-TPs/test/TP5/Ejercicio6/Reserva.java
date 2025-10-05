
package TP5.Ejercicio6;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private String hora;
    private Cliente cliente; //Relación de Asociación simple unidireccional
    private Mesa mesa; //Relación de Agregación
    
    //Constructor con validación
    public Reserva(LocalDate fecha, String hora, Cliente cliente, Mesa mesa) {
        if ((fecha != null) && (hora != null) && (cliente != null) && (mesa != null)){
            this.fecha = fecha;
            this.hora = hora;
            this.cliente = cliente;
            this.mesa = mesa;
        }
    }

    //Getters para objeto
    public LocalDate getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    //Setter para Cliente y Mesa
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    //Método toString
    @Override
    public String toString() {
        return "-Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", \n-cliente=" + cliente + ", \n-mesa=" + mesa + '}';
    }
   
    
    
    
}
