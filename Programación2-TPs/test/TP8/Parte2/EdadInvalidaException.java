
package TP8.Parte2;

/**
 *
 * @author Joana Gamarra
 */
public class EdadInvalidaException extends Exception {
    
    // Constructor que acepta un mensaje de error
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    // Constructor sin argumentos
    public EdadInvalidaException() {
        super("La edad ingresada está fuera del rango permitido (0-120).");
    }
}
