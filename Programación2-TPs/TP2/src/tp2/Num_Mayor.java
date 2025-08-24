package tp2;

import java.util.Scanner;


public class Num_Mayor {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
        //Declaración de variables.
        int num1, num2, num3, mayor;

        //Pedir al usuario los tres números y asignar a cada variable.
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = input.nextInt();
    
        //Estructura de control if-else.
         if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

    
    
    }
    
}
