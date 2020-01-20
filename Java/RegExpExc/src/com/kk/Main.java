package com.kk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern wzor = Pattern.compile("[ABC]?\\w*apa");

        System.out.println(wzor.matcher("Zxcd").matches());
        System.out.println(wzor.matcher("Japa").matches());
        System.out.println(wzor.matcher("Aapa").matches());
        System.out.println(wzor.matcher("Aasdggtdfsdfsafsare_apa").matches());
        System.out.println("===============================================================");
        Pattern wzor1 = Pattern.compile("[B-Z][a-z]{4,7}[0-5]{2}");
        System.out.println(wzor1.matcher("BCDasdfgg12").matches());
        System.out.println(wzor1.matcher("asdvsdgtesarfwq4r32q45").matches());
        System.out.println(wzor1.matcher("ABCqqweq12").matches());
        System.out.println(wzor1.matcher("CDEasdfghjklp12").matches());
        System.out.println(wzor1.matcher("CDEasdfghjklp121234").matches());
        System.out.println(wzor1.matcher("Babcde14").matches());
        System.out.println("===============================================================");
        Pattern poprawneImie = Pattern.compile("[A-Z][a-z]{2,}");
        System.out.println(poprawneImie.matcher("Adam").matches());
        System.out.println(poprawneImie.matcher("Adam123").matches());
        System.out.println(poprawneImie.matcher("Ad am").matches());
        System.out.println("===============================================================");
        Pattern poprawnyMail = Pattern.compile(".+@.+\\.pl");
        System.out.println(poprawnyMail.matcher("asdasdasd@asdasd.pl"));
        System.out.println("===============================================================");
        Pattern poprawnaData = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    }
}
