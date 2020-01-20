package com.kk;

import java.util.Scanner;

public class KlasaTestowa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b = in.nextInt();
        int wynik = 0;

        for(a = in.nextInt(); a>=1; a--){
            wynik+=b;
            System.out.println(wynik);
        }

    }
}
