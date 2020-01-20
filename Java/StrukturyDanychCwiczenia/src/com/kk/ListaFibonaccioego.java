package com.kk;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaFibonaccioego {
    public static void main(String[] args) {
        System.out.print("Podaj ilość iteracji do kodu Fibonacciego: ");
        Scanner in = new Scanner(System.in);
        int cyfra = in.nextInt();
        List<Long>  fibList = new LinkedList<>();

        for (int i = 0; i < cyfra; i++) {
            fibList.add(fibonacci(i));
        }
        System.out.println(fibList);

        for (long x:fibList) {
            System.out.print(x + ", ");
        }
    }

    public static long fibonacci(int i){
        if(i < 2){
            return i;
        }else{
            return fibonacci(i-1) + fibonacci(i-2);
        }
    }
}
