
package TP7.Ejercicio4;

/**
 *
 * @author Joana Gamarra
 */
public class Vaca extends Animal{
    
    //Constructor con super
    public Vaca(String nombre) {
        super(nombre);
    }

    //Método sobrescrito para hacer sonido de animal
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Muuuuu");
    }

}
