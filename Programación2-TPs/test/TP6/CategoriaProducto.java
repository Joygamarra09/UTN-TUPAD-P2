
package TP6;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;     

    //Constructor
    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    //Getter
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "\nCategoriaProducto{" 
                + "\n- Numero de la categoria: " + (ordinal()+ 1) + ", "
                + "\n- Nombre: " + name() + ", "
                + "\n- Descripcion: " + descripcion + '}';
    }
    
    
   
     
}

