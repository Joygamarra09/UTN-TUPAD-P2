
package TP5.Ejercicio6;

public class Mesa {
    private int numero;
    private int capacidad;

    //Constructor con validación
    public Mesa(int numero, int capacidad) {
        if ((numero > 0) && (capacidad > 0)){
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }
    //Getters para cada objeto
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //Método toString
    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
