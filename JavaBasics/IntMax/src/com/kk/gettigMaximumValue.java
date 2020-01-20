package com.kk;

public class gettigMaximumValue {
    public void getMax(int[] tab){
        int maxInt = tab[0];

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > maxInt){
                maxInt = tab[i];
            }
        }
        System.out.println("Najwyższa liczba w tablicy to: " + maxInt);
    }

}
