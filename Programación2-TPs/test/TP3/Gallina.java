package TP3;

public class Gallina {
    //Atributos
    int idGallina;
    int edad;
    int huevosPuestos = 0;
    
    //Constructor con parámetros
    public Gallina(int idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    //Crear método ponerHuevos
    public void ponerHuevo(){
        huevosPuestos ++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
        
    }
    
    //Crear método envejecer
    public void envejecer (){
        edad++;
        System.out.println("La gallina " + idGallina + " cumplió " + edad + " años." );
    }
    
    //Método mostrarEstado.
    public void mostrarEstado(){
        System.out.println("Gallina ID: " + idGallina + "| Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    }
    
}
