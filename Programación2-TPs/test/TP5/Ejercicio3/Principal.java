
package TP5.Ejercicio3;

public class Principal {

    public static void main(String[] args) {
        //Primer libro
        Autor a1 = new Autor("Josefina Herrera", "Argentina");
        Editorial e1 = new Editorial("Sudamericana", "Buenos Aires, Av. Siempre Viva 321");
        Libro libro1 = new Libro("Rayuela", "978-950-06-1234-5", a1, e1);
        
        //Segundo libro
        Autor a2 = new Autor("Esteban Morales", "Uruguaya");
        Editorial e2 = new Editorial("Tinta Libre", "Montevideo, Av. de los Pensadores 123");
        Libro libro2 = new Libro("Algoritmos de viento", "978-9974-45-6789-0", a2, e2);
        
        System.out.println(libro1);
        System.out.println("--------------------------");
        System.out.println(libro2);

    }
    
}
