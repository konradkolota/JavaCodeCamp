package com.kk.insertSort;

public class InstertionSort {
    protected static Integer[] insertSort(Integer[] tab){

        Integer tmp;

        for (int i = 1; i < tab.length ; i++) { //iterowanie po kolejnych nieposortowanych elementach
            for (int j = 0; j <i ; j++) { //iterowanie po kolejnych posortowanych elementach tablicy
                if (tab[i]<tab[j]){ //szukamy miejsca gdzie należy wstawić analizowany element (i)
                    tmp = tab[i]; //przechowanie watrości

                    for (int k = i; k > j ; k--) { // przesuniecie posortowaniej tablicy
                        tab[k]=tab[k-1];
                    }

                    tab[j] = tmp;
                }
            }
        }

        return tab;
    }

    protected static Integer[] insertSortTwo(Integer[] tab){
        int tmp, j;

        for (int i = 1; i < tab.length ; i++) { //iterowanie po kolejnych elementach tablicy
            tmp=tab[i]; //przechowywanie analizowanego elementu
            j=i-1; //bedziemy przesuwć poprzedni element wzgledem analizowanego

            while(j>=0 && tab[j]>tmp){ // przesuwanie az znajdziemy mijesce gdzie nalezy wstawic element
                tab[j+1]=tmp;
            }
            tab[j+1] = tmp; // wstawianie analizowanego elementu
        }
        return tab;
    }
}
