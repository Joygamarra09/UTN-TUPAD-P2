
package TP5.Ejercicio10;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        ClaveSeguridad clave1 = new ClaveSeguridad("Lola4561", LocalDate.of(2025,10,03));
        Titular t1 = new Titular("Lola Diamante", "44976453");
        CuentaBancaria cuenta1 = new CuentaBancaria("0170123456789012345678", 350000.0, clave1);
        cuenta1.setTitular(t1);
        t1.setCuenta(cuenta1);
        
        ClaveSeguridad clave2 = new ClaveSeguridad("Mario25Lomas", LocalDate.of(2025,10,01));
        Titular t2 = new Titular("Mario Lomas", "35345239");
        CuentaBancaria cuenta2 = new CuentaBancaria("2850129876543210987654", 730000.0, clave2);
        cuenta2.setTitular(t2);
        t2.setCuenta(cuenta2);
        
        System.out.println("Datos de su Cuenta Bancaria: \n" + cuenta1);
        System.out.println("Datos de su Cuenta Bancaria: \n" + cuenta2);
        
        
    }
    
}
