package com.kk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        checkPalindrome();

    }

    private static final boolean checkPalindrome() {

        String path = new String("C:\\Users\\User\\Desktop\\cwiczeniaJavaSolo\\AlgorytmyPalindrom\\palindrom.txt");
        String line = " ";
        BufferedReader file = null;
        List<String> lineList = new LinkedList<>();

        try {
            file = new BufferedReader(new FileReader(path));

            while (true) {
                line = file.readLine();

                if (line == null) {
                    break;
                }
                lineList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Błąd obsługi pliku");
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("Błąd zamykania");
                }
            }
        }


        for (String s :lineList) {
            System.out.println(s + checkPalindrome());
        }


        boolean result = true;
        line = line.toLowerCase();
        for (int i = 0; i < Math.round(line.length() / 2); i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
