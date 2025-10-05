
package TP5.Ejercicio2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //agregación
    private Usuario usuario; //asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this); //establecimiento de relación bidireccional
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario.getNombre() + '}';
    }
    
    
}
