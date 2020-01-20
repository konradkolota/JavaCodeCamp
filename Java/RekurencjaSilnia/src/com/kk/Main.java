package com.kk;

public class Main {

    public static void main(String[] args) {
        System.out.println(silnia(5));

    }

    private static int silnia(int i){
        if(i == 1){
            return 1;
        }else{
            return i*silnia(i-1);
        }
    }
}
