package TP3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class SimulacioNaveEspacial {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        NaveEspacial nv = new NaveEspacial();
        //Usar métdos para despegar y avanzar
        nv.despegar();
        nv.avanzar();
        
        //Usar método para recargar combustible, despegar y avanzar
        nv.regargarCombustible(40);
        nv.despegar();
        nv.avanzar();
        
        //Usar método para mostrar estado
        nv.mostrarEstado();
    }
    
}
