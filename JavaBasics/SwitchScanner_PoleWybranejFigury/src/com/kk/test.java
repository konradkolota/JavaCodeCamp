package com.kk;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj jakiej figury pole chcesz obliczyć: ");
        System.out.println("( 1 ) Kwadrat");
        System.out.println("( 2 ) Prostokąt");
        System.out.println("( 3 ) Koło");
        System.out.println("( 4 ) Trójkąt");

        int wybor = in.nextInt();

        switch(wybor) {
            case 1:
                System.out.println("Podaj bok kwadratu: ");
                double kwadrat = in.nextDouble();
                System.out.println("Pole kwadratu o boku " + kwadrat + " jest równe: " + (kwadrat*kwadrat));
                break;
            case 2:
                System.out.println("Podaj pierwszy bok prostokąta: ");
                double prostokatA = in.nextDouble();
                System.out.println("Podaj drugi bok prostokąta: ");
                double prostokatB = in.nextDouble();
                System.out.println("Pole prostokąta o bokach " + prostokatA + " oraz " + prostokatB + " jest równe: " + (prostokatA*prostokatB));
                break;
            case 3:
                System.out.println("Podaj promień koła: ");
                double promien = in.nextDouble();
                System.out.println("Pole koła wynosii: " + (2*Math.PI*promien));
                break;
            case 4:
                System.out.println("Podaj długość boku trojkata: ");
                double trojkatA = in.nextDouble();
                System.out.println("Podaj wysokosc: ");
                double trojkatH = in.nextDouble();
                System.out.println("Pole trojkata wynosi: " + (0.5*trojkatA*trojkatH));
                break;
            default:
                System.out.println("PODAJ ODPOWIEDNIA OPCJE!");
        }
    }
}
