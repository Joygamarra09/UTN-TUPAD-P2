
package tp2;

import java.util.Scanner;

public class Clasificador_edad {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Solicitar al usuario que ingrese su edad.
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        
        if (edad < 12){
            System.out.println("Eres un/a niño/a.");
        }else if ((edad >= 12) & (edad <= 17)){
            System.out.println("Eres un/a adolescente.");
        }else if ((edad >= 15) & (edad <= 59)){
            System.out.println("Eres un/a adulto/a.");
        }else if (edad >= 60){
            System.out.println("Eres un/a adulto/a mayor.");
        }else {
            System.out.println("Valor ingresado inválido. Debe ser positivo.");
        }
        
    }
}
