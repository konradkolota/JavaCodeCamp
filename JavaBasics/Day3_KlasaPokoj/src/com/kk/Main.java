package com.kk;


public class Main {
    public static void main(String[] args) {
        Pokoj sypialnia = new Pokoj(5,3,10);
        System.out.println(sypialnia);
        System.out.println(sypialnia.getVelocity());
        System.out.println(sypialnia.getArea());
        System.out.println(sypialnia.getSufit());
        System.out.println(sypialnia.getWallsArea());

        Pokoj lazienka = new Pokoj(2);
        System.out.println(lazienka);
        System.out.println(lazienka.getWallsArea());

    }
}
