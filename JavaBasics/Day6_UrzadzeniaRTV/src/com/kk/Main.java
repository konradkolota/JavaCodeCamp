package com.kk;

import com.kk.rtv.Radio;
import com.kk.rtv.Soundable;
import com.kk.rtv.TelewizorCRT;

public class Main {
    public static void main(String[] args) {

        System

        Radio r1 = new Radio("Ada", 10000);
        System.out.println(r1);
        r1.wlaczDzwiek();
        System.out.println(r1);
        r1.wylacz();
        r1.wlacz();
        System.out.println(r1);


        TelewizorCRT tv1 = new TelewizorCRT();
        System.out.println(tv1);
        tv1.wlacz();
        System.out.println(tv1);

        TelewizorCRT tv2 = new TelewizorCRT(TelewizorCRT.Kolor.KOLOROWY);
        System.out.println(tv2);

        Soundable telefon = new Soundable() {
            @Override
            public void wlaczDzwiek() {
                System.out.println("Można rozmawiać");
            }

            @Override
            public void wylaczDzwiek() {
                System.out.println("Koniec rozmowy");
            }

            @Override
            public String toString() {
                return "Telefon";
            }
        };

        telefon.wlaczDzwiek();
        telefon.wylaczDzwiek();
        System.out.println(telefon);
    }
}
