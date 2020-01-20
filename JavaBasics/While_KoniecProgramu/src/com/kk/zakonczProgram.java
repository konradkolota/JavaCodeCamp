package com.kk;

import java.util.Scanner;

public class zakonczProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wejscie = " ";
        while (!wejscie.equals("tak")) {
            System.out.println("Czy chcesz zakończyć pracę programu?");
            wejscie = in.nextLine();
        }
        System.out.println("Koniec programu.");
    }
}
