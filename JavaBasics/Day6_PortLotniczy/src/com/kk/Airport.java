package com.kk;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Airport {
    private List<Plane> planes;

    Airport(int planesNumber) {
        planes = new ArrayList<>();
        planes.add(new PassangerPlane("TU154", 600, 300));
        planes.add(new PassangerPlane("JumboJet", 1200, 500));
        planes.add(new PassangerPlane(gen.generate(7), 1200, 500));
        planes.add(new CargoPlane("Twowarek1", 1300, 40));
        planes.add(new CargoPlane("Twowarek2", 900 , 150));
        planes.add(new FighterPlane("Jet1", 2000 , 150));
    }

    Consumer<Plane> consumer1 = plane -> System.out.println(plane);
    Consumer<Plane> consumer2 = plane -> plane.land();

    public void AirportOperations(){
        planes.forEach(consumer1);
    }

    Generable gen = length -> {
        String litery = "abcdefghijklmnoprstuqyz";
        Random r = new Random();
        int len = r.nextInt(length) + 1;
        String s = "";
        for (int i = 0; i < len ; i++) {
            int letter = r.nextInt(litery.length());
            s += litery.charAt(letter);
        }
        return s;
    };

    private abstract class Plane {

        protected String name;
        protected int hoursInAir;
        protected boolean inAir;
        protected boolean afterCheckIn;
        protected int maxSpeed;

        public Plane(String name, int maxSpeed) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            hoursInAir = 0;
            afterCheckIn = false;
            inAir = false;
        }

        public abstract void start(int hours);

        public abstract void land();

        public abstract void checkIn(int number) throws EconomicsExeption, CargoExeption;
    }

    // ================ SAMOLOT PASAŻERSKI
    //====================================

    private class PassangerPlane extends Plane {

        private int maxPassangerNumber;
        private int passangers;

        public PassangerPlane(String name, int maxSpeed, int maxPassangerNumber) {
            super(name, maxSpeed);
            passangers = 0;
        }

        @Override
        public void start(int hours) {
            if (!inAir && afterCheckIn) {
                inAir = true;
                hoursInAir += hours;
                System.out.println("Plane ready to lift off");
            } else System.out.println("We can not start");
        }

        @Override
        public void land() {
            if (inAir) {
                inAir = false;
                afterCheckIn = false;
                System.out.println("We landed safely");
            } else System.out.println("We`re on the ground already");
        }

        @Override
        public void checkIn(int number) throws EconomicsExeption, CargoExeption {
            if (number < maxPassangerNumber / 2) {
                throw new EconomicsExeption("Za mała liczba pasażerów, samolot nie odleci");
            } else if (number > maxPassangerNumber) {
                afterCheckIn = true;
                passangers = maxPassangerNumber;
                throw new CargoExeption("Za dużo o " + (number - maxPassangerNumber) + " pasażerów");
            } else {
                afterCheckIn = true;
                passangers = number;
            }
        }

        @Override
        public String toString() {
            return "Passenger plane named: " + name +
                    (inAir ? " has already lifted off, his speed is " + maxSpeed + ", with " + passangers + " on a board." : " can not start");
        }


    }

    // ================SAMOLOT TOWAROWY===
    //====================================

    private class CargoPlane extends Plane {
        private int maxCargo;
        private int cargo;

        public CargoPlane(String name, int maxSpeed, int maxCargo) {
            super(name, maxSpeed);
            cargo = 0;
        }

        @Override
        public void start(int hours) {
            if (!inAir && afterCheckIn) {
                inAir = true;
                hoursInAir += hours;
                System.out.println("Plane ready to lift off");
            } else System.out.println("We can not start");
        }

        @Override
        public void land() {
            if (inAir) {
                inAir = false;
                afterCheckIn = false;
                System.out.println("We landed safely");
            } else System.out.println("We`re on the ground already");
        }

        @Override
        public void checkIn(int number) throws EconomicsExeption, CargoExeption {
            if (number < maxCargo / 2) {
                throw new EconomicsExeption("Not enough cargo to start");
            } else if (number > maxCargo) {
                afterCheckIn = true;
                cargo = maxCargo;
                throw new CargoExeption("Za dużo o " + (number - maxCargo) + " ton towaru");
            } else {
                afterCheckIn = true;
                cargo = number;
            }
        }

        @Override
        public String toString() {
            return "Cargo plane " +
                    (inAir ? " has already lifted off, his speed is " + maxSpeed + ", with " + cargo + " on a board." : " can not start");
        }
    }
    // ================ SAMOLOT WOJSKOWY==
    //====================================

    //
    private class FighterPlane extends Plane {
        private int maxAmmo;
        private int ammo;

        public FighterPlane(String name, int maxSpeed, int maxAmmo) {
            super(name, maxSpeed);
            ammo = 0;
        }

        @Override
        public void start(int hours) {
            if (!inAir && afterCheckIn) {
                inAir = true;
                hoursInAir += hours;
                System.out.println("Plane ready to lift off");
            } else System.out.println("We can not start");
        }

        @Override
        public void land() {
            if (inAir) {
                inAir = false;
                afterCheckIn = false;
                System.out.println("We landed safely");
            } else System.out.println("We`re on the ground already");
        }

        @Override
        public void checkIn(int number) throws EconomicsExeption, CargoExeption {
            if (number < maxAmmo / 2) {
                throw new EconomicsExeption("Not enough cargo to start");
            } else if (number > maxAmmo) {
                afterCheckIn = true;
                ammo = maxAmmo;
                throw new CargoExeption("Za dużo o " + (number - maxAmmo) + " bomb");
            } else {
                afterCheckIn = true;
                ammo = number;
            }
        }

        @Override
        public String toString() {
            return "Cargo plane " +
                    (inAir ? " has already lifted off, his speed is " + maxSpeed + ", with " + ammo + " on a board." : " can not start");
        }
    }

    Random r = new Random();

    public void checkInMethod(Plane plane) {
        int pass = r.nextInt(400 - 10) + 10;
        try {
            plane.checkIn(pass);
        } catch (EconomicsExeption e) {
            System.out.println(e.getMessage());
            ;
        } catch (CargoExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public void liftOffAll() {
        for (Plane p : planes) {
            checkInMethod(p);
        }

        for (Plane p : planes) {
            p.start(r.nextInt(20));
        }

        for (Plane p : planes) {
            System.out.println(p);
        }
    }



}
