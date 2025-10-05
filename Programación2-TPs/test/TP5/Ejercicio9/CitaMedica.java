
package TP5.Ejercicio9;

import java.time.LocalDate;

public class CitaMedica {
    private LocalDate fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    //Constructor con validación
    public CitaMedica(LocalDate fecha, String hora) {
        if ((fecha != null) && (hora != null)){
            this.fecha = fecha;
            this.hora = hora;
        }
    }
    //Getters
    public LocalDate getFecha() {
        return fecha;
    }
   
    public String getHora() {
        return hora;
    }
  
    public Paciente getPaciente() {
        return paciente;
    }
   
    public Profesional getProfesional() {
        return profesional;
    }
    //Setters para paciente y profesional
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
   
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    //Método toString
    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", \nprofesional=" + profesional + '}';
    }
}
