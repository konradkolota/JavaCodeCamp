package com.kk;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String letter = "";
        try {
            letter = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        String finalLetter = letter;
        FilenameFilter fnf = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String pat = finalLetter + ".*";
                Pattern pattern = Pattern.compile(pat);
                Matcher matcher = pattern.matcher(name);
                return matcher.matches();
            }
        };


        File katalog = new File("c:/");
        String[] zawartosc = katalog.list(fnf);
        for (int i = 0; i < zawartosc.length; i++) {
            System.out.println(zawartosc[i]);
        }
    }
}
