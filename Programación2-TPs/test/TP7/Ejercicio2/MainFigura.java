
package TP7.Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Joana Gamarra
 */
public class MainFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        Circulo cir1 = new Circulo("Circulo 1", 5.0);
        Circulo cir2 = new Circulo ("Circulo 2", 10.0);
        Rectangulo rect1 = new Rectangulo("Rectangulo 1", 4.0, 6.0);
        Rectangulo rect2 = new Rectangulo("Rectángulo 2", 8.0, 15.0);

        figuras.add(cir1);
        figuras.add(cir2);
        figuras.add(rect1);
        figuras.add(rect2);
        
        
        
        for (Figura f : figuras) {
            f.calcularArea();
        }

    }
    
}
