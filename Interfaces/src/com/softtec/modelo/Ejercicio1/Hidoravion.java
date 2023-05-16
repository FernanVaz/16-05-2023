package com.softtec.modelo.Ejercicio1;

public class Hidoravion extends Avion implements Nautico{
    @Override
    public String atacar() {
        return "atacando de Hidoravion";
    }

    @Override
    public String navegar() {
        return "navegando de Hidoravion";
    }
}
