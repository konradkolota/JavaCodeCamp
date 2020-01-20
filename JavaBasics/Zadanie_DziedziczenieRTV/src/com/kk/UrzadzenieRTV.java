package com.kk;

import java.time.LocalDate;
import java.util.Random;

abstract class UrzadzenieRTV {
    protected LocalDate dataProdukcji;
    protected String nazwa = generujNazwe();
    protected int iloscWlaczen;
    protected boolean wlaczone;

    public UrzadzenieRTV() {}

    public UrzadzenieRTV(LocalDate dataProdukcji, int iloscWlaczen, boolean wlaczone) {
        this.dataProdukcji = dataProdukcji;
        this.iloscWlaczen = iloscWlaczen;
        this.wlaczone = wlaczone;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }


    public String getNazwa() {
        return nazwa;
    }

    public int getIloscWlaczen() {
        return iloscWlaczen;
    }

    public boolean isWlaczone() {
        if (getIloscWlaczen() == 0) {
            return false;
        }
        return wlaczone;
    }

    public void setWlaczone(boolean wlaczone) {
        this.wlaczone = wlaczone;
    }

    public String generujNazwe() {
        String liniaKodu = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuWwYyZzQq0987654321";
        Random r = new Random();
        StringBuilder nazwaTymczasowa = new StringBuilder("rand1");
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(liniaKodu.length());
            nazwaTymczasowa.setCharAt(i, liniaKodu.charAt(index));
        }
        nazwa = nazwaTymczasowa.toString();
        return nazwa;
    }

    public String uszkodzone(){
        return "Urządzenie jest uszkodzone!";
    }

    public void wlacz(){}

    public void wylacz(){}

}

