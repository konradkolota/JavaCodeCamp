package com.kk;

public class TerminalExeptions extends Exception {

    public TerminalExeptions(){}

    public TerminalExeptions(String message){
        super(message);
    }
}

class CargoExeption extends TerminalExeptions{
    public CargoExeption() {
    }

    public CargoExeption(String message) {
        super(message);
    }
}

class EconomicExeption extends TerminalExeptions{
    public EconomicExeption() {
    }

    public EconomicExeption(String message) {
        super(message);
    }
}
