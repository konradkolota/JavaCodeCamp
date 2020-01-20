package com.kk;

public class Pies extends Ssaki {

    public Pies() {
    }

    public Pies(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        for(int i = 0; i < imie.length(); i++){
            System.out.print("Hau ");
        }
    }

    @Override
    public String toString() {
        return "Nazywam się: " + imie;
    }
}
