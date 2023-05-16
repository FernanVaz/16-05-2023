package com.softtec.modelo.Ejercicio1;

public class Ave extends Animal implements ObjetoVolador {
    @Override
    public String volar() {
        return "Volando "+ getClass();
    }

    @Override
    public String despegar() {
        return "Despegando "+ getClass();
    }

    @Override
    public String aterrizar() {
        return "Aterrizando "+ getClass();
    }

    public String hacerNido() {
        return "Haciendo nido";
    }

    public String ponerHuevos() {
         return  "Poniendo huevos";
    }

    @Override
    public String Comer() {
        return super.Comer() +" Ave";
    }
}