package com.kk;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test zadanie 1.");
        System.out.println("33333333: " +  checkNumber("33333333"));
        System.out.println("12345678: " + checkNumber("12345678"));
        System.out.println("01234567: " + checkNumber("01234567"));
        System.out.println("123456789: " + checkNumber("123456789"));
        System.out.println("--------------------------------------------");
        System.out.println("Test zadanie 2.");
        System.out.println("Polska: " + capitalLetterCountry("Polska"));
        System.out.println("polska: " + capitalLetterCountry("polska"));
        System.out.println("Stany Zjednoczone: " + capitalLetterCountry("Stany Zjednoczone"));
        System.out.println("asdasdasd: " + capitalLetterCountry("asdasdasd"));
        System.out.println("--------------------------------------------");
        System.out.println("Test zadanie 3.");
        System.out.println("asdf: " + checkThisWord("asdf"));
        System.out.println("asdfg: " + checkThisWord("asdfg"));
        System.out.println("asdfgholr: " + checkThisWord("asdfgholr"));
        System.out.println("arr: " + checkThisWord("arr"));
        System.out.println("asdfr: " + checkThisWord("asdfr"));

        System.out.println("--------------------------------------------");
        System.out.println("Test zadanie 4.");
        System.out.println("11001101: " + binaryCheck("11001101"));
        System.out.println("11001101: " + binaryCheck("1111111"));
        System.out.println("000000011: " + binaryCheck("000000011"));
        System.out.println("asd: " + binaryCheck("asd"));
        System.out.println("10101000100010101a: " + binaryCheck("10101000100010101a"));

        System.out.println("--------------------------------------------");
        System.out.println("Test zadanie 5.");
        System.out.println("aR2!w^op 99999: " + specificWordCheck("aR2!w^op 99999"));
    }


    //1. Sprawdź czy podany numer telefonu użytkownika jest prawidłowy (musi zawierać 8 cyfr i nie może zaczynać się na 0).
    public static boolean checkNumber(String s){
        Pattern wzor = Pattern.compile("[1-9]{8}");
        if(wzor.matcher(s).matches()){
            return true;
        }else return false;
    }

    //2. Sprawdź czy nazwa kraju rozpoczyna się z wielkiej litery.
    public static boolean capitalLetterCountry(String s){
        Pattern wzor = Pattern.compile("[A-Z]{1}[a-z]+\\s*[A-Z]*[a-z]*");
        if(wzor.matcher(s).matches()){
            return true;
        }else return false;
    }

    //3. Sprawdź czy słowo ma więcej niż 5 liter i kończy się literą „r”.
    public static boolean checkThisWord(String s){
        Pattern wzor = Pattern.compile("\\w{5,}r{1}");
        if (wzor.matcher(s).matches()){
            return true;
        }else return false;
    }

    //4. Sprawdź czy podana liczba jest prawidłową liczbą binarną.
    public static boolean binaryCheck(String s){
        Pattern wzor = Pattern.compile("[0-1]*");
        if (wzor.matcher(s).matches()){
            return true;
        }else return false;
    }

    //5. Sprawdź czy słowo rozpoczyna się z małej litery, następnie mogą wystąpić 3 dowolne znaki, 5 literą jest „w”, następnie dowolny znak i wyrażenie „op”, po spacji podany powinien być numer 5 cyfrowy bez 0 i 1.
    public static boolean specificWordCheck(String s){
        Pattern wzor = Pattern.compile("[a-z](.{3})?w.op\\s[2-9]{5}");
        if (wzor.matcher(s).matches()){
            return true;
        }else return false;
    }

}
