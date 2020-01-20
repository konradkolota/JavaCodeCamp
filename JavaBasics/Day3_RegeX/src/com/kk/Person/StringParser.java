//package com.kk.Person;
//
//import java.time.LocalDate;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class StringParser {
//    public static Person parse(String str) {
//        //"Henryk Uncwot urodzony 21.06.1978, mój e-mail: huncwot@.wp.pl"
//
//        Pattern wzorzec = Pattern.compile("([A-Z][a-ząęółńśźż]+)\\s+([A-Z][a-ząęółńśźż]+)\\s+[\\wążśźęćńół]*\\s+" +
//                "([0-9]{1,2})\\.([0-9]{1,2})\\.([0-9]{4}),\\s+\\w*\\s+e-mail:\\s+(.+@.+)");
//        Matcher dopasuj = wzorzec.matcher(str);
//
//        String imie = dopasuj.group(1);
//        String nazwisko = dopasuj.group(2);
//        int dzien = Integer.parseInt(dopasuj.group(3));
//        int miesiac = Integer.parseInt(dopasuj.group(4));
//        int rok = Integer.parseInt(dopasuj.group(5));
//        String email = dopasuj.group(6);
//
//        LocalDate dataUrodzenia =  LocalDate.of(rok, miesiac, dzien);
//        Person osoba2 = new Person(imie, nazwisko, dataUrodzenia, email);
//
//        return null;
//    }
//}
