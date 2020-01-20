package com.kk;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwszy wymiar do pola prostokąta: ");
        double a = in.nextDouble();
        System.out.println("Podaj drugi wymiar do pola prostokąta: ");
        double b = in.nextDouble();
        System.out.println("Pole prostokata o bokach " + a + " , " + b + " wynosi: " + (a*b));
    }
}
