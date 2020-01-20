package com.kk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wykładną: ");
        double a = in.nextDouble();
        System.out.println("Podaj wykładnik: ");
        double b = in.nextDouble();

        PowerMethod potega = new PowerMethod();
        System.out.println(potega.power(a, b));
    }
}
