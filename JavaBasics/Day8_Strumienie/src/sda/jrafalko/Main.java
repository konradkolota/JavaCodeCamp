package sda.jrafalko;

import sda.jrafalko.streams.GeneratorFigur;
import sda.jrafalko.streams.ImplementacjaInterfejsu;

public class Main {

    public static void main(String[] args) {

        ImplementacjaInterfejsu imp = new ImplementacjaInterfejsu(GeneratorFigur.generuj());

        System.out.println("1. Największa figura względem pola wysokosc:");

        System.out.println("2. Figura o najmniejszym polu powierzchni:");

        System.out.println("3. Najwyższa figura 3D:");

        System.out.println("4. Najmniejszy stożek względem objętości:");

        System.out.println("5. Lista figur posortowanych względem pola powierzchni:");

        System.out.println("6. Druga figura z posortowanych malejaco względem obwodu:");

        System.out.println("7. Lista pięciu pierwszych figur posortowanych rosnąco względem pola powierzchni:");

        System.out.println("8. Lista wszystkich sześcianów o długości boku nie większej niż 10:");

        System.out.println("9. Koło o najmniejszym polu powierzchni:");

        System.out.println("10. Mapa figur względem ID:");

        System.out.println("11. Ilość figur o polu powierzchni nie większym niż 200:");

        System.out.println("12. osortowany ciąg figur zaczynając od 5:");

    }
}
