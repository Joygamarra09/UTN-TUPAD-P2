package TP5.Ejercicio13;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Andres Flores", "andres@email.com");
        GeneradorQR generador = new GeneradorQR();

        generador.Generar("ABC123XYZ", usuario);

    }
    
}
