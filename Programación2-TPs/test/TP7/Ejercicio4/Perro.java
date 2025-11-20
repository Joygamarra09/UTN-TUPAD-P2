
package TP7.Ejercicio4;

/**
 *
 * @author Joana Gamarra
 */
public class Perro extends Animal{
    
    //Constructor completo con super
    public Perro(String nombre) {
        super(nombre);
    }

    //Método sobrescrito para hacer sonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Guau guau");
    }

}
