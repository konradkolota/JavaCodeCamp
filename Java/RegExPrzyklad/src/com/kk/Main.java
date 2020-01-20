package com.kk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pattern wzorzec = Pattern.compile("[ab]+c");
        Matcher matcher = wzorzec.matcher("abc");

        System.out.println(matcher.matches());
        System.out.println(wzorzec.matcher("ababbc").matches());
        System.out.println(wzorzec.matcher("ddddddddddddddddddddddddddddddaabbbcdddddd").find());
        System.out.println(wzorzec.matcher("ddddddddddddddddddddddddddddddaabbbcdddddd").matches());

        Pattern wzgr = Pattern.compile("[^-]*--(\\w+)--.*");
        Matcher matchgr = wzgr.matcher("ASTRA --Bialy-- ok");
        System.out.println("Czy pasuje do regexp: " + matchgr.matches());
        System.out.println("Grupa(0): " + matchgr.group(0));
        System.out.println("String z grupy: " + matchgr.group(1));

    }
}
