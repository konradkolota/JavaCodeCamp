package com.kk;

public class FibonacciList {

    public static void main(String[] args) {
	// write your code here
        int counter = 0;
        for (int i = 0; i < 100 ; i++) {
            System.out.println(counter + ": " + fibonacci(i));
            counter++;
        }

    }

    private static int fibonacci(int i){
        if(i < 2){
            return i;
        }else{
            return fibonacci(i-1) + fibonacci(i-2);
        }
    }
}
