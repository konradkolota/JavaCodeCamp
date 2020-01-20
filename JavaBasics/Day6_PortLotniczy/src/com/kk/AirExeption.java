package com.kk;

public class AirExeption extends Exception {

    public AirExeption() {
    }

    public AirExeption(String message) {
        super(message);
    }
}

class CargoExeption extends AirExeption{
    public CargoExeption() {
    }

    public CargoExeption(String message) {
        super(message);
    }
}

class EconomicsExeption extends AirExeption{
    public EconomicsExeption() {
    }

    public EconomicsExeption(String message) {
        super(message);
    }
}
