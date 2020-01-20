package com.kk;

public class Main {
    public static void main(String[] args) {
        BigTruck tir = new BigTruck("black betty", 600, 20, true, BigTruck.Trailers.SEMI_DUMP);
        System.out.println(tir);
    }
}
