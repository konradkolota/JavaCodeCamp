package com.kk;

import java.util.Scanner;

public class Multiply {
    Scanner in = new Scanner(System.in);
    private int a;
    private int b = in.nextInt();
    private int wynik = 0;


    public int multiply2(){
        for(a = in.nextInt(); a >= 1; a--){
            wynik+=b;
        }
        return wynik;
    }
}
