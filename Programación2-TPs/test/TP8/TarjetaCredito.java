
package TP8;

/**
 *
 * @author Joana Gamarra
 */
public class TarjetaCredito implements PagoConDescuento, Pago{
    //Método sobrescrito para procesar pago
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }

    //Método sobrescrito para aplicar descuento
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento
    }

}
