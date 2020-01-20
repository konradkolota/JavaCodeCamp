package com.kk.insertSort;

import java.util.Arrays;

import static com.kk.insertSort.InstertionSort.insertSort;
import static com.kk.insertSort.InstertionSort.insertSortTwo;

public class Test {
    public static void main(String[] args) {

        Integer[] tabInt = new Integer[] {4,7,2,87,43,6,2,3,5,1,3,67,56,5432,23,47,56,8,68,4325,23,4243,5635,756};

        System.out.println(Arrays.toString(insertSort(tabInt)));
        System.out.println(Arrays.toString(insertSortTwo(tabInt)));



    }
}
