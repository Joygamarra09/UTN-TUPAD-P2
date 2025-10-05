
package TP5.Ejercicio1;

public class Foto {
    private String imagen;
    private String formato;

    public Foto(String foto, String formato) {
        this.imagen = foto;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
 
}
