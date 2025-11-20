
package TP7.Ejercicio2;

/**
 *
 * @author USER
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    //Constructor completo con super
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    //Método para calcular el área de un rectángulo sobrescrito
    @Override
    public void calcularArea() {
        System.out.println("El area del " + nombre + " es: " +
                (base * altura));
    }
}
