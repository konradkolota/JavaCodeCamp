package kk;

import javax.swing.text.html.parser.DocumentParser;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        int opcjaMenu = 1;
        Scanner wejscie = new Scanner(System.in);
        int a,b, suma;
        do {
            System.out.println("Wybierz opcję menu: ");
            System.out.println("(1) - dodawanie");
            System.out.println("(2) - odejmowanie");
            System.out.println("(3) - mnożenie");
            System.out.println("(4) - dzielenie");
            System.out.println("(0) - zakończ program");
            System.out.println("==============================");
            System.out.println();
            opcjaMenu = wejscie.nextInt();




            switch(opcjaMenu){
                case 1:
                    //dodawanie;
                    System.out.println("Podaj pierwszą zmienną a: ");
                    a = wejscie.nextInt();
                    System.out.println("Podaj drugą zmienną b:" );
                    b = wejscie.nextInt();
                    suma = dodawanie(a, b);
                    System.out.println("a + b = " + suma);
                break;
                case 2:
                    //odejmowanie
                    System.out.println("Podaj pierwszą zmienną a: ");
                    a = wejscie.nextInt();
                    System.out.println("Podaj drugą zmienną b:" );
                    b = wejscie.nextInt();
                    int roznica = a - b;
                    System.out.println("a - b = " + roznica);
                break;
                case 3:
                    //mnożenie
                    System.out.println("Podaj pierwszą zmienną a: ");
                    a = wejscie.nextInt();
                    System.out.println("Podaj drugą zmienną b:" );
                    b = wejscie.nextInt();
                    int mnozenie = a*b;
                    System.out.println("a * b = " + mnozenie);
                break;
                case 4:
                    //dzielenie
                    System.out.println("Podaj pierwszą zmienną a: ");
                    a = wejscie.nextInt();
                    System.out.println("Podaj drugą zmienną b:" );
                    b = wejscie.nextInt();
                    int dzielenie = a/b;
                    System.out.println("a / b = " + dzielenie);
                break;
                case 5:
                    info();
                    break;
                case 0:
                    //zakończenie programu
                    opcjaMenu = 0;
                    System.out.println("Kończenie pracy programu");
                break;
            }

        } while (opcjaMenu != 0);
    }


   static int dodawanie(int a, int b){
        int s = a + b;
        return s;
    }
    static void info(){
        System.out.println("Informacja do użytkownika");
    }

}

