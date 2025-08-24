
package tp2;

import java.util.Scanner;

public class Calculadora_Descuento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double descuento;
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        System.out.print("Ingrese la categoría del producto: ");
        char categoria = input.next().charAt(0);
        
        switch (categoria){
            case 'A':
                descuento = 0.10; //10%
                System.out.println("Este producto vale $" + precio + " y tiene un descuento de " );
        }
        
    }
    
}
