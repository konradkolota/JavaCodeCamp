package com.kk;

import java.time.LocalDate;

public class TelewizorPlaski extends Telewizor {

    public enum matryca{
        LCD("lcd"),
        LED("led"),
        PLAZMA("plazma");

        private  String screen;

        matryca(final String screen){
            this.screen = screen;
        }

        public String toString(){
            return screen;
        }
    }

    private matryca matryca;

    public TelewizorPlaski() {}

    public TelewizorPlaski(LocalDate dataProdukcji, int iloscWlaczen, boolean wlaczone, double przekatna, boolean rodzajSygnału, int odbieranyKanal, TelewizorPlaski.matryca matryca) {
        super(dataProdukcji, iloscWlaczen, wlaczone, przekatna, rodzajSygnału, odbieranyKanal);
        this.matryca = matryca;
    }

    @Override
    public String toString() {
        return "Rok produkcji telewizora płaskiego: " + getDataProdukcji().getYear() +
                ".\nNazwa telewizora płaskiego: " + getNazwa() +"TVF"+iloscTV+
                ".\nPrzewididywana ilość uruchomień: " + getIloscWlaczen() +
                ".\nTelewizor aktualnie jest " + tvState() +
                ".\nPrzekątka telewizora wynosi: " + getPrzekatna() +
                ".\nTelewizor odbiera sygnał: " + sygnal() +
                ".\nTelewizor działa na kanale: " + getOdbieranyKanal() +
                ".\nTelewizor ma matrycę: " + matryca;
    }
}

