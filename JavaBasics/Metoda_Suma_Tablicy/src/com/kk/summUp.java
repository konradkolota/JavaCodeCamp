package com.kk;

public class summUp {
    public void getSumm(int[] tab){
        int suma = 0;

        for(int i = 0; i < tab.length; i++){
            suma += tab[i];
        }
        System.out.println("Suma wszystkich wyrazów tablicy wynosi: " + suma);
    }

}
