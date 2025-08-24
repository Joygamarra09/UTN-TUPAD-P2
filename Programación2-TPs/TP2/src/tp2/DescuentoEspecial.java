
package tp2;

import java.util.Scanner;



public class DescuentoEspecial {

    // Variable global (de clase)
    static double descuentoEspecial = 0.10;

    // Método que calcula el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Calcular y mostrar descuento
        calcularDescuentoEspecial(precio);
    }
}
