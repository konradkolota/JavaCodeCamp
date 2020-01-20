package com.kk;

public class test {
    public static void main(String[] args) {
        getLarger wynik = new getLarger();
        int[] testArr1 = {12,345,5467,1,2,4,6,78,8,98};
        int[] testArr2 = {12,67,1,2,4,6,78,8,98,1,1,2,34,5,6};

        wynik.getLarg(testArr1, testArr2);
    }
}
