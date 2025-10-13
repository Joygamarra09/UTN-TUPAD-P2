package TP6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Inventario {
    private ArrayList<Producto> productos;

    //Constructor
    public Inventario(ArrayList<Producto> productos) {
        this.productos = new ArrayList<>();
    }

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    
    //Método para agragar un producto
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    //Método para listar productos
    public void listarProducto(){
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    
    //Método para buscar los productos por sus id
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if(p != null && Objects.equals(id, p.getId())){
                System.out.println("El producto: " + p.getNombre() + " pertenece al id que ha ingresado.");
                return p;
            }
        }
        return null;
    }
    
    //Método para eliminar un producto po su id
    public Producto eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);
        if(p != null){
            productos.remove(p);
            return p;
        }else{
            System.out.println("El id ingresado no fué encontrado dentro de la lista de productos.");
        }
        return null;
    }
    
    //Método para actualizar el stock en el inventario
    public void actualizarStock(String id, int nuevaCant){
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCant);
            System.out.println("El stock del producto " + p.getNombre() + " se ha actualizado y ahora es de: " + p.getCantidad());
        }else {
            System.out.println("No se ha encontrado el producto con id " + id);
        }
    }
    
    //Método para filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                System.out.println(p);
            }
        }
    }
    
    //Método para obtener el producto con mayor stock
    public void obtenerProductoConMayorStock(){
        int prodMasStock = -1;
        for (Producto p : productos) {
            if (p.getCantidad() > prodMasStock) {
                prodMasStock = p.getCantidad();
            }
        }
        System.out.println(prodMasStock);
    }
    
    //Método para filtrar productos por su precio
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
    List<Producto> resultado = new ArrayList<>();

    for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            resultado.add(p);
        }
    }

    if (resultado.isEmpty()) {
        System.out.println("No se ha podido encontrar ningún producto en ese rango de precio.");
    } else {
        System.out.println("Productos entre $" + min + " y $" + max + ":");
        for (Producto p : resultado) {
            p.mostrarInfo();
            System.out.println("----");
        }
    }

    return resultado;
}
    
    //Método que permite mostrar las categorías disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.toString());
        }
    }
    
    //Método para obtener el total del stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
}

