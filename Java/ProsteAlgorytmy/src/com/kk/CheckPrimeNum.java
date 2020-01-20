package com.kk;

public class CheckPrimeNum {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(11));
    }

    public static boolean checkIfPrime(int a) {
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }return true;
    }
}
