package com.kk;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //1.
        Random r = new Random();
        int[][] tab1 = new int[5][5];
        for (int i = 0; i < tab1.length; i++) {
            System.out.println();
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = r.nextInt((10 - 1) + 1);
                System.out.print(tab1[i][j] + " ");
            }

        }
        System.out.println();
        System.out.println();

        for (int[] i : tab1) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println("\n=======================================");

        //2a.
        double[][] tab2 = new double[10][10];
        for (int i = 0; i < tab2.length; i++) {
            System.out.println();
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = (i * tab2[i].length) + j + 1;
                System.out.print(tab2[i][j] + " ");
            }
        }
        System.out.println("\n=======================================");
        //2b.
        for (int i = 0; i < tab2.length; i++) {
            System.out.println();
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = r.nextDouble();
                System.out.print(tab2[i][j] + " ");
            }
        }

        System.out.println("\n=======================================");
        //2c.
        for (int i = 0; i < tab2.length; i++) {
            System.out.println();
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = i + j;
                System.out.print(tab2[i][j] + " ");
            }
        }

        System.out.println("\n=======================================");
        //3.
        printArray(3, 7);

        System.out.println("\n=======================================");
        //4.
        System.out.println("Suma randomowej tablicy: " + summArray(5, 10));

        System.out.println("\n=======================================");
        //5.
        System.out.println(transposition(tab2));

    }

    public static void printArray(int a, int b) {
        Random r = new Random();
        int[][] a1 = new int[a][b];
        for (int i = 0; i < a1.length; i++) {
            System.out.println();
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = r.nextInt((100 - 1) + 1);
                System.out.print(a1[i][j] + " ");
            }
        }
    }

    public static int summArray(int a, int b) {
        Random r = new Random();
        int summ = 0;
        int[][] a1 = new int[a][b];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = r.nextInt((100 - 1) + 1);
                summ += a1[i][j];
            }
        }
        return summ;
    }

    private static double[][] transposition(double[][] tab) {
        double[][] transposed = new double[tab[0].length][tab.length];
        Random r = new Random();

        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab.length ; j++) {
                transposed[j][i] = tab[i][j];
            }
        }
        return transposed;
    }
}
