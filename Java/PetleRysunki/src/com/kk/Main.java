package com.kk;

public class Main {

    public static void main(String[] args) {

        System.out.println("Rysunek trójkąta");
        drawTriangle(6);

        System.out.println();
        System.out.println("\nRysunek slash");
        drawSlash(5);

        System.out.println();
        System.out.println("\nRysunek kwadrat");
        drawRectabgle(5);

        System.out.println();
        System.out.println("\nRysunek x");
        drawX(5);
    }


    public static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void drawSlash(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    public static void drawRectabgle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    public static void drawX(int n) {
        for (int i = 1; i < n+1; i++) {
            System.out.println();
            for (int j = 0; j < n+1; j++) {
                if(i == j){
                    System.out.print("*");
                }else if(i + j == n+1){
                    System.out.print("*");
                }else System.out.print(" ");
            }
        }
    }


}
