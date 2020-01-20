package com.kk;

public class Mynumber {
    double liczba;
    double potega;

    public Mynumber(double liczba) {
        this.liczba = liczba;
    }

    public double getLiczba() {
        return liczba;
    }

    public void setLiczba(double liczba) {
        this.liczba = liczba;
    }

    private boolean isOdd(){
        if(liczba%2!=0){
            return true;
        }else return false;
    }

    private boolean isEven(){
        if(liczba%2==0){
            return true;
        }else return false;
    }

    private double sqrt(){
        return liczba*liczba;
    }

    private double power(double liczba, int potega){
        return Math.pow(liczba, potega);
    }

}
