package com.kk;

import java.util.Scanner;

public class MetodaString {
    public int LicznikWystapien(){
        String przykladowyString = "To jest przykładowy łańcuch znaków mający służyć do zliczenia podanej litery.";
        int licznik = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj jaki znak ma być policzony w przykładowym ciągu znaków: ");
        char znakZlicznay = in.next().charAt(0);

        for(int i = 0; i < przykladowyString.length(); i++){
            if(przykladowyString.charAt(i) == znakZlicznay){
                licznik++;
            }
        }
        return licznik;
    }
}
