package ocm.kk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String linia = "";
        do {
            try {
                linia = br.readLine();
                System.out.println("Wczytana liinia teskstu to: ");
                System.out.println(linia);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!"exit".equals(linia));
    }
}
