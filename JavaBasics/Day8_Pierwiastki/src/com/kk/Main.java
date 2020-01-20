package com.kk;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Double a = 0.0;
        Double b = 0.0;
        Double c = 0.0;
        String A;
        String B;
        String C;
        boolean isOk = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj współczynniki równania kwadratowego (Ax^2 + Bx + C = 0): ");

        while(!isOk) {
            try {
                isOk = true;
                System.out.print("A = ");
                A = br.readLine();
                System.out.print("B = ");
                B = br.readLine();
                System.out.print("C = ");
                C = br.readLine();

                a = Double.parseDouble(A);
                b = Double.parseDouble(B);
                c = Double.parseDouble(C);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Zły strumień wejścia, podaj liczbę!");
                isOk = false;
            }

            double delta = b * b - 4 * a * c;
            System.out.println(delta);


            if(delta < 0){
                System.out.println("Nie da się obliczyć pierwiastków rzeczywistych równania");
            }else if(delta == 0){
                double x = -b/(2*a);
                System.out.println("Jeden pierwiastek rzeczywisty: x = " + x);
            }else{
                double x1 = (-b - Math.sqrt(delta))/2*a;
                double x2 = (-b + Math.sqrt(delta))/2*a;
                System.out.println("Dwa pierwsiastki: x1 = " +  x1 + " x2 = " + x2);

            }
        }



    }
}
