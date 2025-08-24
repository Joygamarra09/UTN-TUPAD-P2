
package tp2;

import java.util.Scanner;


public class Año_Bisiesto {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        
        //Se solicita al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        anio = input.nextInt();
        
        //Berificación de año bisiesto.
        if ((anio % 4 == 0 & anio % 100 != 0) || (anio % 400 == 0 )){
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
            
    }
    
}
