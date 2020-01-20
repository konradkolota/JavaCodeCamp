package com.kk.quickSorting;

public class QuicSort {

    public static void quickSort(int[] tab) {
        quickSort(tab, 0, tab.length - 1);
    }

    protected static void quickSort(int[] tab, int li, int ri) {
        int l = li; //lewy indeks
        int r = ri; //prawy indeks
        int pInd = (li + ri) / 2; //indeks Pivot-a
        int tmp;

        while (l < r) { //warunek zakonczenia petli gdy indeks lewy nie bedzie mniejszy od prawego
            if (tab[l] > tab[pInd] || l == pInd) { //sprawdzamy czy element na lewo od pivota jest od niego wiekszy
                if (tab[r] < tab[pInd] || r == pInd) { // sprawdzamy czy element

                    tmp = tab[r];
                    tab[r] = tab[l];
                    tab[l] = tmp;

                    if (r==pInd){
                        pInd=l;
                    }else if(pInd ==l){
                        pInd=r;
                    }else {
                        if (r<pInd){
                            l--;
                        }
                    }
                }else {
                    if (l<pInd){
                        l++;
                    }
                }
            }

            if (li < ri){
                quickSort(tab, li, l-1);
                quickSort(tab, r+1, ri);
            }
        }
    }


    public static void qsort(int[] tab, int left, int right){
        int tmp;
        if (left < right){
            int m = left;
            for (int i = left+1; i <=right ; i++) {
                if (tab[i] < tab[left]){
                    ++m;
                    tmp = tab[m];
                    tab[m] = tab[i];
                    tab[i] = tmp;
                }
                tmp = tab[left];
                tab[left] = tab[m];
                tab[m] = tmp;
                qsort(tab, left, m-1);
                qsort(tab, m+1, right);
            }
        }
    }

}
