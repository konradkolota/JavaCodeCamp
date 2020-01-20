package com.kk;

public class Kot extends Ssaki {
    protected int waga;
    public Kot() {
    }

    public Kot(int waga) {
        this.waga = waga;
    }

    public Kot(String imie, int waga) {
        super(imie);
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }

    @Override
    public void dajGlos() {
        char wzor = 'a';
        char wzorDwa = 'A';
        for(int i = 0; i < imie.length();i++){
            char zmienna = imie.charAt(i);
            if(zmienna == wzor || zmienna == wzorDwa){
                System.out.print("Miau ");
            }
        }
    }

    @Override
    public String toString() {
        return "Kot o imieniu: "+imie
                +" i wadze " + waga;
    }
}
