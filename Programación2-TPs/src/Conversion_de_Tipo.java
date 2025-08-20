
import java.util.Scanner;

public class Conversion_de_Tipo {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 / num2;

        System.out.println("Resultado (int): " + resultado);
    }
    
}
