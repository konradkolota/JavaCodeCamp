package com.kk;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomIntList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int num, min, max, count;
        System.out.print("Podaj minimalny przedział losowania: ");
        min = in.nextInt();
        System.out.println();
        System.out.print("Podaj maksymalny przedział losowania: ");
        max = in.nextInt();
        System.out.println();
        System.out.print("Podaj ilość elementów zbioru: ");
        count = in.nextInt();
        
        List<Integer> randomList = new LinkedList<>();

        for (int i = 0; i < count ; i++) {
            randomList.add(num = r.nextInt(max - min) + min);
        }

        System.out.println(randomList);

        for (int i:randomList) {
            System.out.print(i + ", ");
        }
    }
}
