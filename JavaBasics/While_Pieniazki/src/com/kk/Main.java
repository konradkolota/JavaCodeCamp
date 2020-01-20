package com.kk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwotę pieniędzy a ja powiem Tobie jakie nominały będą zajmowały mniej miejsca w portfelu :)");

        int kwota = in.nextInt();
        int kwotaOdejmujaca = 200;
        int licznikDwusetek = 0;
        int licznikSetek = 0;
        int licznikPiecdziesiatek = 0;
        int licznikDwudziestek = 0;
        int licznikDziesiatek = 0;
        int licznikPiatek = 0;
        int licznikDwojek = 0;
        int licznikJedynek = 0;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikDwusetek++;
        }

        kwotaOdejmujaca -= 100;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikSetek++;
        }

        kwotaOdejmujaca -= 50;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikPiecdziesiatek++;
        }

        kwotaOdejmujaca -= 30;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikDwudziestek++;
        }

        kwotaOdejmujaca -= 10;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikDziesiatek++;
        }

        kwotaOdejmujaca -= 5;

        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikPiatek++;
        }

        kwotaOdejmujaca -= 3;
        while (kwotaOdejmujaca < kwota) {
            kwota -= kwotaOdejmujaca;
            licznikDwojek++;
        }

        kwotaOdejmujaca -= 1;

        while (kwotaOdejmujaca <= kwota) {

            kwota -= kwotaOdejmujaca;
            licznikJedynek++;
        }

        System.out.println("Potrzebujesz następującej liczby nominałów, żeby kasa zajęła jak najmniej miejsca: ");
        System.out.println(licznikDwusetek + " banknotów 200zł");
        System.out.println(licznikSetek + " banknotów 100zł");
        System.out.println(licznikPiecdziesiatek + " banknotów 50zł");
        System.out.println(licznikDwudziestek + " banknotów 20zł");
        System.out.println(licznikDziesiatek + " banknotów 10zł");
        System.out.println(licznikPiatek + " monet 5zł");
        System.out.println(licznikDwojek + " monet 2zł");
        System.out.println(licznikJedynek + " monet 1zł");

        System.out.println(kwota);

    }
}
