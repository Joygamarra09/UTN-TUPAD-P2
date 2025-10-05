package TP5.Ejercicio12;

public class Calculadora {

    public void Calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto base...");
        System.out.println(impuesto.toString());

        double iva = impuesto.getMonto() * 0.21;
        double total = impuesto.getMonto() + iva;

        System.out.println("IVA (21%): $" + iva);
        System.out.println("CalculadoraTotal con IVA: $" + total);
    }

}
