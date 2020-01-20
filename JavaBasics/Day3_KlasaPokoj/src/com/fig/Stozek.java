package com.fig;

import static java.lang.Math.*;

public class Stozek {
    private double r;
    private double h;

    public Stozek(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public Stozek(){
        r = h = 1;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double objetosc(){
        return 1.0/3 * PI * pow(r , 2) * h;
    }


}
