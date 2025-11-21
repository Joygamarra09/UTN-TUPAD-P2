
package TP8.Parte2;

import java.util.Scanner;

/**
 *
 * @author Joana Gamarra
 */
public class MainValidacion {

    // Método que lanza la excepción (LÓGICA DE NEGOCIO)
        public static void validarEdad(int edad) throws EdadInvalidaException {
            // La condición para lanzar la excepción 
            if (edad < 0 || edad > 120) {
                // Lanzamiento de la excepción con 'throw' 
                throw new EdadInvalidaException(
                    "La edad " + edad + " no es válida. Debe estar entre 0 y 120."
                );
            }
            System.out.println("Edad validada correctamente: " + edad);
        }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        
        try {
            int edad = scanner.nextInt();
            
            // Llamada al método que puede fallar, dentro del 'try'
            validarEdad(edad);
            
        } catch (EdadInvalidaException e) {
            // Captura de la excepción personalizada [cite: 39]
            System.err.println("Error: " + e.getMessage()); 
            
        } catch (java.util.InputMismatchException e) {
            // Manejo de error si el usuario no ingresa un número
            System.err.println("Error: Por favor, ingrese un valor numérico.");
        } finally {
            scanner.close();
        }
    }
    
}
