package com.kk;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File szyfr = new File("szyfr.txt");

        String line = "";
        String encTxt = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(szyfr));
            line = br.readLine();

            while(line !=null){
                encTxt += Cezar.encrypt(line, 1);
                System.out.println(encTxt);
                line = br.readLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1 = new File("zaszyfrowane.txt");

        try{
            FileWriter fw = new FileWriter(file1);
            fw.write(encTxt);
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
