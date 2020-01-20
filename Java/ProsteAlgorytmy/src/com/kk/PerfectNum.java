package com.kk;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    public static boolean isPerfect(long a) {
        long summ = 1;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                summ += i + (a/i);
            }
        }
        System.out.println(summ);
        if (a == summ) {
            return true;
        } else return false;
    }
}
