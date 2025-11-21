
package TP8.Parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Joana Gamarra
 */
public class MainTryWithResources {

    public static void leerArchivo(String nombreArchivo){
        
        // Declaración del recurso (BufferedReader) dentro del try
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Iniciando lectura del archivo: " + nombreArchivo);
            String linea;
            
            // Lectura del archivo linea por linea
            while ((linea = br.readLine()) != null) {
                System.out.println(">" + linea);
            }

        // 3. Bloque catch para manejar IOException. Se coloca inmediatamente después del try.
        } catch (IOException e) { 
            // Las líneas de impresión del error DEBEN estar dentro del catch
            System.err.println("Error: Ocurrió un problema de entrada/salida.");
            System.err.println("Detalle del error: " + e.getMessage());
        } 
        
        // 4. El bloque 'finally' no es necesario para cerrar el recurso.
    }
    public static void main(String[] args) {
        // Al probar con un archivo que probablemente no exista (lanzará IOException/FileNotFoundException)
        leerArchivo("C:\\Users\\USER\\OneDrive\\Documentos\\NetBeansProjects\\UTN-TUPAD-P2\\Programación2-TPs\\test\\TP8\\Parte2\\mi_archivo_de_prueba.txt");
    }
    
}
