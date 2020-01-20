package com.kk;

import java.util.Scanner;

public class MetodaMultiply {
    public int multiply(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int wynik = a*b;
        return wynik;
    }
}
