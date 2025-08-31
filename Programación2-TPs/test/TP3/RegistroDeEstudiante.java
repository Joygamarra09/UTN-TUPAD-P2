package TP3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class RegistroDeEstudiante {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        //Crear un estudiante.
        Estudiante es = new Estudiante();
        
        es.nombre = "Alán";
        es.apellido = "González";
        es.curso = "Base de datos";
        es.calificacion = 8;
        
        //Mostrar la informsción.
        es.mostrarInformacion();
        
        //Subir calificación con método y mostrar cambios.
        es.subirCalificacion(2);
        es.mostrarInformacion();
        
        //Bajar calificación con método y mostrar cambios.
        es.bajarCalificacion(3);
        es.mostrarInformacion();
    }
    
}
