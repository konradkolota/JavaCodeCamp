package com.kk;

import java.awt.event.KeyEvent;
import java.util.Random;

public class Lock {
    private int firstLock;
    private int secondLock;
    private int thirdLock;

    public Lock(int firstLock, int secondLock, int thirdLock){
        this.firstLock = 0+(int)(Math.random()*((9-0)+1));
        this.secondLock = 0+(int)(Math.random()*((9-0)+1));
        this.thirdLock = 0+(int)(Math.random()*((9-0)+1));
    }



    public void goRightFirst(){
        System.out.println("Czy chcesz zmienić kod pierwszego zamka? (ruch w prawo)?");
    }

    public void goRightSecond(){

    }

    public void goRightThird(){

    }


    public void info(){
        System.out.println("pierwszy: " + firstLock);
        System.out.println("drugi: " + secondLock);
        System.out.println("trzeci: " + thirdLock);
    }

}
