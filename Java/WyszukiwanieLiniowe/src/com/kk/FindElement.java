package com.kk;

import javax.management.InstanceNotFoundException;
import java.util.Optional;
import java.util.Random;

public class FindElement {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[100];
        for (int i = 0; i < tab.length ; i++) {
            tab[i] = r.nextInt((10-1)+1);
        }

        try{
            System.out.println(findElement(5,tab));
        }catch(Exception e){
            System.out.println("Element not found");
        }

        System.out.println(findElementOpt(5,tab).orElse(-1));
    }

    private static int findElement(int a, int[] tab) throws InstanceNotFoundException {
        int res = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == a) {
                return i;
            }
        }            throw new InstanceNotFoundException();

    }

    private static Optional<Integer> findElementOpt(int a, int[] tab){
        Optional<Integer> opt = Optional.empty();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == a) {
                opt=Optional.ofNullable(i);
                return opt;
            }
        } return opt;

    }

}
