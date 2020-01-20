package com.kk;

public class Main {

    public static void main(String[] args) {
        System.out.println(triangleNumbers(6));
    }

    private static int triangleNumbers(int i){
        if(i == 1){
            return 1;
        }else{
            return i + triangleNumbers(i-1);
        }
    }
}
