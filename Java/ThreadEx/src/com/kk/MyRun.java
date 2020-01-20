package com.kk;

import java.util.Random;

public class MyRun implements Runnable {
    Random r = new Random();
    private int id;
    private int period = 0;
    private int liczba;

    public MyRun(int id){
        this.id = id;
        liczba = 0;

    }



    @Override
    public void run() {
        while(true){
            System.out.println("Watek"+id + " number: " + liczba++ + " period: " + period);
            try{
                Thread.sleep(period);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
