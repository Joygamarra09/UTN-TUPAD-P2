
package TP5.Ejercicio8;

import java.time.LocalDate;



public class Principal {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lara Paz", "laraPaz04@gmail.com");
        FirmaDigital firma = new FirmaDigital("7a3f9c1e", LocalDate.of(2025, 9, 23));
        Documento doc = new Documento("Contrato de Reserva", "Contenido legal del contrato...", firma);
        
        System.out.println(u1);
        System.out.println("----------------------------");
        System.out.println(firma);
        System.out.println("----------------------------");
        System.out.println(doc);
        
    }
    
}
