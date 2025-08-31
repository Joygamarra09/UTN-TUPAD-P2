package TP3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EncapsulamientoLibro {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        
        //Crear libro
        Libro libro1 = new Libro("Una noche azúl", "Noah Smith", 2020);
        
        //Llamar a los métodos
        libro1.getInfo();
        
        libro1.setAnioPublicacion(-222);
        libro1.getInfo();
        
        libro1.setAnioPublicacion(2024);
        libro1.getInfo();
    }
    
}
