
package TP8;

/**
 *
 * @author Joana Gamarra
 */
public class MainEcommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joana");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 50000));
        pedido.agregarProducto(new Producto("Teclado", 80000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        PagoConDescuento pago = new TarjetaCredito();
        double totalConDescuento = ((TarjetaCredito) pago).aplicarDescuento(total);
        pago.procesarPago(totalConDescuento);

        pedido.cambiarEstado("En preparación");

    }
    
}
