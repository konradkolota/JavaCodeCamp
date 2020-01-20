package com.kk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//PROGRAM SPRAWDZA CZY Z PODANYCH BOKÓW MOŻNA ZBUDOWAĆ TRÓPJKĄT


public class Main {

    public static void main(String[] args) {
        System.out.println(triangle(12,17,14));
    }

    public static boolean triangle(double a, double b, double c){
        List<Double> lengthList = new ArrayList<>();
        lengthList.add(a);
        lengthList.add(b);
        lengthList.add(c);
        lengthList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if(o1 > o2){
                    return 1;
                }else return -1;
            }
        });
        System.out.println(lengthList);

        if(lengthList.get(lengthList.size() - 1) < (lengthList.get(lengthList.size()-2)+(lengthList.get(lengthList.size()-3)))){
            return true;
        }
        else return false;
    }

}
