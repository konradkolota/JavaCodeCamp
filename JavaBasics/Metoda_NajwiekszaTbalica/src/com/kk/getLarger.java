package com.kk;

public class getLarger {
    public void getLarg(int[] tab1, int[] tab2){
        int suma1 = 0;
        int suma2 = 0;
        int[] finalTab;

        for(int i = 0; i < tab1.length; i++){
            suma1 += tab1[i];
        }

        for(int i = 0; i < tab2.length; i++){
            suma2 += tab2[i];
        }

        System.out.println("Suma tablicy pierwszej: " + suma1);
        System.out.println("Suma tablicy drugiej: " + suma2);



        if(suma1 > suma2){
            finalTab = tab1;
            for(int i = 0; i< finalTab.length; i++){
                System.out.println(finalTab[i]);
            }
        }else if(suma1 < suma2){
            finalTab = tab2;
            for(int i = 0; i< finalTab.length; i++){
                System.out.println(finalTab[i]);
            }
        }else System.out.println("Tablice mają te same sumy");

    }

}
