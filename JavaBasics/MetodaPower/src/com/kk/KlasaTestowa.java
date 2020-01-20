package com.kk;

import java.util.Scanner;

public class KlasaTestowa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        for(int a = in.nextInt(); a>= 1; a--){
            int wynik = (int) Math.pow(a, b);
        }
    }
}
