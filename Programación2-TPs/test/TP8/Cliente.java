
package TP8;

/**
 *
 * @author Joana Gamarra 
 */
public class Cliente implements Notificable {
    private String nombre;

    //Constructor completo
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    //Método sobrescrito para notificar cambio de estado
    @Override
    public void notificarCambioEstado(String estado) {
        System.out.println("Cliente " + nombre + " fue notificado: Estado del pedido -> " + estado);
    }

}
