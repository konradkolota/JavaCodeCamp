package com.kk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length ; i++) {
            tab1[i] = i;
            System.out.print(tab1[i] + " ");
        }

        System.out.println("\n============");

        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length ; i++) {
            if(i%2==1){
                tab2[i] = i + i -1;
            }else {
                tab2[i] = i;
            }
            System.out.print(tab2[i] + " ");
        }

        System.out.println("\n============");

        int[] tab3 = new int[10];
        Random r = new Random();
        for (int i: tab3) {
            i = r.nextInt((10-1)+1);
            System.out.print(i + " ");
        }

        System.out.println("\n============");

        int[] tab4 = new int[20];
        System.out.println("Wszystkie od początku: ");
        for (int i = 0; i < tab4.length; i++ ) {
            tab4[i] = r.nextInt((10-1)+1);
            System.out.print(tab4[i] + " ");
        }
        System.out.println();
        System.out.println("Wszystkie od końca: ");
         for(int i = tab4.length - 1; i >= 0; i--){
             System.out.print(tab4[i] + " ");
         }

        System.out.println();
        System.out.println("Wszystkie liczby na nieparzystych pozycjach: ");

        for(int i = 0; i < tab4.length; i++){
            if(i%2==1) System.out.print(tab4[i] + " ");
        }

        System.out.println();
        System.out.println("Co trzecią liczbę: ");
        for(int i = 0; i < tab4.length; i+=3){
            System.out.print(tab4[i] + " ");
        }

        System.out.println();
        System.out.println("Suma wszystkich liczb: ");
        int summ = 0;
        for(int i = 0; i < tab4.length; i++){
            summ += tab4[i];
        }
        System.out.print(summ);

        System.out.println();
        System.out.println("Suma 5 ostatnich większych od 3: ");
        int counter = 0;
        summ = 0;
        for(int i = tab4.length -1; i >= 0; i-- ){
            if(tab4[i] > 3){
                summ += tab4[i];
                counter++;
                if(counter >= 5){
                    break;
                }
            }
        }
        System.out.print(summ);

        System.out.println();
        System.out.println("Ilość liczb z początku tablicy, kórych suma przekracza 10: ");

        counter = 0;
        summ = 0;
        for(int i = 0 ; i < tab4.length; i++){
            summ += tab4[i];
            counter++;
            if(summ > 10){
                break;
            }
        }
        System.out.print(counter);

        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = in.nextInt();
        System.out.println("Wypisz co n-tą liczbę: ");
        for(int i = 0; i < tab4.length; i+=n){
            System.out.print(tab4[i] + " ");
        }

        System.out.println();
        System.out.println("Podaj m: ");
        int m = in.nextInt();
        System.out.println("Wypisz liczby podzielne przez m: ");
        for(int i = 0; i < tab4.length; i++){
            if(tab4[i]%m==0){
                System.out.print(tab4[i] + " ");
            }
        }

//        System.out.println();
//        System.out.println("Liczby których suma da dziesięć:  ");
//        for (int i = 0; i < tab4.length ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }



    }
}
