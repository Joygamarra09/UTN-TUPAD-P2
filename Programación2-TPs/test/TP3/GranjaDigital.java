package TP3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class GranjaDigital {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        //Crear dos gallinas
        Gallina g1 = new Gallina(1, 1);
        Gallina g2 = new Gallina(2, 2);
        
        
        //Simular acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();
        
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();
        
        //Mostrar estado final
        System.out.println("Estado final de las gallinas");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
