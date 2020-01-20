package com.kk;

public class Pajak extends Owady {

    public Pajak() {
    }

    public Pajak(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        System.out.println("Jo je pajak!");
    }

    @Override
    public String toString() {
        return "Pajak o imieniu: " + imie;
    }
}
