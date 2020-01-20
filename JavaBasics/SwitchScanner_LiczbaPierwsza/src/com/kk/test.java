package com.kk;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę aby sprawdzić czy jest ona liczbą pierwszą: ");
        int liczba = in.nextInt();
        boolean czyPierwsza = false;

        for(int i = 2; i<=liczba/2; ++i){
            if(liczba%i==0){
                czyPierwsza = true;
                break;
            }
        }
        if(!czyPierwsza){
            System.out.println("jest");
        }else System.out.println("nie jest");
    }
}
