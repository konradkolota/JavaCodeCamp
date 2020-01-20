package kk;
import java.util.Scanner;

public class CwiczenieLancuch {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = wejscie.nextLine();
        String imieCappitalized = imie.charAt(0).toUpperCase();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = wejscie.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = wejscie.nextInt();
        System.out.println(imie + nazwisko + wiek);



    }

}
