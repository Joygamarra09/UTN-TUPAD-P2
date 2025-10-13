
package TP6.Ejercicio3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joana Gamarra
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    //Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    //Getters y Setter
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    //Método para agregar curso
    public void agregarCurso(Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
            c.setProfesor(this); //Para sincronizar el otro lado
        }else{
            System.out.println("El curso ingresado ya existe.");
        }
    }
    
    //Método para eliminar curso
    public void eliminarCurso(Curso c){
        if (cursos.remove(c)) {
            c.setProfesor(null);//Rompe la relación
        }
    }
    
    //Método para listar cursos
    public void listarCursos(){
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }      
    }
    
    //Método para mostrar información
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursos.size());
    }


    
    
           
}
