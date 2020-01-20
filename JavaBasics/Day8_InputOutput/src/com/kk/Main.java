package com.kk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        try {
            char c = (char) System.in.read();
            System.out.println("Wpisany znak to: " + c);
            System.out.println("Jego kod ASCII to: " + (byte) c);
        } catch (IOException e) {
            System.out.println("Nie udało się odczytać z klawiatury");
        }
    }

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    try{
        String linia = br.readLine();
        System.out.println("Wczytana liinia teskstu to: ");
        System.out.println(linia);
    }catch (IOException e){
        e.printStackTrace();
    }
}
