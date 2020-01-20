package com.kk;

import com.kk.person.Person;

public class Main {

    public static void main(String[] args) {
        Person osoba1 = new Person("Andrzej", "Keke", 30);

        System.out.println(osoba1);

        System.out.println(osoba1.szyfrCezara(3));
    }
}
