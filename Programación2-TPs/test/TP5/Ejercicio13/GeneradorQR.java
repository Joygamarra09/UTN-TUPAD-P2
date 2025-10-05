package TP5.Ejercicio13;

public class GeneradorQR {
     public void Generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // Dependencia de creación
        System.out.println("Generado: " + codigo.toString());
        // No se guarda como atributo, solo se usa en este método
    }

}
