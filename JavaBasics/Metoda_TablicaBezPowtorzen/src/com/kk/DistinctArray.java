package com.kk;

public class DistinctArray {
    public int[] getDistinct(int[] tab){
        int length = tab.length;


        //szukanie duplikatow
        for(int i = 1; i <tab.length;i++){
            for(int j = 0; j < i; j++){
                if(tab[i] == tab[j]){
                    length--; //zmniejszenie dlugosci nowej tablicy gdy  znajdzie duplikat
                    break;
                }
            }
        }

        int[] finalArray = new int[length]; //tablica z nową długością
        finalArray[0] = tab[0]; //przypisanie pierwszego elementu starej tablicy do nowej tablicy

        int index = 1; //miejsce drugiego elementu
        boolean isDuplicate;

        for(int i = 1; i < tab.length; i++){
            isDuplicate = false;
            for(int j = 0; j < i; j++){
                if(tab[i] == tab[j]){
                    isDuplicate = true; //jesli znajdzie duplikat ustawia boolean na true
                    break;
                }
            }

            if(!isDuplicate) { //jeśli nie jest duplikatem umieszcza w finalArray
                finalArray[index] = tab[i];
                index++;
            }
        }


        for(int i = 0; i < finalArray.length; i++){
            System.out.println(finalArray[i]);
        }

        return finalArray;


    }
}
