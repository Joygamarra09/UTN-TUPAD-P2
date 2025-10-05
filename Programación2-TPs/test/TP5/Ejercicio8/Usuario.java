
package TP5.Ejercicio8;

public class Usuario {
    private String nombre;
    private String email;

    //Construcor con validación
    public Usuario(String nombre, String email) {
        if ((nombre != null) && (email != null)){
            this.nombre = nombre;
            this.email = email;
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    //Método toString
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
}
