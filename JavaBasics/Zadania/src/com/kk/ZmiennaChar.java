package com.kk;

import java.util.Scanner;

public class ZmiennaChar {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        //Wypisz wszystkie litery z angielskiego alfabetu
        for (char first = 'a'; first <= 'z'; first++) {
            System.out.print(first + " ");
        }
        System.out.println("\n========================================");
        //Wypisz co drugą literę alfabetu
        for (char first = 'a'; first <= 'z'; first+=2) {
            System.out.print(first + " ");
        }
        System.out.println("\n========================================");
        //Znaki z alfabetu eng na wspak
        for(char litera = 'z'; litera>='a'; litera--){
            System.out.print(litera + " ");
        }
        System.out.println("\n========================================");
        String alph = "alfabet";
        char maxChar = (char) 0;
        for(int i = 0; i< alph.length(); i++){
            if(alph.charAt(i) > maxChar){
                maxChar = alph.charAt(i);
            }
        }
        System.out.println("Największą wartość ma litera: " + maxChar);
        System.out.println("\n========================================");
        //Zadeklaruj zmienna tekstowa i przypisz jej wartosc. Wypisz wszystkie znaki tej zmiennej w osobnych wierszach
        String zmiennaTekstowa = "To jest przykładowa zmienna tekstowa";
        char charPlace = (char) 0;
        for(int i = 0; i < zmiennaTekstowa.length(); i++){
            charPlace = zmiennaTekstowa.charAt(i);
            System.out.println(charPlace);
        }
        System.out.println("\n========================================");
        //Podaj liczbe wystapien litery "a" w słowie alfabet
        char placeHolder = (char) 0;
        int licznik = 0;
        for(int i = 0; i<alph.length();i++){
            placeHolder = alph.charAt(i);
            if(placeHolder == 'a'){
                licznik++;
            }
        }
        System.out.println("Ilość liter a w słowie alfabet wynosi: " + licznik);
        System.out.println("\n========================================");
        //Sprawdź czy wyraz jest palindromem
        System.out.println("Podaj wyraz, aby sprawdzić czy jest palindromem");
        String originalString = wejscie.nextLine();
        String tempString = "";
        originalString = originalString.replaceAll("\\s", "");
        int iterationLength = originalString.length();
        for(int i = iterationLength - 1; i>=0; i--){
            tempString = tempString + originalString.charAt(i);
        }
        if(tempString.equals(originalString)){
            System.out.println("Dany zwrot jest palindromem");
        }else System.out.println("Dany zwrot nie jest palindromem");
        System.out.println("\n========================================");
        //Sprawdź dla wybranego tekstu dla której litery będziemy mieli najdłuższy ciąg wystąpień tylko tej litery.
        String testString = wejscie.nextLine();
        String result = "";
        for(int i = 0; i < testString.length(); i++){
            int j = i;
            while(j < testString.length() && testString.charAt(j) == testString.charAt(i)){
                j++;
            }
            if(j - i > result.length()){
                result = testString.substring(j, i);
            }
            System.out.println(result);
        }
    }

}
