package com.kk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ChangeCounter {

    public static void main(String[] args) throws IOException {

        int[] result = calculate();
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(denominations[i] + " x " + result[i]);
            }
        }
    }

    static double[] denominations = new double[]{500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.10, 0.02, 0.01};

    private static int[] calculate() throws IOException {

        int i = 0;
        double amount = 0;
        int[] numOfDen = new int[denominations.length];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj kwotę do obliczeń: ");

        Pattern pat = Pattern.compile("\\d+\\.\\d{2}|(\\d+)");

        while(!pat.matcher(br.readLine()).matches()){

        }



            amount = Double.parseDouble(br.readLine());


        while (amount >= 0.01) {
            int num = (int) (amount / denominations[i]);
            numOfDen[i] = num;
            amount -= numOfDen[i] * denominations[i];
            i++;

            amount = (Math.round(amount*100)/100.00);
        }
        return numOfDen;
    }
}
