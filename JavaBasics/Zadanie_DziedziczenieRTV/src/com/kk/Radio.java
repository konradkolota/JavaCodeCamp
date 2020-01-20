package com.kk;

import java.time.LocalDate;

public final class Radio extends UrzadzenieRTV {
    private double czestotliwosc;
    protected int iloscRadia=0;

    public Radio() {}

    public Radio(LocalDate dataProdukcji, int iloscWlaczen, boolean wlaczone, double czestotliwosc) {
        super(dataProdukcji, iloscWlaczen, wlaczone);
        this.czestotliwosc = czestotliwosc;
        iloscRadia++;
    }

    public double getCzestotliwosc() {
        return czestotliwosc;
    }

    public void setCzestotliwosc(double czestotliwosc) {
        this.czestotliwosc = czestotliwosc;
    }

    public String radioState() {
        if(wlaczone){
            return "wlaczone";
        }
        return "wylaczone";
    }

    @Override
    public String toString() {
        return "Rok produkcji radia: " + getDataProdukcji().getYear() +
                ".\nNazwa radia: " + getNazwa() + "R_" +iloscRadia+
                ".\nPrzewididywana ilość uruchomień: " + getIloscWlaczen() +
                ".\nRadio aktualnie jest " + radioState() +
                ".\nRadio działa na czcęstotliwości: " + getCzestotliwosc() +
                "MHz.";
    }
}
