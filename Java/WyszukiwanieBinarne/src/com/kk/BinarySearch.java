package com.kk;

import javax.management.InstanceNotFoundException;

public class BinarySearch {
    public static void main(String[] args) {
        int[] tab = new int[]  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,45,67,89};

        try{System.out.println(binarySearch(tab,100));}
        catch (Exception e){
            System.out.println("Value not found!");
        }
    }

    private static int binraySearch(int[] tab, int a, int li, int ri) throws InstanceNotFoundException {
        int m = (li + ri) / 2;

        if(li > ri){
            throw new InstanceNotFoundException();
        }

        if (tab[m] == a) {
            return m;
        }

        if (a < tab[m]) {
             return binraySearch(tab, a, li, m - 1);
        } else return binraySearch(tab, a, m + 1, ri);

    }

    private static int binarySearch(int[] tab, int a) throws InstanceNotFoundException {
        return binraySearch(tab,a,0,tab.length-1);
    }

}
