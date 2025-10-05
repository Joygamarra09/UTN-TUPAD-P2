
package TP5.Ejercicio3;

public class Libro {
   private String titulo;
   private String isbn;
   private Autor autor; //Relación de asociación unidireccional
   private Editorial editorial; //Relación de agregación

    //Constructor
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    //Getter para cada objeto
    public String getLibro() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
   
   
   
}
