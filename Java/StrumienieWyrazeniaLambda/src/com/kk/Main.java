package com.kk;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //rozwiazanie z zajec
        String path = "C:\\Users\\User\\Desktop\\cwiczeniaJavaSolo\\StrumienieWyrazeniaLambda\\src\\com\\kk\\ksiazka.txt";
            try (Stream<String> lines = new BufferedReader(new FileReader(path)).lines()){
                List<String> linesList=lines.collect(Collectors.toList());
                linesList.stream()
//                        .peek(System.out::println)
                        .filter(s -> s.startsWith("I"))
                        .count();
                //a
                Stream<String> wordsStream = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linesList));
                Long wordsCount = wordsStream.count();
                System.out.println(wordsCount);
                //b
                Stream<String> wordsStreamB = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linesList));
                wordsCount = wordsStreamB
                        .filter(s -> s.length()>5)
                        .count();
                System.out.println(wordsCount);

                //c
                Stream<String> wordsStreamC = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linesList));
                wordsCount = wordsStreamC
                        .filter(s -> s.length()<3)
                        .count();
                System.out.println(wordsCount);

                //d
                Stream<String> wordsStreamD = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linesList));
                wordsCount = wordsStreamD
                        .filter(s -> s.length()%2!=0)
//                        .peek(System.out::println)
                        .count();
                System.out.println(wordsCount);

                //e
                Stream<String> wordsStreamE = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linesList));
                wordsCount = wordsStreamE




            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }



















//        // moje rozwiązanie -----------------------------------------
//
//
//        List<String> book = new ArrayList<>();
//        try (Stream<String> lines = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\cwiczeniaJavaSolo\\StrumienieWyrazeniaLambda\\src\\com\\kk\\ksiazka.txt")).lines()) {
//            book = lines.collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        //a) Wypisz ile jest słów w książce;
//        Long words = book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s"))).count();
//        System.out.println("Liczba słów w książce: " + words);
//        //b) Policz ile jest słów, których długość jest większa niż 5;
//        Long longerWords = book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .filter(x -> x.length()>5)
//                .count();
//        System.out.println("Liczba słów z ilością liter > 5: " + longerWords);
//        //c) Policz ile jest słów, których długość jest mniejsza niż 3;
//        Long shortWords = book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .filter(x -> x.length()>3)
//                .count();
//        System.out.println("Liczba słów z ilością liter < 3: " + shortWords);
//        //d) Policz ile jest słów, których długość jest liczbą nieparzystą;
//        Long evenWords = book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .filter(x -> x.length()%2==1)
//                .count();
//        System.out.println("Liczba słów z nieparzystą ilością liter:  " + evenWords);
//
//        //e) Wypisz wszystkie słowa zaczynające się z wielkiej litery;
//
//        //f) Wypisz wszystkie słowa, których długość jest większa niż 7;
//        System.out.println("Słowa z liczbą liter > 7: ");
//        book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .filter(x -> x.length()>7)
//                .forEach(System.out::print);
//        //g) Wypisz wszystkie słowa o długości równej 1;
//        System.out.println("Słowa z liczbą liter == 1 : ");
//        book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .filter(x -> x.length()==1)
//                .forEach(System.out::print);
////        h) Zamień wszystkie litery we wszystkich słowach na wielkie
//        System.out.println("Zamiana na wielkie litery każdego słowa");
//        book.stream()
//                .flatMap(line -> Arrays.stream(line.split("\\s")))
//                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
//                .forEach(System.out::print);

//        i) Zamień wszystkie litery we wszystkich słowach na małe;

//        j) Powtórz podpunkty e, f, g rozwiązanie zapisując w jednym stringu, słowa rozdzielone średnikiem;

//        k) Powtórz podpunkty e, f, g rozwiązanie zapisując w liście stringów;

//        l) Dla podpunktów e, f, g wypisz długości słów;

//        m) Dla podpunktów e, f, g wypisz tylko długości nieparzyste przemnożone przez 3;
//}

}

