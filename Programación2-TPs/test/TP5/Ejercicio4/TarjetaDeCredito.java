
package TP5.Ejercicio4;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
}
