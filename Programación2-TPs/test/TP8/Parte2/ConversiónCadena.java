
package TP8.Parte2;

import java.util.Scanner;

/**
 *
 * @author Joana Gamarra
 */
public class ConversiónCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Debe ser un número entero.");
        }

    }
    
}
