package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe z przedziału od 0 do 9 wpisujac ja slownie (bez polskich znakow)");
        String naszaLiczba = wejscie.nextLine();
        if (naszaLiczba.equals("jeden")) {
            System.out.println("!");
        } else if (naszaLiczba.equals("dwa")) {
            System.out.println("@");
        } else if (naszaLiczba.equals("trzy")) {
            System.out.println("#");
        } else if (naszaLiczba.equals("cztery")) {
            System.out.println("$");
        } else if (naszaLiczba.equals("piec")) {
            System.out.println("%");
        } else if (naszaLiczba.equals("szesc")) {
            System.out.println("^");
        } else if (naszaLiczba.equals("siedem")) {
            System.out.println("&");
        } else if (naszaLiczba.equals("osiem")) {
            System.out.println("*");
        } else if (naszaLiczba.equals("dziewiec")) {
            System.out.println("(");
        } else if (naszaLiczba.equals("zero")) {
            System.out.println(")");
        } else System.out.println("To nie jest liczba z przedzialu 0-9");
    }
}
