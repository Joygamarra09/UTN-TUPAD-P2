package TP5.Ejercicio11;

public class Principal {

    public static void main(String[] args) {
        Artista a1 = new Artista("Stray Kids", "K-POP");
        Cancion c1 = new Cancion("Megaverse");
        Cancion c2 = new Cancion("Truman");
        c1.setArtista(a1);
        c2.setArtista(a1);
        Reproductor repro = new Reproductor();
        
        repro.Reproducir(c1);
        repro.Reproducir(c2);
    }
    
}
