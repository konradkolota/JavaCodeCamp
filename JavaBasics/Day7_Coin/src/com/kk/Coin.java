package com.kk;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Coin implements Comparable, Serializable {

    protected int year;
    protected int value;
    protected String name;

    public Coin(String name, int year, int value) {
        this.year = year;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", z roku " + year + ", o wartości " + value ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return year == coin.year &&
                Objects.equals(name, coin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }

    @Override
    public int compareTo(Object o) {
        return this.value - ((Coin)o).value;
    }

    public static class YearComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return ((Coin)o1).year - ((Coin)o2).year;
        }
    }
}
