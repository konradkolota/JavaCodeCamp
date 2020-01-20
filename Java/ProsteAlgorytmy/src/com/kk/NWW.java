package com.kk;

public class NWW {
    public static void main(String[] args) {
        System.out.println("Najmniejsza wspólna wielokrotność wynosi:  " + NwW(111,11));
    }

    public static int NwW(int a, int b){
        int nww = (a*b)/ euklides(a,b);
        return nww;
    }

    private static int euklides(int a, int b){
        if(b==0){
            return a;
        }else return euklides(b, a%b);
    }
}
