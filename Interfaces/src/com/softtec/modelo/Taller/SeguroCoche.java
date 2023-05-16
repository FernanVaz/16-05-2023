package com.softtec.modelo.Taller;

public class SeguroCoche {
    String nonbre;
    public SeguroCoche( String nonbre) {
        this.nonbre = nonbre;
    }
    public String reparar(Coche c,Taller t){
        return t.reparar(c);
    }
}
