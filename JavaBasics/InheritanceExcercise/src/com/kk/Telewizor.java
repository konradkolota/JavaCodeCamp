package com.kk;

        import java.time.LocalDate;
        import java.util.Random;

abstract class Telewizor extends UrzadzenieRTV {
    protected double przekatna;
    protected boolean rodzajSygnału;
    protected int odbieranyKanal;
    protected int iloscTV = 0;

    public Telewizor() {}

    public Telewizor(LocalDate dataProdukcji, int iloscWlaczen, boolean waczone, double przekatna, boolean rodzajSygnału, int odbieranyKanal) {
        super(dataProdukcji, iloscWlaczen, waczone);
        this.przekatna = przekatna;
        this.rodzajSygnału = rodzajSygnału;
        this.odbieranyKanal = odbieranyKanal;
        iloscTV++;
    }

    public double getPrzekatna() {
        return przekatna;
    }


    public boolean getRodzajSygnału() {
        return rodzajSygnału;
    }

    public int getOdbieranyKanal() {
        return odbieranyKanal;
    }

    public void setOdbieranyKanal(int odbieranyKanal) {
        this.odbieranyKanal = odbieranyKanal;
    }

    protected String tvState() {
        if(wlaczone){
            return "włączony";
        }
        return "wyłączony";
    }

    protected  String sygnal(){
        if(rodzajSygnału){
            return "analogowy";
        }
        return "cyfrowy";
    }

    public void wlacz(){
        Random rkanal = new Random();
        if(iloscWlaczen != 0 && !wlaczone){
            wlaczone = true;
            odbieranyKanal = rkanal.nextInt(1-100);
        } else System.out.println("Urządzenie uszkodzone!");
    }

    public void wylacz(){
        if(iloscWlaczen > 0 && wlaczone){
            wlaczone = false;
            odbieranyKanal = 0;
        }
    }
}