
package tp2;

public class RecursividadPrecios {

    // Declarar e inicializar el array
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

    // b. Función recursiva para mostrar precios originales
    public static void mostrarPreciosOriginales(int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosOriginales(indice + 1);
        }
    }

    // d. Función recursiva para mostrar precios modificados
    public static void mostrarPreciosModificados(int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosModificados(indice + 1);
        }
    }

    public static void main(String[] args) {
        // Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(0);

        // c. Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        // Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(0);
    }
}
