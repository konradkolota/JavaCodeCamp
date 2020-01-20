package com.kk.quickSorting;

import static com.kk.quickSorting.QuicSort.quickSort;

public class Test {
    public static void main(String[] args) {

        int[] tabInt = new int[] {4,7,2,87,43,6,2,3,5,1,3,67,56,5432,23,47,56,8,68,4325,23,4243,5635,756};
        quickSort(tabInt);
        for (int l: tabInt) {
            System.out.println(l);
        }

    }
}
