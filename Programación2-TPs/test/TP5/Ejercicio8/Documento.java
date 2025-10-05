
package TP5.Ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    //Constructor con validación
    public Documento(String titulo, String contenido, FirmaDigital firma) {
        if ((titulo != null) && (contenido != null) && (firma != null)){
            this.titulo = titulo;
            this.contenido = contenido;
            this.firma = firma;
        }
    }
    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public FirmaDigital getFirma() {
        return firma;
    }
    //Método toString
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
}
