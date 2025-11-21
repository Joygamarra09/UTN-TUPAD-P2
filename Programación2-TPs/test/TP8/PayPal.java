
package TP8;

/**
 *
 * @author Joana Gamarra
 */
public class PayPal implements Pago{
    //Método sobrescrito para procesar un pago
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado: $" + monto);
    }

}
