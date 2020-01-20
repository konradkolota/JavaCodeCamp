package com.kk;

import java.util.LinkedList;
import java.util.List;

public class NumberDecompose {
    public static void main(String[] args) {
        decompose(123456);
    }

    public static void decompose(int a){
        List<Integer> decomp = new LinkedList<>();
        int div = 2;
        while(a>1){
           while(a%div == 0){
               a/= div;
               decomp.add(div);
           }
           div++;
        }
        System.out.println(decomp);
    }
}
