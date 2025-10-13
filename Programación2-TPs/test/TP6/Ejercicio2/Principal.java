
package TP6.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Joana Gamarra
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        System.out.println("------------------------");
        
        // 2. Crear autores
        Autor a1 = new Autor("A001", "Fulanito Detal", "Colombiana");
        Autor a2 = new Autor("A002", "Mia Diamante", "Británica");
        Autor a3 = new Autor("A003", "Lisa Simpsons", "Estadounidense");
        
        System.out.println("------------------------");
        
        // 3. Agregar libros
        biblioteca.agregarLibro("L001", "En busca de mi yo", 2020, a1);
        biblioteca.agregarLibro("L002", "Los besos que no nos dimos", 2013, a2);
        biblioteca.agregarLibro("L003", "Ficciones", 2018, a3);
        biblioteca.agregarLibro("L004", "El cactus", 2021, a3);
        biblioteca.agregarLibro("L005", "El chico silencioso", 2017, a2);
        
        System.out.println("------------------------");
        
        // 4. Listar todos los libros
        System.out.println("Libros en la biblioteca: ");
        biblioteca.listarLibros();
        
        System.out.println("------------------------");
        
        // 5. Buscar libro por isbn
        System.out.println("Ingresa un ISBN para buscar: ");
        String isbnBuscado = scanner.nextLine();
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
        if (encontrado != null) {
            System.out.println("Libro encontrado: ");
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }
        
        System.out.println("------------------------");
        
        // 6. Filtrar libros por año
        System.out.print("Ingresá un año para filtrar libros: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        System.out.println("Libros publicados en " + anio + ":");
        for (Libro l : biblioteca.filtrarLibroPorAnio(anio)) {
            l.mostrarInfo();
            System.out.println("-----");
        }
        
        System.out.println("------------------------");
        
        // 7. Eliminar un libro por ISBN
        System.out.print("Ingresá un ISBN para eliminar: ");
        String isbnEliminar = scanner.nextLine();
        if (biblioteca.eliminarLibro(isbnEliminar)) {
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No se encontró el libro.");
        }

        System.out.println("------------------------");
        
        // 8. Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        System.out.println("------------------------");
        
        // 9. Mostrar autores disponibles
        System.out.println("Autores disponibles en la biblioteca:");
        biblioteca.mostrarAutorDisponible();

        scanner.close();




    }
    
}
