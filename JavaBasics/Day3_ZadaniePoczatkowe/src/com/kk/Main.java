package com.kk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj max liczbe: ");
        int liczba = in.nextInt();

        System.out.print("Podaj liczbe przez którą dzielimy: ");
        int dzielnik = in.nextInt();

        int rozmiar = (liczba/dzielnik) + 1;
        int [] tablica = new int[rozmiar];
        int j = 0;

        for (int i = 0; i <= liczba; i++) {
            if(i%dzielnik==0){
                tablica[j] = i;
                j++;
                System.out.println(i + " ");
            }
        }
    }
}
