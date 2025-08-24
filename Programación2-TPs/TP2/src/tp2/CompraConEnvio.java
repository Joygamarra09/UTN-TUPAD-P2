package tp2;

import java.util.Scanner;

public class CompraConEnvio {

    // a. Calcula el costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        double tarifaPorKg;

        // Convertimos la zona a minúsculas para evitar errores por mayúsculas
        zona = zona.toLowerCase();

        if (zona.equals("nacional")) {
            tarifaPorKg = 5.0;
        } else if (zona.equals("internacional")) {
            tarifaPorKg = 10.0;
        } else {
            System.out.println("Zona inválida. Usando tarifa nacional por defecto.");
            tarifaPorKg = 5.0;
        }

        return peso * tarifaPorKg;
    }

    // b. Suma el precio del producto con el costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        // Calcular costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}