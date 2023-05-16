package com.softtec.modelo.Coche;

public class Conductor {
    IVehiculo iv;


     public Conductor(IVehiculo iv){
         this.iv = iv;
     }
    public String Conducir(){
        return iv.moverse();
    }
}
