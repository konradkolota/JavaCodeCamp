package com.kk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int licznik = 1;
        int odliczanie = 3;
        int wejscie = 0;

        System.out.println("Podaj wartość: ");
        wejscie = in.nextInt();

        do {
            odliczanie *= 3;
            licznik++;
        } while (wejscie > odliczanie);
        System.out.println(licznik);
    }
}
