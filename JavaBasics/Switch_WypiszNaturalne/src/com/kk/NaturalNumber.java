package com.kk;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną do której mam wypisać cyfry naturalne: ");
        int liczba = in.nextInt();

        for(int i = 0; i <= liczba; i++){
            System.out.println(i);
        }
    }
}
