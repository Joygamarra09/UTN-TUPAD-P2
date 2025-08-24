
package tp2;

import java.util.Scanner;


public class ValidadorNota {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar variable.
        int nota;
        
        //Iniciar ciclo Do-While.
        do {
            System.out.print("Ingrese una nota(0-10): ");
            nota = input.nextInt();
            //Iniciar estructura condicional If.
            if (nota < 0 || nota > 10){
            System.out.println("Error. Nota invállida.");
            } 
        }while (nota < 0 || nota > 10);
        
        //Mostrar por consola un mensaje.
        System.out.println("Nota guardada correctamente.");
    }
  
}
