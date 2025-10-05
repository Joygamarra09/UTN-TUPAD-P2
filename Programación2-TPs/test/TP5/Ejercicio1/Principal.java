
package TP5.Ejercicio1;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        //Primer pasaporte creado
        Foto f1 = new Foto("imagen123.jpg", "JPEG");
        Titular t1 = new Titular("Joana Gamarra", "42867054");
        Pasaporte pas1 = new Pasaporte("PA-AR-2025-849372", LocalDate.of(2025, 9, 25), f1, t1);
        pas1.setTitular(t1);
        t1.setPasaporte(pas1);
        
        
        //Segundo pasaporte creado
        Foto f2 = new Foto("imagen321.jpg", "JPEG");
        Titular t2 = new Titular("Federico Sardi", "37837094");
        Pasaporte pas2 = new Pasaporte("PA-AR-2021-099572", LocalDate.of(2021, 3, 20), f2, t2);
        pas2.setTitular(t2);
        t2.setPasaporte(pas2);
        
        System.out.println("----------------------------------");
        System.out.println(t1.toString());
        System.out.println(pas1.toString());
        System.out.println("----------------------------------");
        System.out.println(t2.toString());
        System.out.println(pas2.toString());

        
    }
    
}
