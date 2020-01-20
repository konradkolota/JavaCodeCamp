package com.kk;

public abstract class Truck {

    protected String name;
    protected int fuel;
    protected int maxFuelCapacity;
    protected int cargoMaxCapacity;
    protected int capacity;
    protected boolean service;
    protected String registrationNumber;

    public Truck(){}

    public Truck(String name, int fuel, int capacity, boolean service) {
        this.name = name;
        this.fuel = fuel;
        this.maxFuelCapacity = 700;
        this.cargoMaxCapacity = 22;
        this.capacity = capacity;
        this.service = service;
        this.registrationNumber = genereteRegistrationNumber();
    }

    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }

    public int getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public int getCargoMaxCapacity() {
        return cargoMaxCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    private String genereteRegistrationNumber(){
        StringBuilder tempNumber = new StringBuilder();
        String tab = "0123456789";

        for (int i = 0; i < 4 ; i++) {
            int index = (int)(tempNumber.length() * Math.random());
            tempNumber.append(tab.charAt(index));
        }
        return "BIA" + tempNumber.toString();
    }

}
