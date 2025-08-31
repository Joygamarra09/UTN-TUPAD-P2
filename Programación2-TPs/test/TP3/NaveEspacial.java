package TP3;

public class NaveEspacial {
    //Atributos
    String nombre = "Kepler-X";
    int combustible = 0;
    
    //Crear método mostrarEstado
    public void mostrarEstado(){
        System.out.println("Nombre de Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
    
    //Crear método despegar
    public void despegar(){
        if (combustible > 0) {
            System.out.println("Iniciando despegue en 3, 2, 1...");
            System.out.println("La Nave " + nombre + " ha despegado.");
        }else{
            System.out.println("Combustible insuficiente. Debe recargar combustible para despegar.");
        }
    }
    
    //Crear método avanzar
    public void avanzar(){
        if (combustible > 0) {
            System.out.println("La Nave " + nombre + " ha avanzado hacia el destino seleccionado.");
        }else{
            System.out.println("Combustible insuficiente. Debe recargar combustible para avanzar.");
        }
    }
    
    //Crear método recargarCombustible
    public void regargarCombustible(int recargarLitros){
        if (combustible < 50) {
            combustible += recargarLitros;
            if(combustible > 50){
                combustible = 50;
                System.out.println("La Nave ha llegado a su tope de combustible. Combustible total: 50 unidades.");
            }
        }
    }
}
