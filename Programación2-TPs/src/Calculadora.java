
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        char operador;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        System.out.print("Ingrese la operación que desea realizar \"(+ para Suma), (- para Resta), (* para Multiplicación), (/ para División)\":  ");
        operador = input.next().charAt(0);
        
        switch (operador){
            case '+':
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("El resultado de la resta es: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0){
                System.out.println("El resultado de la resta es: " + (num1 / num2));
                } else {
                    System.out.println("Error. No se puede dividir por 0");
                }
                break;
            default:
                System.out.println("Operador inválido.");

        }       
    }
    
}
