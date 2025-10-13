
package TP6.Ejercicio3;

/**
 *
 * @author Joana Gamarra
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    //Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //Getters y Setter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this); // quitar del anterior
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this); // agregar al nuevo
        }

    }
    
    //Método para mostrar información del curso
    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getId() : "Sin asignar"));
    }
}
