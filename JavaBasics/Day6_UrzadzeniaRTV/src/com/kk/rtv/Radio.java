package com.kk.rtv;

public class Radio extends UrzadzenieRTV implements Soundable{

    private double czestotliwosc;

    public Radio() {
        super();
        czestotliwosc = 1000;
    }

    public Radio(String nazwa, int iloscWlaczen){
        super(nazwa, iloscWlaczen);
        czestotliwosc = 1000;
    }

    public Radio(int iloscWlaczen){
        super(iloscWlaczen);
    }

    @Override
    public void wlacz() {
        if(!czyWlaczone && iloscWlaczen > 0){
            iloscWlaczen--;
            System.out.println("Radio włączone");
            wlaczDzwiek();
            czyWlaczone = true;
        }
    }

    @Override
    public void wylacz() {
       if(czyWlaczone){
           System.out.println("Radio wyłączone");
           wylaczDzwiek();
           czyWlaczone = false;
       }
    }

    @Override
    public String toString() {
        return "Radio{" +
                "czestotliwosc=" + czestotliwosc +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", iloscWlaczen=" + iloscWlaczen +
                ", czyWlaczone=" + czyWlaczone +
                ", numerSeryjny=" + numerSeryjny +
                '}';
    }

    @Override
    public void wlaczDzwiek() {
        System.out.println("Dźwięk został włączony");
    }

    @Override
    public void wylaczDzwiek() {
        System.out.println("Dźwięk został wyłączony");
    }
}
