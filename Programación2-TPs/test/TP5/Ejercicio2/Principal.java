
package TP5.Ejercicio2;

public class Principal {

    public static void main(String[] args) {
        Bateria b1 = new Bateria("LithionX Core 4800", 4800);
        Usuario u1 = new Usuario("Joana Gamarra", "42867054");
        Celular c1 = new Celular("358742109384756", "NexoraTech", "Pulse X5", b1);
        
        c1.setUsuario(u1);
        
        Bateria b2 = new Bateria("LithionX Core 6000", 6000);
        Usuario u2 = new Usuario("Alan Gonzalez", "40654896");
        Celular c2 = new Celular("728642909314746", "Alcatel", "Ultra X2", b2);
        
        c2.setUsuario(u2);
        
        System.out.println(c1);
        System.out.println(u1);
        System.out.println("-------------------------------------------");
        System.out.println(c2);
        System.out.println(u2);
        
    }
    
}
