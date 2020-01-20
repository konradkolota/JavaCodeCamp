package com.kk;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        //Implementacja drzewa ze zbioru----------------------------------------------------------------------------------------------------------

        Integer[] nums ={2,4,1,6,3,7,9,5};  //tworzenie tablicy Integer i przypisanie wartości
        SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(nums)); //utworzenie zbioru SortedSet o nazwie tree i przypisanie tablicy nums jako setu

        System.out.println(tree.first()); //wypisanie pierwszego elementu drzewa
        System.out.println(tree.last()); //wypisanie ostatniego elementu

        printAll(tree); //drukuje drzewo

        System.out.println(tree.add(1)); // dodanie jedynki

        System.out.println(tree.add(11)); // dodanie 11

        printAll(tree.headSet(7)); //wyswietlenie drzewa do wartości 7 (bez 7)
        printAll(tree.subSet(2,5)); //wyswietlenie drzewa w zakresie od 2 do 4(bezz 5)
        printAll(tree.tailSet(4));//wyswietlenie końcówki drzewa od wartości 4


    }

    public static void printAll(SortedSet<Integer> tree){
        for (int s:tree) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }
}
