package TP6;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria; //Asociación unidireccional

    //Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    
    //Método toString
    @Override
    public String toString() {
        return "\nProducto{" + "\n - id: " + id + ",\n - Nombre: " + nombre + ",\n - Precio: " + precio + ",\n - Cantidad: " + cantidad + ",\n - Categoria: " + categoria + '}';
    }

    //Método para mostrar información
    public void mostrarInfo() {
    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: $" + precio);
    System.out.println("Cantidad en stock: " + cantidad);
    System.out.println("Categoría: " + categoria + " - " + categoria.getDescripcion());
}
    
    //Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
}
