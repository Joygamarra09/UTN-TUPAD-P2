
package tp2;

import java.util.Scanner;


public class Cont_Posit_Neg_Ceros {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarara variables.
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        //Crear ciclo For con If - Else If anidado.
        for (int cont = 1; cont <= 10; cont ++){
            System.out.print("Ingrese el número " + cont + ": ");
            int numero = input.nextInt();
            
            //Iniciar estructura condicional.
            if(numero > 0){
                positivos += 1;
            }else if(numero < 0){
                negativos += 1;
            }else{
                ceros += 1;
            }
           
        }
        
        //Mostrar por consola el resultado.
        System.out.println("Cantidad de números positivos: " + positivos + ", negativos, " + negativos + ", ceros: " + ceros );
        
    }
    
}
