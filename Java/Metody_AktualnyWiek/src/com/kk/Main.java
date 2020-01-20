package com.kk;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mój wiek to: " + age() + " lat ;)");
    }
    private static int age(){return (LocalDate.of(1991, 03, 18)).getYear() - (LocalDate.now().getYear());}
}
