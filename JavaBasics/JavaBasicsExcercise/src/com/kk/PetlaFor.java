package com.kk;

import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        //Wypisz wszystkie liczby z zakresu 5-100
        for(int i = 5; i<=100; i++){
            System.out.println(i);
        }
        System.out.println("========================================");
        //Wypisz wszystkie liczby z zakresu 55-150
        for(int i = 55; i <= 150; i++){
            System.out.println(i);
        }
        System.out.println("========================================");
        //Wypisz wszystkie liczby z zakresu 1-100 zaczynając od 100
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("========================================");
        //Wyświetl wszystkie parzyste liczby z przedziału 0 -100
        for(int i = 0; i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("========================================");
        //Dla liczb z przedziału 0-100 podaj informację, czy są podzielne przez 2, 3 i 5
        for(int i = 0; i<=100; i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i + " podzielne przez 2, podzielne przez 3, podzielne przez 5");
            }else if(i%2==0 && i%3==0  && i%5!=0){
                System.out.println(i + " podzielne przez 2, podzielne przez 3");
            }else if(i%2==0 && i%3!=0 && i%5!=0){
                System.out.println(i + " podzielne przez 2");
            }else if(i%2!=0 && i%3==0 && i%5!=0){
                System.out.println(i + " podzielne przez 3");
            }else if(i%2!=0 && i%3!=0 && i%5==0){
                System.out.println(i + " podzielne przez 5");
            }else if(i%2==0 && i%3!=0 && i%5==0){
                System.out.println(i + " podzielne przez 2, podzielne przez 5");
            }else if(i%2!=0 && i%3==0 && i%5==0){
                System.out.println(i + " podzielne przez 3, podzielne przez 5");
            }else System.out.println(i);
        }
        System.out.println("========================================");
        //Podaj sumę wszystkich liczb z przedziału 1-459
        for(int i = 1; i<=459; i++){
            System.out.println(i*(i+1/2));
        }
        System.out.println("========================================");
        //Wydrukuj w konsoli trójkąt/piramidę
        char triange = '*';
        for(int i = 0; i<=4; i++){
            System.out.println("");
            for(int j = 0; j<=i; j++){
                System.out.print(triange);
            }
        }
        System.out.println("\n========================================");
        //Odwrócone poprzednie zadanie
        for(int i = 4; i>=0; i--){
            System.out.println("");
            for(int j = 0; j<=i; j++){
                System.out.print(triange);
            }
        }
        System.out.println("\n========================================");
        //Analogicznie do poprzednich, uzależnione od zmiennej podanej w konsoli
//        System.out.println("Podaj 'wysokość' drzewka (tylko liczby całkowite, dodatnie)");
//        int x = wejscie.nextInt();
//        for(int i = 0; i<=x; i++){
//            System.out.println("");
//            for(int j = 0; j<=i; j++){
//                System.out.print(triange);
//            }
//        }
        System.out.println("\n========================================");
        //Trójkąt z kątem prostm z prawej stron
        for(int i = 0; i<=5; i++){
            System.out.println("");
            for(int j = 0; j<=5; j++){
                if(j<i){
                    System.out.print(" ");
                }else System.out.print("*");
            }
        }

    }
}
