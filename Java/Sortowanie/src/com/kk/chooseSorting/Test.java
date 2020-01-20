package com.kk.chooseSorting;

import com.kk.bubbleSorting.BubbSort;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

            Random r = new Random();
            SortByChoice sort = new SortByChoice();
            int[] tab = new int[100];
            for (int i = 0; i < tab.length ; i++) {
                tab[i] = r.nextInt((100-1)+1);
            }
        System.out.println(Arrays.toString(sort.selectionSort(tab)));

    }
}
