package com.kk;

public class findMinValue {
    public void findMin(int[] tab){
        int minValue = tab[0];

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < minValue){
                minValue = tab[i];
            }
        }
        System.out.println("Najmniejsza liczba w tablicy to: " + minValue);
    }
}
