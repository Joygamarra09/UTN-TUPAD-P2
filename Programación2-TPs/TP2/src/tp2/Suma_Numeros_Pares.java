
package tp2;

import java.util.Scanner;

public class Suma_Numeros_Pares {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declaración y asignación de valor a variables.
        int numero = 1;
        int suma = 0;
        
        //Crear ciclo while y estructura condicional if.
        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
            if (numero % 2 == 0){
                suma += numero;
            }
        
        }
        //Imprimir por consola la suma.
        System.out.println("La suma de los números pares es: " + suma);
        
    }
    
}
