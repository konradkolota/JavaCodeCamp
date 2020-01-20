package com.kk;

public class maxMinSum {
    public int[] getMaxMinAndSum(int[] tab){
        int[] finalArray = new int[3];
        int max = tab[0];
        int min = tab[0];


        for(int i = 0; i < tab.length; i++){
            if(tab[i] > max){
                max = tab[i];
            }else if(tab[i] < min) {
                min = tab[i];
            }
        }
        int suma = max + min;
        finalArray[0] = max;
        finalArray[1] = min;
        finalArray[2] = suma;

        for(int i = 0; i< finalArray.length; i++){
            System.out.println(finalArray[i]);
        }

        return finalArray;
    }


}
