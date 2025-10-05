
package TP5.Ejercicio12;

public class Principal {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Martín Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.0);
        Calculadora calculadora = new Calculadora();
        impuesto.setContribuyente(contribuyente);
        calculadora.Calcular(impuesto);

    }
    
}
