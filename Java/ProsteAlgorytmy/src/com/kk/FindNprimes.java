package com.kk;

import java.util.LinkedList;
import java.util.List;

public class FindNprimes {
    public static void main(String[] args) {
        findPrimes(10);
    }

    public static void findPrimes(int n) {
        List<Integer> list = new LinkedList<>();
        int l = 2;

        while (n > 0) {
            if(checkIfPrime(l)){
                list.add(l);
                n--;
            }
            l++;
        }
        System.out.println(list);

    }

    public static boolean checkIfPrime(int a) {
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }return true;
    }
}
