
package TP5.Ejercicio5;

public class PlacaMadre {
    private String modelo;
    private String chipSet;
    
    //Constructor con validación
    public PlacaMadre(String modelo, String chipSet) {
        if ((modelo != null) && (chipSet != null)){
            this.modelo = modelo;
            this.chipSet = chipSet;
        }
        
    }

    //Getters para cada objeto
    public String getModelo() {
        return modelo;
    }

    public String getChipSet() {
        return chipSet;
    }

    //Método toString
    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipSet=" + chipSet + '}';
    }
    
}
    