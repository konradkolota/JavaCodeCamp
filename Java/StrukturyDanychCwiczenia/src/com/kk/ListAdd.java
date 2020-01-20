package com.kk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListAdd {
    public static void main(String[] args) {
        List<Integer> testListOne = new LinkedList<>();
        List<Integer> testListTwo = new LinkedList<>();
        Random r = new Random();
        int num;

        for (int i = 0; i < 20; i++) {
            testListOne.add(num = r.nextInt((100-10)+10));
        }
        System.out.println(testListOne);

        for (int i = 0; i < 10 ; i++) {
            testListTwo.add(num = r.nextInt((80-20)+20));
        }
        System.out.println(testListTwo);

       listAdd(testListOne,testListTwo);
    }

    public static void listAdd(List<Integer> x, List<Integer> y){
        List<Integer> summList = new LinkedList<>();
        for(int i = 0; i < x.size(); i++){
            summList.add(x.get(i) + y.get(i));
            if(x.size() < y.size()){
                for (int j = 0; j < y.size()-x.size(); j++) {
                    x.add(0);
                }
            }else if(y.size() < x.size()){
                for (int j = 0; j < x.size()-y.size(); j++) {
                    y.add(0);
                }
            }
        }
        System.out.println(summList);
    }
}
