package TP3;

public class Mascotas {
    
    //Atributos
    String nombre;
    String especie;
    int edad;
    
    //Método para mostrar información.
    public void mostrarInfo(){
        System.out.println("REGISTRO DE MASCOTAS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    //Método para cumplir años.
    public void cumpliranios(){
        edad ++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años");
    }
}
