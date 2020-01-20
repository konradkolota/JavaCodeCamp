package com.kk;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(czyPodzielna(9999));
    }

    private static boolean czyPodzielna(int i){
        int summ = 0;
        if(i == 3 || i == 6 || i == 9 && i<10){
            return true;
        }else{
            while(i >= 1){
                summ += i%10;
                i=i/10;
                System.out.println(summ);
            }
            return false;
        }
    }
}
