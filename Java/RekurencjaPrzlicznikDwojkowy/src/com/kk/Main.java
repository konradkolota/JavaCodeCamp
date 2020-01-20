package com.kk;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(findAsNumber(1000));
    }



    public static int findAsNumber(int decimal_number) {
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 2 + 10 * findAsNumber(decimal_number / 2));
    }

    public static String findAsString(int n) {
        if(n==1){
            return "1";
        }
        else {
            if (n%2==1){
                return findAsString(n/2)+"1";
            }else return findAsString(n/2)+"0";
        }
    }
}
