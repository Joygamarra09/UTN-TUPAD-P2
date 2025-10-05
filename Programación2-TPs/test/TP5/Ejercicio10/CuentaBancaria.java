
package TP5.Ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    //Constructor
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        if ((cbu != null) && (saldo >= 0) && (clave != null)){
            this.cbu = cbu;
            this.saldo = saldo;
            this.clave = clave;
        }
    }
    //Getters
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
    //Setter para Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    //Método toString
    @Override
    public String toString() {
        return "CuentaBancaria: cbu: " + cbu + ", Saldo: " + saldo  + ", " + clave + ", Nombre: " + titular.getNombre();
    }
    
}
