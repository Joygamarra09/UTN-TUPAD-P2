
package TP5.Ejercicio9;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Silvina Diaz", "Avalian");
        Profesional prof1 = new Profesional("Maria Eugenia Smith", "Ginecologia");
        CitaMedica cita1 = new CitaMedica(LocalDate.of(2025,10,01), "08:00 hs");
        cita1.setPaciente(p1);
        cita1.setProfesional(prof1);
        
        Paciente p2 = new Paciente("Graciela Luna", "OSDE");
        Profesional prof2 = new Profesional("Elisa Cordero", "Traumatologia");
        CitaMedica cita2 = new CitaMedica(LocalDate.of(2025,10,9), "10:30 hs");
        cita2.setPaciente(p2);
        cita2.setProfesional(prof2);
        
        System.out.println(cita1);
        System.out.println("--------------------------------------");
        System.out.println(cita2);
    }
    
}
