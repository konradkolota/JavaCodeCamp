package com.kk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out

        System.out.println("======================================================================================");
// nie da sie stworzyc w klasie abstrakcyjnej
//        Zwierze pies = new Zwierze("Behemot");
//        pies.dajGlos();
//        System.out.println(pies);

        System.out.println("======================================================================================");

//        Ssaki s1 = new Ssaki("Przemek");
//        System.out.println(s1);
//        s1.dajGlos();

        System.out.println("======================================================================================");

//        Owady o1 = new Owady("Czesiek");
//        System.out.println(o1);
//        o1.dajGlos();

        System.out.println("======================================================================================");

        Pies p1 = new Pies("Burek");
        p1.dajGlos();
        System.out.println();
        System.out.println(p1);

        System.out.println("======================================================================================");

        Pies p2 = new Pies();
        System.out.println(p2);
        p2.dajGlos();
        p2.setImie("Azor");
        System.out.println(p2);
        p2.dajGlos();
        System.out.println();

        System.out.println("======================================================================================");

//        Kot k1 = new Kot("Aaaaa");
//        k1.dajGlos();
//        System.out.println();
//        System.out.println(k1);

        System.out.println("======================================================================================");

        Nietoperz n1 = new Nietoperz("Gacek");

        System.out.println("======================================================================================");

        Mucha m1 = new Mucha("Tekla");

        System.out.println("======================================================================================");

//        Zwierze zoo[] = new Zwierze[9]; //mozna tworzyc tablice klasy abstrakcyjnej
////      zoo[0] = pies;  //klasa abstrakcyjna
//        zoo[0] = new Kot ("Hetman");
//        zoo[1] = new Pies ("Kasztan");
//        zoo[2] = new Koza("Kozojed");
//        zoo[3] = p1;
//        zoo[4] = p2;
//        zoo[5] = k1;
//        zoo[6] = n1;
//        zoo[7] = m1;
//        zoo[8] = new Pajak("Spiderino");

        System.out.println("===============================Tablica dźwięków");

//        for (Zwierze z : zoo) {
//            System.out.println("--");
//            z.dajGlos();
//        }

        System.out.println("===============================Tablica dźwięków ssaki");

//        for (Zwierze z : zoo) {
//            if (z instanceof  Ssaki){
//                z.dajGlos();
//                System.out.println(z);
//            }
//        }

        ListaPsow();
        ListaKotow();


    }

    private static void ListaPsow() {
        Pies dog1 = new Pies("Miszka");
        Pies dog2 = new Pies("Griszka");
        Pies dog3 = new Pies("Anton");
        Pies dog4 = new Pies("Masza");
        List<Pies> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        System.out.println(list);

        list.sort(new Comparator<Pies>() {
            @Override
            public int compare(Pies o1, Pies o2) {
                return o1.getImie().compareTo(o2.getImie());
            }
        });

        System.out.println(list);
    }

    private static void ListaKotow() {
        Kot cat1 = new Kot("Griszka", 2);
        Kot cat2 = new Kot("Anton", 8);
        Kot cat3 = new Kot("Miszka", 5);
        List<Kot> listaWagi = new ArrayList<>();
        listaWagi.add(cat1);
        listaWagi.add(cat2);
        listaWagi.add(cat3);

        listaWagi.sort(new Comparator<Kot>() {
            @Override
            public int compare(Kot k1, Kot k2) {
                if(k1.getWaga() < k2.getWaga()){
                    return -1;
                } else if(k1.getWaga() == k2.getWaga()){
                    return 0;
                }else return 1;
            }
        });

        System.out.println(listaWagi);
    }


}