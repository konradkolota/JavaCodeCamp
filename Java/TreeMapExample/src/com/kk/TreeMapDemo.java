package com.kk;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        //Implementacja za pomocą TreeMAp--------------------------------------------------------------------------------

        TreeMap<String, Double> treeMap = new TreeMap<>(); //tworzenie nowego drzewa treeMap z wartościami String i Double

        treeMap.put("Paradise Lost", 23.46);  //wstawienie wpisu do drzewa
        treeMap.put("Golden Tresury", 12.47);
        treeMap.put("Moon and the Sixpence", 65.28);
        treeMap.put("Holinshed", 7.67);
        treeMap.put("Ancient Mariner", 45.36);

        printAll(treeMap); //wyświetlenia całego drzewa

        treeMap.put("Paradise Lost", 23.56); //aktualizuje wartość dla danej pozycji
        printAll(treeMap);

        treeMap.put("Paradaise Regained", 23.56);
        printAll(treeMap);

        treeMap.put("Bubble Driver", 21.37);
        printAll(treeMap);
    }

    public static void printAll(TreeMap<String, Double> treeMap) {
        for (Map.Entry<String, Double> et : treeMap.entrySet()) {
            System.out.print(et.getKey() + ": " + et.getValue() + " ");
        }
        System.out.println();
    }
}
