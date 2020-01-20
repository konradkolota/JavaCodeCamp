package com.kk;

public class TriangleBuilder {
    public static void main(String[] args) {

    }

    private static boolean isPossible(double a, double b, double c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }else return false;
    }
}
