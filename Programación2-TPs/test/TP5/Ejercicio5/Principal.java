
package TP5.Ejercicio5;

public class Principal {

    public static void main(String[] args) {
        PlacaMadre PM1 = new PlacaMadre("NovaBoard X790 Pro", "OrionTech Z9X");
        Propietario P1 = new Propietario("Benjamin Vallejos", "32098567");
        Computadora C1 = new Computadora ("Aetheron Systems", "AX15X-9ZQ7-8421-LM39-VTQX", PM1);
        P1.setComputadora(C1);
        C1.setPropietario(P1);
        
        PlacaMadre PM2 = new PlacaMadre("Solstice Hardware", "NebulaCore NX88");
        Propietario P2 = new Propietario("Santiago Romero", "43578908");
        Computadora C2 = new Computadora ("Quantalis Tech", "AQT-Z5X-2025-AR39-PLMX-77VQ", PM2);
        P2.setComputadora(C2);
        C2.setPropietario(P2);
        
        //Se muestra por consola computadora 1 y 2, propietario 1 y 2
        System.out.println(C1);
        System.out.println(P1);
        System.out.println("-----------------------------------");
        System.out.println(C2);
        System.out.println(P2);
        
    }
    
}
