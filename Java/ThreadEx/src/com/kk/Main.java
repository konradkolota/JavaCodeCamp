package com.kk;

public class Main {

    public static void main(String[] args) {
        Runnable[] runners = new Runnable[26];
        Thread[] threads = new Thread[26];

        for (int i = 0; i < 26 ; i++) {
            runners[i] = new MyRun(i);
        }

        for (int i = 0; i < 26; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for (int i = 0; i < 26; i++) {
            threads[i].start();
        }


    }



}
