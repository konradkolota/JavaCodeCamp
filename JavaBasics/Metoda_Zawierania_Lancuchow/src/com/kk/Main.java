package com.kk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MetodaContains sprawdz = new MetodaContains();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dwa łańcuchy znaków i sprawdź czy drugi zawiera się w pierszym:");
        if(sprawdz.czyZawiera(in.nextLine(), in.nextLine()) == true){
            System.out.println("Drugi zawiera się w pierwszym.");
        }else System.out.println("Drugi nie zawiera się w pierwszym.");
    }
}
