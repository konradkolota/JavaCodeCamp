package com.kk;

import java.util.Scanner;

public class Zmienne {
    public static void main(String[] args) {
        //Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości.
        //Następnie wypisz wartość największej z nich.
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(c);
        System.out.println("========================================");
        //Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie.
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Wprowadź cyfrę aby sprawdzić jej parzystość: ");
        int sprawdzParzystosc = wejscie.nextInt();
        if (sprawdzParzystosc % 2 == 0) {
            System.out.println(sprawdzParzystosc + " jest liczbą parzystą");
        } else System.out.println(sprawdzParzystosc + " jest liczbą nieparzystą");
        System.out.println("========================================");
        //Sprawdź, czy wartość przypisana zmiennej jest większa, mniejsza czy równa zero
        System.out.println("Podaj liczbę aby sprawdzić czy jest więkasza, mniejsza czy równa zero: ");
        int sprawdzRownosc = wejscie.nextInt();
        if (sprawdzRownosc < 0) {
            System.out.println(sprawdzRownosc + " jest mniejsza od zera");
        } else if (sprawdzRownosc == 0) {
            System.out.println(sprawdzRownosc + " jest równa zero");
        } else System.out.println(sprawdzRownosc + " większa zero");
        System.out.println("========================================");
    }
}
