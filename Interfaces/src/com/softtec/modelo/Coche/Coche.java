package com.softtec.modelo.Coche;

public class Coche implements IVehiculo{
    int deposito;
    public Coche(int deposito) {
        this.deposito = deposito;
    }
    @Override
    public String moverse() {
        if (deposito > 0) {

            return "el coche se esta moviendo";
        }else{
            return "el coche no se esta moviendo xk no tinene gasolina";
        }
    }
}
