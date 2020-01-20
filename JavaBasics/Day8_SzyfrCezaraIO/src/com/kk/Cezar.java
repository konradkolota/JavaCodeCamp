package com.kk;

import java.nio.CharBuffer;

public class Cezar {

    private static String tablicaSzyfrow = "aąbcćdeęfghijklmnoóprsśtuwyzźż ";

    public static String encrypt(String txt, int shitft){
        txt = txt.toLowerCase();

            StringBuilder encryptTxt = new StringBuilder(txt);

            for (int i = 0; i < encryptTxt.length(); i++) {
                char c = encryptTxt.charAt(i);
                int index = encryptTxt.indexOf(String.valueOf(c));
                index = (index + shitft) % tablicaSzyfrow.length();
                char literaZaszyfrowana = tablicaSzyfrow.charAt(index);

                encryptTxt.setCharAt(i, literaZaszyfrowana);
            }
        return encryptTxt.toString();
    }
}
