
package TP7.Ejercicio2;

/**
 *
 * @author Joana Gamarra
 */
public class Circulo extends Figura{
    private double radio;

    //Constructor completo con super
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    //Método para calcular el área de un círculo sobrescrito
    @Override
    public void calcularArea() {
        System.out.println("El area del " + 
                nombre + " es: " + (radio * 3.14));
    }

}
