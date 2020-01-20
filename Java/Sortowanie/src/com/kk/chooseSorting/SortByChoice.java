package com.kk.chooseSorting;

public class SortByChoice {
    public int[] selectionSort(int[] tab){
        int min, minIndex ,temp;
        for (int i = 0; i <tab.length -1 ; i++) {
            min=tab[i];
            minIndex = i;
            for (int j = i; j < tab.length  ; j++) {
                if(tab[j] < min){
                    min = tab[j];
                    minIndex = j;
                }
            }
            temp = tab[i];
            tab[i] = min;
            tab[minIndex] = temp;
        }
        return tab;
    }

}
