package com.sofftec.presentacion;

import com.softtec.modelo.Coche.Conductor;

import com.softtec.modelo.Coche.*;
public class MainCoche {
    public static void main(String[] args) {
        Coche C= new Coche(100);
        Conductor Fer = new Conductor(C);
        System.out.println(Fer.Conducir());
    }
}
