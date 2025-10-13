
package TP6;

import java.util.Scanner;

/**
 *
 * @author Joana Gamarra
 */
public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        
         // 1. Crear productos y agregarlos al inventario
        inventario.agregarProducto(new Producto("P001", "Arroz", 1500.0, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Celular", 500000.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 18000.0, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla", 32000.0, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Auriculares", 29000.0, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P006", "Garbanzos", 2000.0, 50, CategoriaProducto.ALIMENTOS));
        
         System.out.println("------------------------");
        
        //2. Listar todos los productos
        System.out.println("Listado de productos del inventario: ");
        inventario.listarProducto();
        
        System.out.println("------------------------");
        
        //3. Busqueda de producto por id
        System.out.println("Búsqueda por id: ");
        inventario.buscarProductoPorId("P005");

        System.out.println("------------------------");
        
        //4. Filtrar por categoría
        System.out.println("Filtrado por categoría: ");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
         System.out.println("------------------------");
        
        //5. Eliminar productor por su ID
//        System.out.println("Producto eliminado: ");
//        inventario.eliminarProducto("P006"); 
//        System.out.println("Productos disponibles luego de la eliminación: ");
//        inventario.listarProducto();
              
        System.out.println("------------------------");
         
        //6. Actualizar el stock de un producto existente
        System.out.println("Ingrese el id y la cantidad para actualizar stock: ");
        inventario.actualizarStock("P004", 34);
        
        System.out.println("------------------------");
        
        //7. Mostrar el total del stock
        System.out.println("Total del stock que se encuentra disponible: " + inventario.obtenerTotalStock());
        
        System.out.println("------------------------");
         
        //8. Producto con mayor stock
        System.out.println("Producto con mayor stock: ");
        inventario.obtenerProductoConMayorStock();
        
        System.out.println("------------------------");
         
        //9. Filtrar productos por precio
        System.out.println("Ingrese los precios minimos y máximos entre los que desea filtrar: ");
        inventario.filtrarProductosPorPrecio(10000.0, 40000.0);
        
        System.out.println("------------------------");
         
        //10. Mostrar categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();

    }
    
}
