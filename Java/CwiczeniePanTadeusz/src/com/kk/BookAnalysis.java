package com.kk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookAnalysis {
    String text = ""; //przechowanie całego tekstu
    String[] words;//tutaj znajduja sie wszystkie slowa
    String path = "C:\\Users\\User\\Desktop\\cwiczeniaJavaSolo\\CwiczeniePanTadeusz\\src\\com\\kk\\book.txt";

    BufferedReader inputFile = null;
    String line; //pojedyncza linia
    int numberOflines = 1; //liczba wczytanych linii

    Map<String, Integer> wordsMap = new HashMap<>(); //mapa w ktorej bedziemy trzymacslowa z liczba ich wystapienia
    Map<String, Integer> sortedWordsMap = new HashMap<>(); //mapa posortowanych slow

    public void analysis() throws IOException { //metoda analizujaca ksiazke
        try {
            //utworzenie BufferedReader z nowego FileReader na podstawie ksiazki
            inputFile = new BufferedReader(new FileReader(path));

            while(true){ //petla bedzie sie wykonywac dopoki wczytana linia nie bedzie nullem
                line = inputFile.readLine(); //wczytywanie pojedynczej linii ksiazki

                if(line == null){
                    break;
                }

                text += " ";
                text += line;

                numberOflines++;
            }

            System.out.println("Number of lines: " + numberOflines);
        }finally {
            if (inputFile!= null)
                inputFile.close(); // zamkniecie BufferedReadera
        }

        text = text.toLowerCase();
        words = text.split("[-...<,. ''>!?]");

        for (String word: words) {
            if (wordsMap.containsKey(word)){
                wordsMap.put(word,wordsMap.get(word)+1);
            }else {
                wordsMap.put(word, 1);
            }
        }

        wordsMap.remove("");

        sortedWordsMap = sortByValue(wordsMap);

//        for(Map.Entry<String, Integer> wpis : sortedWordsMap.entrySet()){
//            System.out.println(wpis.getKey() + ":" + wpis.getValue());
//        }

        for(int i=sortedWordsMap.size()-1;i>sortedWordsMap.size()-11;i--){
            List<Map.Entry<String, Integer>>list=new ArrayList<>(sortedWordsMap.entrySet());
            Map.Entry<String,Integer>entry = list.get(i);
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map){
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for(Map.Entry<K,V> entry : list){
            result.put(entry.getKey(), entry.getValue());
        }

        return result;

    }
}




