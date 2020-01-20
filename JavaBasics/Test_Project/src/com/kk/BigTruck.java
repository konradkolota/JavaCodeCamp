package com.kk;

public class BigTruck extends Truck {

    public enum Trailers{
        BOX("box trailer"),
        CURTAIN_SLIDER("curtain slider trailer"),
        SEMI_DUMP("semi dump trailer"),
        TANK("tank trailer"),
        REFRIGERATED("refriferated trailer");

        private String trailerType;

        Trailers(final String trailerType) {
            this.trailerType = trailerType;
        }
    }

    private Trailers trailer;

    public BigTruck() {
    }

    public BigTruck(String name, int fuel, int capacity, boolean service, Trailers trailer) {
        super(name, fuel, capacity, service);
        this.trailer = trailer;
    }

    public Trailers getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailers trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "BigTruck{" +
                "trailer=" + trailer +
                ", name='" + name + '\'' +
                ", fuel=" + fuel +
                ", maxFuelCapacity=" + maxFuelCapacity +
                ", cargoMaxCapacity=" + cargoMaxCapacity +
                ", capacity=" + capacity +
                ", service=" + service +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}

