package com.kk;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(euclidesik(999999, 555555));
        System.out.println(prostyEuklidesik(999999, 555555));
    }

    private static int euclidesik(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int m = 0;
            int n = 0;
            if (a >= b) {
                m = a;
                n = b;
            } else {
                m = b;
                n = a;
            }

            return euclidesik(n, m-n );
        }
    }

    private static int prostyEuklidesik(int a, int b){
        if(b==0){
            return a;
        }else return prostyEuklidesik(b, a%b);
    }
}
