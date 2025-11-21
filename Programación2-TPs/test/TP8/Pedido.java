
package TP8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joana Gamarra
 */
public class Pedido implements Pagable{
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    //Constructor completo
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    //Método para agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    //Método sobrescrito para calcular total
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    //Método para cambiar estado
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioEstado(nuevoEstado);
    }

}
