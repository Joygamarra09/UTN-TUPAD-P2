
package TP6.Ejercicio2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joana Gamarra
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros; //Relación de composición 1 a N

    //Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    //Método para agregar un libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("El libro se ha guardado correctamente.");
    }
    
    //Método para listar libros
    public void listarLibros(){
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("----");
        }
    }
    
    //Método para buscar un libro por isbn
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    //Método para eliminar un libro
    public boolean eliminarLibro(String isbn){
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }
    
    //Método para obtener la cantidad total de libros en la biblioteca
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    //Método para filtrar libros por año
    public List<Libro> filtrarLibroPorAnio(int anio){
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    
    //Método para mostrar autores disponibles
    public void mostrarAutorDisponible(){
        List<String> autoresUnicos = new ArrayList<>();
        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresUnicos.contains(nombreAutor)) {
                autoresUnicos.add(nombreAutor);
                System.out.println("- " + nombreAutor);
            }
        }
    }
    
}
