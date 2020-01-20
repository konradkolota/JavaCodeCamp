package com.kk;

public class NegativeSqrt {
    public static void main(String[] args) {
        System.out.println(findSqrt(6.25, 0.0000001));
    }

    private static double findSqrt(double n, double e){
        double a = 1.0;
        double b = n;

        while(Math.abs(a-b)>=e){
            a=(a+b)/2.0;
            b=n/a;
        }
        return a;
    }
}
