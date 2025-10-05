
package TP5.Ejercicio11;

public class Cancion {
    
    private String titulo;
    private Artista artista; // Asociación unidireccional

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + artista.toString();
    }
}

