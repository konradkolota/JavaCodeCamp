package com.kk;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Random;

public class CW1 {
    public static void main(String[] args) {
        System.out.println(findMax(100));
        System.out.println(findAnswer(100));

        int[][] tab = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        System.out.println(summTab(tab));

    }

    public static boolean checkOdds(double a){
        if(a%2==0){
            return true;
        }else return false;
    }

    public static int findMax(int n){
        Random r = new Random();
        int tmp = 0;
        int[] tab =new int[n];
        for (int i = 0; i < n; i++){
            tab[i] = r.nextInt((100000-1)+1);
            if(tab[i] > tmp){
                tmp = tab[i];
            }
        }return tmp;
    }

    public static int findAnswer(int n){
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if((7*i)+(5*j)+(3*k)==362){
                       counter++;
                        System.out.println("i: " + i + "; j: " + j + "; k:" + k);
                        System.out.println(counter);
                    }
                }
            }
        }
        return counter;
    }

    private static int summTab(int[][] tab){
        Integer sum = Integer.valueOf(0);

        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab[i].length ; j++) {
                sum+=tab[i][j];
            }
        }
        return sum;
    }
}
