package com.kk;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.security.PublicKey;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        char[][] testTab = new char[4][4];
        char testFill = 'a';
        for (int i = 0; i < testTab.length; i++) {
            for (int j = 0; j < testTab[i].length; j++) {
                testTab[i][j] = testFill;
                testFill++;
                if (testFill == testTab.length) {
                    testFill = 'a';
                }

            }
        }

//1. Utwórz tablicę dwuwymiarową 2x10 typu int, inicjalizując ją wybranymi wartościami.

        int[][] tab1 = new int[2][10];
        Random r = new Random();

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = r.nextInt((10 - 1) + 1);
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===============================================================");

//        2. Utwórz tablicę dwuwymiarową 5x5 typu char, a następnie:
//        a) Wypełnij ją kolejnymi literami alfabetu (z użyciem 2 pętli, ile się zmieści);
//        b) Wypełnij ją losowymi znakami (konwertując int/byte na char);
//        c) Wypełnij ją kolejnymi literami alfabetu w odwrotnej kolejności (od z);
//        d) Wyświetl wszystkie tablice;

        char[][] tab2 = new char[10][10];

        // a)

        char filler = 'a';
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = filler;
                filler++;
                if (filler > 'z') {
                    filler = 'a';
                }
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===============================================================");

        // b)


        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = (char) r.nextInt();
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===============================================================");

        // c)
        filler = 'z';
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = filler;
                filler--;
                if (filler < 'a') {
                    filler = 'z';
                }
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        //3test
        System.out.println("\n===============================================================");
        System.out.println("Zadanie 3 test");
        printArray(tab2);
        System.out.println("\n===============================================================");
        //4test
        System.out.println("Zadanie 4 test");
        arrayToString(tab2);
        System.out.println("\n===============================================================");
        System.out.println("Zadanie 5 test");
        arrayTransp(tab2);
        System.out.println("\n===============================================================");
        System.out.println("Zadanie 6 test - DO ZROBIENIA!!!");
//        printArray(testTab);
//
//        System.out.println();
//        System.out.println();
//        changePlace(testTab);
        System.out.println("\n===============================================================");
        System.out.println("Zadanie 7 test");
        stringToArray("Konstatnynololitańczykowianczeka");

        System.out.println("\n===============================================================");
        System.out.println("Zadanie 8 test");
        textToArray("To jest test motody dodajacej znaki do tablicy");

        System.out.println("\n===============================================================");
        System.out.println("Zadanie 9 test     - DO ZROBIENIA");
        printSquare(3,10);

        System.out.println("\n===============================================================");
        //10. Narysuj literę N z użyciem pętli i instrukcji warunkowych.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || j == 5 || j == i) {
                    System.out.print('*');
                } else System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("\n===============================================================");
        System.out.println("Zadanie 11 test");
        generateRandomNum();

    }

//    3. Napisz metodę, która wypisuje wszystkie elementy tablicy dwuwymiarowej typu char (podawanej jako argument metody).

    public static void printArray(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
//    4. Napisz metodę, która będzie składać tablicę typu char w Stringa (wiersz po wierszu).

    public static void arrayToString(char[][] tab) {
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                String tmp = sentence.append(tab[j]).toString();
                sentence.delete(0, tab[j].length);
                System.out.print(tmp + " ");
            }
        }
    }

    //4. drugie rozwiazanie (bez stringbuildera)
    public static String arrayToStringAlter(char[][] tab) {
        String res = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                res += tab[i][j];
            }
        }return res;
    }


    //    5. Napisz metodę, która zamienia wiersze z kolumnami danej tablicy typu char (transponuje) i zwraca tak transponowaną nowoutworzoną tablicę.
    public static void arrayTransp(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = tab[j][i];
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }
    }


//        6. Napisz metodę, która dla tablic dwuwymiarowych typu char, będzie odwracać ich kolejność (element [1,1] zamienia się z elementem ostatnim, element [1,2] zamienia się z przedostatnim itd.)
//public static char[][] changeToLastTab (char tab[][]){
//    char[][] tabTrans = new char[tab.length][tab.length];
//    for (int i = 0; i < tab.length; i++) {
//        for (int j = 0; j < tab.length; j++){
//            tabTrans[tab.length-i-1][tab.length-j-1] = tab[i][j];
//        }
//    }
//    return printTab(tabTrans);

    //7. Napisz metodę, która zamienia Stringa na tablicę jednowymiarową typu char.
    public static void stringToArray(String s) {
        char[] stringArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            stringArray[i] = s.charAt(i);
            System.out.print(stringArray[i] + ", ");
        }
    }

    //8. Napisz metodę, która zamienia Stringa na tablicę dwuwymiarową typu char (kwadratową, nadmiarowe elementy tablicy pozostaw puste).
    public static void textToArray(String s) {
        int rowCount = 0;
        int columnCount = 0;
        int tempColumn = 0;
        String[] tmp = s.split(" ");

        for (int i = 0; i < s.length(); i++) {
            tempColumn++;
            if (s.charAt(i) == ' ') {
                rowCount++;
                if (tempColumn > columnCount) {
                    columnCount = tempColumn;
                }
                tempColumn = 0;
            }
        }

        char[][] stringArray = new char[rowCount + 1][columnCount];

        for (int i = 0; i < rowCount + 1; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (j < tmp[i].length()) {
                    stringArray[i][j] = tmp[i].charAt(j);
                } else stringArray[i][j] = ' ';
                System.out.print(stringArray[i][j] + ", ");
            }
            System.out.println();
        }


    }

    //9. Napisz metodę, która będzie rysowała kwadrat o zadanej grubości linii (np. 1 lub 2 gwiazdki).
    public static void printSquare (int thick, int size) {
        for (int i = 0; i < thick; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
        for (int i = 0; i < size - (2*thick); i++) {
            for (int j = 0; j < size; j++) {
                if (j < thick || j > size - thick - 1) {
                    System.out.print('*');
                } else System.out.print(' ');
            }
            System.out.println(' ');
        }
        for (int i = 0; i < thick; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }


    //11. Używając pętli while losuj liczby, aż do uzyskania liczby mniejszej niż 0.03. Wszystkie liczby wyświetlaj. Wyświetl liczbę losowań.
    public static void generateRandomNum() {
        int counter = 1;
        Random r = new Random();
        double num = r.nextDouble();
        System.out.println(num);
        while (num > 0.03) {
            num = r.nextDouble();
            System.out.println(num);
            counter++;
        }
        System.out.println("Liczba losowań: " + counter);
    }
}
