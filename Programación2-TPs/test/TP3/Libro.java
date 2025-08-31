package TP3;

public class Libro {
    //Atributos.
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //Crear constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    //Crear getter info
    public void getInfo(){
        System.out.println("Nombre del libro: " + titulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
    //Crear getter titulo
    public String getTitulo() {
        return titulo;
    }
    
    //Crear setter titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    //Crear getter autor
    public String getAutor() {
        return autor;
    }
    
    //Crear setter autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Crear getter anioPublicacion
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    //Crear setter anioPublicacion
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
        }
    }
    
    
}
