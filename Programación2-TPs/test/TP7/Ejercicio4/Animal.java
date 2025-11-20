
package TP7.Ejercicio4;

/**
 *
 * @author Joana Gamarra
 */
public class Animal {
    protected String nombre;

    //Constructor completo
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //Método para simular el sonido de un animal
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    //Método que se utiliza para describir a un animal
    public void describirAnimal() {
        System.out.println("Este es un animal llamado " + nombre);
    }

}
