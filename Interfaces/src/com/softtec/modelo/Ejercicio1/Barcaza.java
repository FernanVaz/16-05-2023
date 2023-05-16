package com.softtec.modelo.Ejercicio1;

public class Barcaza extends Vehiculo implements Nautico{

    public String atacar() {
        return  "atacar de Barcaza";
    }
    public String navegar() {
        return  "navegando de Barcaza";
    }

    @Override
    public String queSoy() {
        return super.queSoy();
    }
}
