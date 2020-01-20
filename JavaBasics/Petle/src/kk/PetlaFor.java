package kk;

import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj ilosc poduktow jakie chcesz miec produktow: ");
        int ilosc = wejscie.nextInt();
        for(int i=0; i<ilosc; i++){
            System.out.println("Podaj nazwe produktu: ");
            String produkt = wejscie.nextLine();
            System.out.println("Dodałem do koszyka " + produkt + ", to nasz " + (i+1) + ". produkt");
        }

    }
}
