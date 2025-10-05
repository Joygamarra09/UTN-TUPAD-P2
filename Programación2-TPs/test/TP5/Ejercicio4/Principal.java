
package TP5.Ejercicio4;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Banco B1 = new Banco("Banco Gente", "20-123432987-1");
        Cliente C1 = new Cliente("Julia Lomas", "35886021");
        TarjetaDeCredito T1 = new TarjetaDeCredito("1234 5678 9012 3456", LocalDate.of(2028, 9, 25));
        T1.setCliente(C1);
        C1.setTarjetaDeCredito(T1);
        
        System.out.println(T1.toString());
        System.out.println(C1.toString());
    }
    
}
