package com.kk;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //(LocalDate dataProdukcji, String nazwa, int iloscWlaczen, boolean wlaczone, double czestotliwosc)
        Radio r1 = new Radio(LocalDate.of(1995, 12,12),2500,true,93.75);
        System.out.println(r1);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        TelewizorCRT tv1 = new TelewizorCRT(LocalDate.of(2015, 10,10), 0, true, 22.5, false, 5, true);
        System.out.println(tv1);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        TelewizorPlaski tv2 = new TelewizorPlaski(LocalDate.of(2017, 02, 03 ), 10000, true, 32, false, 123, TelewizorPlaski.matryca.LED);
        System.out.println(tv2);
        System.out.println();
        System.out.println("======================================");
        System.out.println();



    }
}
