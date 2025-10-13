
package TP6.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Joana Gamarra
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universidad universidad = new Universidad("UTN Rosario");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Gómez", "Programación");
        Profesor p3 = new Profesor("P003", "Lucía Fernández", "Bases de Datos");
        
        // 2. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Java Intermedio");
        Curso c3 = new Curso("C103", "SQL y Modelado");
        Curso c4 = new Curso("C104", "Estructuras de Datos");
        Curso c5 = new Curso("C105", "Lógica Computacional");
        
        // 3. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);
        
        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);
        
        
        // 4. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C101", "P001");
        universidad.asignarProfesorACurso("C102", "P002");
        universidad.asignarProfesorACurso("C103", "P003");
        universidad.asignarProfesorACurso("C104", "P002");
        universidad.asignarProfesorACurso("C105", "P001");

         System.out.println("------------------------");
        
        // 5. Listar cursos con su profesor
        System.out.println("Cursos con sus profesores:");
        universidad.listarCursos();
        
         System.out.println("------------------------");
        
         // 6. Listar profesores con sus cursos
        System.out.println("Profesores con sus cursos:");
        universidad.listarProfesores();

        System.out.println("------------------------");
        
        // 7. Cambiar el profesor de un curso
        System.out.println("Reasignando profesor de C104 a P003...");
        universidad.asignarProfesorACurso("C104", "P003");

         System.out.println("------------------------");
        
        // Verificar sincronización
        universidad.listarProfesores();

         System.out.println("------------------------");
        
        // 8. Eliminar un curso y verificar que se quita del profesor
        System.out.println("Eliminando curso C102...");
        universidad.eliminarCurso("C102");

        universidad.listarProfesores();

         System.out.println("------------------------");
        
        // 9. Eliminar un profesor y dejar sus cursos sin asignación
        System.out.println("Eliminando profesor P001...");
        universidad.eliminarProfesor("P001");

        universidad.listarCursos();

         System.out.println("------------------------");
        
        // 10. Reporte de cantidad de cursos por profesor
        System.out.println("Reporte de cursos por profesor:");
        universidad.reporteCursosPorProfesor();

        scanner.close();
        
         System.out.println("------------------------");
    }

    
}
