package com.kk;

public class Pszczoła extends Owady {
    public Pszczoła() {
    }

    public Pszczoła(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        System.out.println("jo je pszczola!");
    }

    @Override
    public String toString() {
        return "Pszczoła o imieniu: " + imie;
    }
}
