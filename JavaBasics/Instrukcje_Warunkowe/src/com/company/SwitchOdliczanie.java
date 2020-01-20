package com.company;
import java.util.Scanner;

public class SwitchOdliczanie {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe od ktorej ma sie zaczac odliczanie w dol z przedzialu od 0-9");
        int liczba = wejscie.nextInt();
        switch(liczba) {
            case 9:
                System.out.println("9");
            case 8:
                System.out.println("8");
            case 7:
                System.out.println("7");
            case 6:
                System.out.println("6");
            case 5:
                System.out.println("5");
            case 4:
                System.out.println("4");
            case 3:
                System.out.println("3");
            case 2:
                System.out.println("2");
            case 1:
                System.out.println("1");
            case 0:
                System.out.println("0");
                break;
            default:
                System.out.println("To nie jest liczba z przedzialu 0-9");
        }
    }
}
