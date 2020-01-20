package com.kk.Person;

import com.kk.Planet;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String imie;
    private String nazwisko;
    private Period wiekPeriod;
    private int wiek;
    private LocalDate dataUrodzenia;
    private LocalDate teraz;
    private String email;
    private double masa;

    public Person(String inmie, String nazwisko, int wiek) {
        this.imie = inmie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

        this.email = "";
        LocalDate dzis = LocalDate.now();
        dataUrodzenia = dzis.minus(Period.ofYears(wiek));
    }

    public Person(String imie, String nazwisko, LocalDate dataUrodzenia, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiekPeriod = Period.between(dataUrodzenia, teraz.now());
        this.dataUrodzenia = dataUrodzenia;
        this.email = email;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", lat " + wiek +
                ", urodzony: " + dataUrodzenia +
                (email.equals("") ? "" : ", e-mail: ") + email ;

    }
}
