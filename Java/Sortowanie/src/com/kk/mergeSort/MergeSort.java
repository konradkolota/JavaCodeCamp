////package com.kk.mergeSort;
////
////import java.util.Arrays;
////
////public class MergeSort {
////    public static void main(String[] args) {
////
////        int T[] = {4,-6, 6, 4, 12, -3, 72, 6, -6, 1, 5, 8, 2, -1};
////        mergeSort(T, 0, T.length-1);
////
////        for (int l:T[]) {
////            System.out.print(l + ", ");
////        }
////
////    }
//
////    private static int[] mergeSrot(int[] tab) {
////        if (tab.length == 1) { //jezeli dlugosc tablicy wynosi 1 to tablica jest posortowana
////            return tab; //zwracamy tablice dlugosci 1
////        } else {
////            int[] A = mergeSrot(Arrays.copyOfRange(tab, 0, tab.length / 2));
////            int[] B = mergeSrot(Arrays.copyOfRange(tab, tab.length / 2, tab.length));
////
////            int[] res = new int[tab.length];
////            int i = 0; //iterowanie po tablicy A
////            int j = 0; //iterowanie po tablicy B
////
////            for (int k = 0; k < res.length; k++) {//interujemy po elementach tablicy wynikowej
////                if (i < A.length) {
////                    if (j < B.length) { //
////                        if (A[i] > B[i]) {
////                            res[k] = B[j];
////                            j++;
////                        } else {
////                            res[k] = A[i];
////                            i++;
////                        }
////                    } else res[k] = A[i];
////                    i++;
////                }
////            }
////
////
////        }
////
////    }
//
//    static void scalaj(int T1[], int left, int mid, int right) {
//        int left1 = left;
//        int left2 = mid + 1;
//        int[] T2 = new int[T1.length];
//        int i = left1;
//
//        while ((left <= right) && (left2 <= right)) {
//            if (T1[left1] < T1[left2]) {
//                T2[i] = T1[left1];
//                left1++;
//            } else {
//                T2[i] = T1[left];
//                left2++;
//            }
//            i++;
//        }
//        while (left1 <= mid) {
//            T2[i] = T1[left1];
//            left1++;
//            i++;
//        }
//        while (left2 <= right) {
//            T2[i] = T1[left2];
//            left2++;
//            i++;
//        }
//        for (i = left; i <= right; i++) {
//            T1[i] = T2[i];
//        }
//    }
//
//    static void mergeSort(int[] T, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(T, left, mid);
//            mergeSort(T, mid + 1, right);
//            scalaj(T, left, mid, right);
//        }
//    }
//}
