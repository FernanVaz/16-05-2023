package com.sofftec.presentacion;

import com.softtec.modelo.Ejercicio1.*;
import com.softtec.modelo.Coche.Conductor;
import com.softtec.modelo.Coche.IVehiculo;
import com.softtec.modelo.Taller.Coche;
import com.softtec.modelo.Taller.SeguroCoche;
import com.softtec.modelo.Taller.TallerMecanica;
import com.softtec.modelo.Taller.TallerPintura;

public class MainEjercicio1 {
    public static void main(String[] args) {

        ObjetoVolador ave = new Ave();
        ObjetoVolador avio = new Avion();
        ObjetoVolador man = new Superman();
        Nautico barcaza = new Barcaza();
        Nautico hidoravion = new Hidoravion();


        ObjetoVolador []voladores = new ObjetoVolador[]{ave, avio, man, (ObjetoVolador) hidoravion};
        Nautico []nauticos = new Nautico[]{barcaza,hidoravion};
        for (ObjetoVolador volador : voladores) {
            System.out.println("*******************************");
            System.out.println(volador.volar());
            System.out.println(volador.despegar());
            System.out.println(volador.aterrizar());

            if(volador instanceof ObjetoVolador){
                System.out.println(volador.getClass());
            }
            if (volador instanceof Ave) {
                System.out.println(((Ave) volador).hacerNido());
                System.out.println(((Ave) volador).ponerHuevos());
            }
            if (volador instanceof Superman) {
                System.out.println(((Superman) volador).saltarEdificio());
                System.out.println(((Superman) volador).detenerBala());
            }
            if (volador instanceof Hidoravion) {
                System.out.println(((Hidoravion) volador).atacar());
                System.out.println(((Hidoravion) volador).navegar());
            }
        }
        for (Nautico nautico : nauticos) {
            System.out.println("*******************************");
            System.out.println(nautico.atacar());
            System.out.println(nautico.navegar());

            if (nautico instanceof Barcaza) {
                System.out.println(((Barcaza) nautico).queSoy());
            }
            if (nautico instanceof Hidoravion) {
                System.out.println(((Hidoravion) nautico).queSoy());
                System.out.println(((Hidoravion) nautico).volar());
                System.out.println(((Hidoravion) nautico).despegar());
                System.out.println(((Hidoravion) nautico).aterrizar());
            }
        }
    }
}
