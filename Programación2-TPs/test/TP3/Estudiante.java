package TP3;
//Crear clase Estudiante.
public class Estudiante {
   //Atributos
   String nombre;
   String apellido;
   String curso;
   int calificacion;
   
   //Crear método para mostrar información.
   public void mostrarInformacion(){
       System.out.println("Nombre y apellido: " + nombre + " " + apellido + ", curso: " + curso + ", calificación: " + calificacion);
   }
   
   //Crear método para subir calificación.
   public void subirCalificacion(int puntos){
       if (puntos > 0) {
           calificacion += puntos;
       }
   }
   
   //Crear método para bajar calificación.
   public void bajarCalificacion(int puntos){
       if (puntos < calificacion) {
           calificacion -= puntos;
       }
   }
}
