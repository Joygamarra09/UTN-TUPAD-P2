
package TP7.Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Joana Gamarra
 */
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Toby"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // llamada polimórfica
            System.out.println("---------------------------");
        }

    }
    
}
