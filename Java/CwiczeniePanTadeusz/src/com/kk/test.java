package com.kk;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        BookAnalysis panTadeusz = new BookAnalysis();

        try{
            panTadeusz.analysis();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
