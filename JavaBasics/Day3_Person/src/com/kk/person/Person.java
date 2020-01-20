package com.kk.person;

public class Person {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Person(String inmie, String nazwisko, int wiek) {
        this.imie = inmie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }

    public String szyfrCezara(int przesuniecie){
        String tablicaSzyfrow = "aąbcćdeęfghijklmnoóprsśtuwyzźż ";
        String in = imie.toLowerCase() + " " +  nazwisko.toLowerCase();

        StringBuilder zaszyfrowane = new StringBuilder(in);

        for(int i = 0; i < zaszyfrowane.length(); i++){
            char c = zaszyfrowane.charAt(i);
            int index = tablicaSzyfrow.indexOf(c);
            index = (index + przesuniecie) % tablicaSzyfrow.length();
            char literaZaszyfrowana = tablicaSzyfrow.charAt(index);

            zaszyfrowane.setCharAt(i, literaZaszyfrowana);
        }
        return zaszyfrowane.toString();
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
        return imie + " " + nazwisko + ", lat " + wiek;
    }
}
