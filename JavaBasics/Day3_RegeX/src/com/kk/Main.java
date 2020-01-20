package com.kk;

import com.kk.Person.Person;
//import com.kk.Person.StringParser;
import com.kk.Planet;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj masę: ");
        int wagaKlienta = in.nextInt();

        System.out.println("Podaj cyfrę od 1 do 8 na jakiej planecie chcesz obliczyć masę: ");
        System.out.println("(1) MERCURY");
        System.out.println("(2) VENUS");
        System.out.println("(3) EARTH");
        System.out.println("(4) MARS");
        System.out.println("(5) JUPITER");
        System.out.println("(6) SATURN");
        System.out.println("(7) URANUS");
        System.out.println("(8) NEPTUN");

        int wybor = in.nextInt();

        Planet planet = Planet.values()[wybor-1];

        switch (planet) {
            case MERCURY:
                System.out.println("Cieżar na Merkurym: " + Planet.MERCURY.weight(wagaKlienta));
                break;
            case VENUS:
                System.out.println("Cieżar na Wenus: " + Planet.VENUS.weight(wagaKlienta));
                break;
            case EARTH:
                System.out.println("Cieżar na Ziemi: " + Planet.EARTH.weight(wagaKlienta));
                break;
            case MARS:
                System.out.println("Cieżar na Marsie: " + Planet.MARS.weight(wagaKlienta));
                break;
            case JUPITER:
                System.out.println("Cieżar na Jupiter: " + Planet.JUPITER.weight(wagaKlienta));
                break;
            case SATURN:
                System.out.println("Cieżar na Saturn: " + Planet.SATURN.weight(wagaKlienta));
                break;
            case URANUS:
                System.out.println("Ciężar na Uran: " + Planet.URANUS.weight(wagaKlienta));
                break;
            case NEPTUN:
                System.out.println("Ciężar na Neptun: " + Planet.NEPTUN.weight(wagaKlienta));
                break;
            default:
                System.out.println("Podaj właśiwy numer!");

        }

        Person osoba = new Person("Zenon", "Bąk", 33);
//        System.out.println(osoba);
        Person osoba1 = new Person("Andrzej", "Wiardo", 1991 - 01 - 04);
//        System.out.println(osoba1);

//       Person os2 = StringParser.parse("Marek Jurek urodzony 21.05.1234, mo e-mail: xsdvsf@dvsdc ");
//       System.out.println(os2);



    }
}
