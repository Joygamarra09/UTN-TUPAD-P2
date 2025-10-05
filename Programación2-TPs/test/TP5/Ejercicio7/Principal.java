
package TP5.Ejercicio7;

public class Principal {

    public static void main(String[] args) {
        Motor M1 = new Motor("Combustión","CBX-7200-TURB-CMB-ARG0925" );
        Conductor Cond1 = new Conductor("Virginia Perez", true);
        Vehiculo V1 = new Vehiculo("AEZ 914-K", "Quantalis Vortex 320 Turbo", M1);
        Cond1.setVehiculo(V1);
        V1.setConductor(Cond1);
        
        Motor M2 = new Motor("Hibrido","HYB-9821-TWIN-EVX-ARG0925" );
        Conductor Cond2 = new Conductor("Brenda Lucena", false);
        Vehiculo V2 = new Vehiculo("LQF 327-V", "Solara Fusion X8 Hybrid", M2);
        Cond2.setVehiculo(V2);
        V2.setConductor(Cond2);
        
        //Se muestra por consola cada objeto
        System.out.println(Cond1);
        System.out.println(V1);
        System.out.println(M1);
        
        System.out.println("---------------------------------");
        
        System.out.println(Cond2);
        System.out.println(V2);
        System.out.println(M2);
    }
    
}
