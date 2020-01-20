package com.kk;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(test(14));
    }

    public static boolean test(int a){
        if(a%3==0 && a%5==0){
            return true;
        }else return false;
    }
}
