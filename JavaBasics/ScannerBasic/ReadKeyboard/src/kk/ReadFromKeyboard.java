package kk;
import java.util.Scanner;

public class CzytanieZklawiatury {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String imie = wejscie.nextLine();
        System.out.println("Twoje imie to: " + imie);

//        System.out.println("Podaj liczbę całkowita:");
//        int a = wejscie.nextInt();
//        System.out.println("Podaj liczbę ulamkowa:");
//        double b = wejscie.nextDouble();
//        System.out.printf("Suma dwoch poprzednich liczb: %.2d", a+b); // nie działą do zrobienia w domu

        System.out.println("Podaj liczbę całkowita:");
        int pierwsza = wejscie.nextInt();
        System.out.println("Podaj liczbę całkowita:");
        int druga = wejscie.nextInt();
        double wynik = (double)pierwsza/druga;
        System.out.println("Wynik dzielenia dwoch liczb calkowitych to: "  + wynik);


    }
}
