package com.kk.rtv;

public abstract class Telewizor extends UrzadzenieRTV implements Soundable, Visionable{

    protected int przekatnaEkranu;
    protected String rodzajSygnalu;
    protected int odbieranyKanal;

    public Telewizor(){
        przekatnaEkranu = 32;
    }

    public Telewizor(int przekatnaEkranu) {
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public Telewizor(String nazwa, int iloscWlaczen, int przekatnaEkranu) {
        super(nazwa, iloscWlaczen);
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public Telewizor(int iloscWlaczen, int przekatnaEkranu) {
        super(iloscWlaczen);
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public int getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }

    public String getRodzajSygnalu() {
        return rodzajSygnalu;
    }

    public void setRodzajSygnalu(String rodzajSygnalu) {
        this.rodzajSygnalu = rodzajSygnalu;
    }

    public int getOdbieranyKanal() {
        return odbieranyKanal;
    }

    public void setOdbieranyKanal(int odbieranyKanal) {
        this.odbieranyKanal = odbieranyKanal;
    }
}
