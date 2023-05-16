package com.softtec.modelo.Taller;

public class TallerMecanica implements Taller {
    @Override
    public String reparar(Coche c) {
        return "reparando la parte mecanica del coche";
    }
}
