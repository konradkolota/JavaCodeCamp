package pl.edu.pw.mini.jrafalko.person;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private LocalDate dataUrodzenia;
    private String email;
    Locale polishLocale = new Locale("pl", "PL");

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        Period lata = Period.between(dataUrodzenia, LocalDate.now());   //tak jest łatwiej
        this.wiek = lata.getYears();                                    //
        this.dataUrodzenia = dataUrodzenia;
        this.email = email;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

        this.email = "";
        LocalDate dzis = LocalDate.now();
        dataUrodzenia = dzis.minus(Period.ofYears(wiek));
    }

    public String szyfrCezara(int przesuniecie){

        String tablicaSzyfrow = "aąbcćdeęfghijklłmnńoóprstuwyzźż";
        String in = imie.toLowerCase() + " " + nazwisko.toLowerCase();//adam bąk

        StringBuilder zaszyfrowane = new StringBuilder(in);//adam bąk

        for (int i = 0; i < zaszyfrowane.length(); i++) {

            char c = zaszyfrowane.charAt(i); //szukamy i-ej litery
            int index = tablicaSzyfrow.indexOf(c);
            index = (index + przesuniecie) % tablicaSzyfrow.length();
            char literaZaszyfrowana = tablicaSzyfrow.charAt(index);

            zaszyfrowane.setCharAt(i, literaZaszyfrowana); //cdam bąk
        }
        return zaszyfrowane.toString();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", lat " + wiek +
                ", urodzony: " + dataUrodzenia + ", " +  dataUrodzenia.getDayOfWeek().getDisplayName(TextStyle.SHORT, polishLocale) +
                (email.equals("") ? "" : ", e-mail: " ) + email;
    }
}
