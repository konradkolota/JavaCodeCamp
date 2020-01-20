package com.kk;

public class Nietoperz extends Ssaki{
    public Nietoperz() {
    }

    public Nietoperz(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        System.out.println("    ");
    }

    @Override
    public String toString() {
        return "Nietoperz o imieniu: " + imie;
    }
}
