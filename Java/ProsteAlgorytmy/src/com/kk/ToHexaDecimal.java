package com.kk;

public class ToHexaDecimal {
    public static void main(String[] args) {
        System.out.println(convert(123456));
    }

    public static String convert(int a){
        String toHex = "ABCEDF";
        String result = " ";
        int r;

        while(a > 0){
            r = a%16;
            a = a/16;
            if(r < 10){
                result+=r;
            }else result += toHex.charAt(r-10);

        }

        String newResult = "";

        //odwrócenie wyniku metoda pierwsza

        for (int i = result.length() -1; i > 0 ; i--) {
            newResult += result.charAt(i);
        }

        //odwracanie wyniku metoda druga

//        return new StringBuilder().appednd(result).reverse().toString;

        return newResult;
    }
}
