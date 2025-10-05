
package TP5.Ejercicio6;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Cliente C1 = new Cliente("Laura Bernardez", "3412738907");
        Mesa M1 = new Mesa(1, 4);
        Reserva R1 = new Reserva(LocalDate.of(2028, 9, 28), "20:00 hs", C1, M1);
        
        Cliente C2 = new Cliente("Juan Gomez", "3416789098");
        Mesa M2 = new Mesa(2, 7);
        Reserva R2 = new Reserva(LocalDate.of(2028, 9, 29), "21:30 hs", C2, M2);
        
        Cliente C3 = new Cliente("Elias Blanco", "3417579654");
        Mesa M3 = new Mesa(1, 2);
        Reserva R3 = new Reserva(LocalDate.of(2028, 9, 30), "20:45 hs", C3, M3);
        
        System.out.println(R1.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(R2.toString());
         System.out.println("---------------------------------------------------");
        System.out.println(R3.toString());
    }
    
}
