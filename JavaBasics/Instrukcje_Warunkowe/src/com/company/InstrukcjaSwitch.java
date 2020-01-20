package com.company;
import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu od 0-9: ");
        int liczba = wejscie.nextInt();
        switch(liczba){
            case 0:
                System.out.println(")");
                break;
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            case 3:
                System.out.println("#");
                break;
            case 4:
                System.out.println("$");
                break;
            case 5:
                System.out.println("%");
                break;
            case 6:
                System.out.println("^");
                break;
            case 7:
                System.out.println("&");
                break;
            case 8:
                System.out.println("*");
                break;
            case 9:
                System.out.println("(");
                break;
            default:
                System.out.println("To nie jest liczba z przedzialu 0-9");
        }
    }
}
