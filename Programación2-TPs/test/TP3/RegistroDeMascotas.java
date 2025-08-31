
package TP3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class RegistroDeMascotas {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        //Crear una mascota
        Mascotas m1 = new Mascotas();
        m1.nombre = "Nina";
        m1.especie = "Gato";
        m1.edad = 9;
        
        //Mostrar información incial llamando al método mostrarInfo.
        System.out.println("Iformación inicial:");
        m1.mostrarInfo();
        
        //Mostrar información un año después llamando al método cumplirAnios.
        System.out.println("Información un año después:");
        m1.cumpliranios();
        
    }
    
}
