package com.kk.bubbleSorting;

import java.util.Arrays;
import java.util.Random;

    public class Test {
        public static void main(String[] args) {
            Integer[] tabInt = new Integer[] {4,7,2,87,43,6,2,3,5,1,3,67,56,5432,23,47,56,8,68,4325,23,4243,5635,756};
            Random r = new Random();
            BubbSort sort = new BubbSort();
            int[] tab = new int[100];
            for (int i = 0; i < tab.length ; i++) {
                tab[i] = r.nextInt((100-1)+1);
            }

//            System.out.println(Arrays.toString(sort.bubbSort(tab)));
            System.out.println(Arrays.toString(sort.bubbleSortGeneric(tabInt)));


        }
}
