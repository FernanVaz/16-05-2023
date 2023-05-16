package com.softtec.modelo.Ejercicio1;

public class Superman extends Kriptoniano implements ObjetoVolador {

    public String volar() {
        return "Volando"+ getClass();
    }


    public String despegar() {
        return "Despegando"+ getClass();
    }


    public String aterrizar() {
        return "Aterrizando"+ getClass();
    }

    public String saltarEdificio() {
        return  "Saltando edificio";
    }
    public String detenerBala() {
        return   "Deteniendo bala";
    }

    @Override
    public String Comer() {
        return super.Comer() + "superman";
    }
}
