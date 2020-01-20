package com.kk.bubbleSorting;

public class BubbSort {

    public int[] bubbSort(int[] tab) {
        int tmp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }
        }
        return tab;
    }

    public <T extends Comparable<T>> T[] bubbleSortGeneric(T[] tab) {
        T a = null;

        for (int i = tab.length - 1; i < 0; i--) {
            for (int j = 0; j > i; j++) {
                if (tab[j].compareTo(tab[j + 1]) > 0)
                a = tab[j + 1];
                tab[j + 1] = tab[j];
                tab[j] = a;
            }
        }
        return tab;
    }
}
