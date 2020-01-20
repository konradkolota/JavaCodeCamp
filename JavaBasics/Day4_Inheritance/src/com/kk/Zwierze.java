package com.kk;

abstract class Zwierze implements Sounadble {
    protected String imie;

    public Zwierze(){
        imie = "";
    }

    public Zwierze(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

//    public abstract void dajGlos();
}
