package com.kk;

public class merging {
    public void merge(int[] a, int[] b){
        int[] finalArray = new int[a.length + b.length];
        int iterator = 0;

        for(int i = 0; i < a.length; i++){
            finalArray[i] = a[i];
            iterator++;
        }

        for(int i = 0; i < b.length; i++){
            finalArray[iterator + i] = b[i];
        }

        for(int i = 0; i < finalArray.length; i++){
            System.out.println(finalArray[i]);
        }
    }
}
