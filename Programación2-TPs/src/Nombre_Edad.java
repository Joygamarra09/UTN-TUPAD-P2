
import java.util.Scanner;


public class Nombre_Edad {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaración de variables
        String nombre;
        int edad;
        
        //Se pide al usuario que ingrese su nombre y se asigna a la variable.
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        //Se pide al usuario que ingrese su edad y se asigna a la variable.
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        //Se imprimen por pantalla las variables
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + " años.");
    }
    
}
