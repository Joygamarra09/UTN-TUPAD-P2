package TP5.Ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Se crea dentro del método
        System.out.println("Exportación completada: " + render.toString());
    }

}
