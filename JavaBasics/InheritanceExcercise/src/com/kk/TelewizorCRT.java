package com.kk;

import java.time.LocalDate;

public class TelewizorCRT extends Telewizor {
    private boolean kolor;

    public TelewizorCRT(boolean kolor) {
    }

    public TelewizorCRT(LocalDate dataProdukcji, int iloscWlaczen, boolean wlaczone, double przekatna, boolean rodzajSygnalu, int odbieranyKanal, boolean kolor) {
        super(dataProdukcji, iloscWlaczen, wlaczone, przekatna, rodzajSygnalu = true, odbieranyKanal);
        this.kolor = kolor;

    }

    public boolean isKolor() {
        return kolor;
    }

    private String kolorowy(){
        if(kolor){
            return "kolorowy";
        }
        return "czarno-biały";
    }

    @Override
    public String toString() {
        return "Rok produkcji telewizora płaskiego: " + getDataProdukcji().getYear() +
                ".\nNazwa telewizora płaskiego: " + getNazwa() + "TV_C_" + iloscTV +
                ".\nPrzewididywana ilość uruchomień: " + getIloscWlaczen() +
                ".\nTelewizor aktualnie jest " + tvState() +
                ".\nPrzekątka telewizora wynosi: " + getPrzekatna() +
                ".\nTelewizor odbiera sygnał: " + sygnal() +
                ".\nTelewizor działa na kanale: " + getOdbieranyKanal() +
                ".\nTelewizor jest: " + kolorowy();
    }
}
