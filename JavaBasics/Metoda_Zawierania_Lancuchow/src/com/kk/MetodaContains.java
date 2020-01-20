package com.kk;

public class MetodaContains {
    public boolean czyZawiera(String pierwszyString, String drugiString){
        boolean sprawdzenieCzyZawiera = pierwszyString.indexOf(drugiString) !=-1? true: false;
        return sprawdzenieCzyZawiera;
    }
}
