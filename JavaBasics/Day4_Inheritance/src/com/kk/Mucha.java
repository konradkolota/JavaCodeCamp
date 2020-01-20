package com.kk;

public class Mucha extends Owady {
    public Mucha() {
    }

    public Mucha(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        System.out.println("Bzzzzzzzzzzzzzz");
    }

    @Override
    public String toString() {
        return "Mucha o imieniu: " + imie;
    }
}
