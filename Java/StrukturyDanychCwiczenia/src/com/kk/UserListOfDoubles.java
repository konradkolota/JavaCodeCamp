package com.kk;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserListOfDoubles {
    public static void main(String[] args) {
        List<Double> newList = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj wielkość listy: ");
        int listSize = in.nextInt();
        Integer index = 1;
        double userNum;
        System.out.println();

        do {
            System.out.print("Podaj liczbę do dodania do listy (zostanie ona podzielona przez numer interacji): ");
            newList.add(userNum = in.nextDouble()/Double.valueOf(index));
            index++;
            System.out.println(newList);
        }while (newList.size() < listSize);

    }
}
