package com.kk;

import java.util.Scanner;





public class Funkcje {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Podaj swoją prędkość w km/h : ");
//        double km = in.nextDouble();
//        double ms = przelicznik(km);
//        System.out.println(ms);

        System.out.println("Podaj temp do przeliczenia: ");
        double temp = in.nextDouble();
        double F = przliczTemperature(temp);
        System.out.println(F);


    }

//    public static double przelicznik(double kmh){
//        double ms;
//        ms = kmh * (1000.0/3600);
//
//        return ms;
//    }

    public static double przliczTemperature(double C){
        double F;
        F = (C * 1.8) + 32;
        return F;
    }

}


