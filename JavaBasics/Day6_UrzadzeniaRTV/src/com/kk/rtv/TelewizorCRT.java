package com.kk.rtv;

public final class TelewizorCRT extends Telewizor {

    public enum Kolor{
        KOLOROWY,
        CZARNO_BIALY
    }

    private Kolor kolor;

    public TelewizorCRT(){
        kolor = Kolor.CZARNO_BIALY;
    }

    public TelewizorCRT(Kolor kolor) {
        this.kolor = kolor;
    }

    public TelewizorCRT(int przekatnaEkranu, Kolor kolor) {
        super(przekatnaEkranu);
        this.kolor = kolor;
    }

    public TelewizorCRT(String nazwa, int iloscWlaczen, int przekatnaEkranu, Kolor kolor) {
        super(nazwa, iloscWlaczen, przekatnaEkranu);
        this.kolor = kolor;
    }

    public TelewizorCRT(int iloscWlaczen, int przekatnaEkranu, Kolor kolor) {
        super(iloscWlaczen, przekatnaEkranu);
        this.kolor = kolor;
    }

    @Override
    public void wlacz() {
        if(!czyWlaczone && iloscWlaczen>0){
            czyWlaczone=true;
            wlaczDzwiek();
            wlaczObraz();
            iloscWlaczen--;
        }
    }

    @Override
    public void wylacz() {
        if(czyWlaczone){
            wylaczDzwiek();
            wylaczObraz();
            czyWlaczone = false;

        }

    }

    @Override
    public void wlaczDzwiek() {
        if(czyWlaczone){
            System.out.println("Dźwięk włączonony");
        }
    }

    @Override
    public void wylaczDzwiek() {
        if(czyWlaczone){
            System.out.println("Dźwięk wylączony");
        }
    }

    @Override
    public void wlaczObraz() {
        if(czyWlaczone){
            System.out.println("Obraz wlączony");
        }
    }

    @Override
    public void wylaczObraz() {
        if(czyWlaczone){
            System.out.println("Obraz wylączony");
        }
    }

    @Override
    public String toString() {
        return "TelewizorCRT{" +
                "kolor='" + kolor + '\'' +
                ", przekatnaEkranu=" + przekatnaEkranu +
                ", rodzajSygnalu='" + rodzajSygnalu + '\'' +
                ", odbieranyKanal=" + odbieranyKanal +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", iloscWlaczen=" + iloscWlaczen +
                ", czyWlaczone=" + czyWlaczone +
                ", numerSeryjny=" + numerSeryjny +
                '}';
    }
}
