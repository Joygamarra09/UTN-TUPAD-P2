
package TP6.Ejercicio3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joana Gamarra
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    //Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    //Método para agregar un profesor
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    //Método para agregar un curso
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }
    
    //Método para asignar un profesor a un curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }
    
    //Método para listar los profesores
     public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("-----");
        }
    }

     //Método para listar los cursos
    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println("-----");
        }
    }

    //Método para buscar profesores por su ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    //Método para buscar cursos por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    //Método para eliminar curso
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c); // rompe relación
            }
            cursos.remove(c);
        }
    }

    //Método para eliminar profesor
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : p.getCursos()) {
                c.setProfesor(null); // dejar sin profesor
            }
            profesores.remove(p);
        }
    }

    //Método para mostrar un reporte 
    public void reporteCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println("- " + p.getId() + " - " + p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }


}
