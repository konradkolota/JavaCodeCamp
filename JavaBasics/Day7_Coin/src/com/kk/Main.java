package com.kk;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Coin> coins = new ArrayList<>();
//        coins.add(new Coin("10zł Chrobru Au", 1925, 1300));
//        coins.add(new Coin("20zł Chrobru Au", 1925, 2500));
//        coins.add(new Coin("5zł Piłsudski strzelecki ag", 1934, 300));
//        coins.add(new Coin("5zł Piłsudski strzelecki ag", 1934, 100));
//        coins.add(new Coin("Półtorak Koronny Z3W", 1633, 15));
//        coins.add(new Coin("Trojak Litewski Z3W", 1925, 70));
//        coins.add(new Coin("Denar WJ", 1396, 90));
//        coins.add(new Coin("Denar krzyżowy", 950, 150));

//        for (int i = 0; i < coins.size(); i++) {
//            System.out.println(coins.get(i));
//        }
//
//        for (ListIterator<Coin> i = coins.listIterator(); i.hasNext(); ) {
//            System.out.println(i.next());
//        }
//
//        //Duplikaty
//        int nr = 0;
//        for (ListIterator<Coin> i = coins.listIterator(); i.hasNext(); ) {
//            Coin c1 = i.next();
//            for (ListIterator<Coin> j = coins.listIterator(i.nextIndex()); j.hasNext(); ) {
//                Coin c2 = j.next();
//                if (c1.equals(c2)) {
////                    j.remove();   //ConcurrentModificationException
//                    nr = j.previousIndex();
//                }
//            }
//        }
//        coins.remove(nr);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//        for (ListIterator<Coin> i = coins.listIterator(); i.hasNext(); ) {
//            System.out.println(i.next());
//        }
//
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
//
//        Collections.sort(coins);
//        for (ListIterator<Coin> i = coins.listIterator(); i.hasNext(); ) {
//            System.out.println(i.next());
//        }
//
//        Collections.sort(coins, new Coin.YearComparator());
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//        for (ListIterator<Coin> i = coins.listIterator(); i.hasNext(); ) {
//            System.out.println(i.next());
//        }
//================SERIALIZACJA=========================
//        try {
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("monety.dat"));
//            out.writeObject(coins);
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //==================DESERIALIZACJA===================================

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("monety.dat"));
            coins = (List<Coin>) in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.getStackTrace();
        }

        for (int i = 0; i < coins.size() ; i++) {
            System.out.println(coins.get(i));
        }

    }
}
