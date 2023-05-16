package com.sofftec.presentacion;

import com.softtec.modelo.Taller.Coche;
import com.softtec.modelo.Taller.SeguroCoche;
import com.softtec.modelo.Taller.TallerMecanica;
import com.softtec.modelo.Taller.TallerPintura;

public class MainTaller {
    public static void main(String[] args) {

        Coche C = new Coche("Coche 1", "100","QWE1234QWE");
        TallerMecanica M = new TallerMecanica();
        TallerPintura P = new TallerPintura();
        SeguroCoche S = new SeguroCoche("okey");

        System.out.println( S.reparar(C, M));
        System.out.println( S.reparar(C, P));

    }
}
