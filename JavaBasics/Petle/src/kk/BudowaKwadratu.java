package kk;

import java.util.Scanner;

public class BudowaKwadratu {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj wielkosc kwadratu: ");
        int wielkosc = wejscie.nextInt();
        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
