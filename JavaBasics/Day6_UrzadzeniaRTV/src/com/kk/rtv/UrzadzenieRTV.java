package com.kk.rtv;

import java.time.LocalDate;

public abstract class UrzadzenieRTV {

    protected LocalDate dataProdukcji;
    protected String nazwa;
    protected int iloscWlaczen;
    protected boolean czyWlaczone;
    protected static int iloscUrzadzenRTV = 0;
    protected final int numerSeryjny;

    public abstract void wlacz();
    public abstract void wylacz();

    public UrzadzenieRTV() {
        dataProdukcji = LocalDate.now();
        nazwa = "rtv";
        iloscWlaczen = 1000;
        czyWlaczone = false;
        iloscUrzadzenRTV++;
        numerSeryjny = iloscUrzadzenRTV;
    }

    public UrzadzenieRTV(String nazwa, int iloscWlaczen) {
        this.nazwa = nazwa;
        this.iloscWlaczen = iloscWlaczen;
        czyWlaczone = false;
        dataProdukcji = LocalDate.now();
        iloscUrzadzenRTV++;
        numerSeryjny = iloscUrzadzenRTV;
    }

    public UrzadzenieRTV(int iloscWlaczen) {
        this.iloscWlaczen = iloscWlaczen;
        dataProdukcji = LocalDate.now();
        czyWlaczone = false;
        nazwa = generujNazwe();
        iloscUrzadzenRTV++;
        numerSeryjny = iloscUrzadzenRTV;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isCzyWlaczone() {
        return czyWlaczone;
    }

    public int getNumerSeryjny() {
        return numerSeryjny;
    }

    String generujNazwe(){
        return "RTV";
    }
}
