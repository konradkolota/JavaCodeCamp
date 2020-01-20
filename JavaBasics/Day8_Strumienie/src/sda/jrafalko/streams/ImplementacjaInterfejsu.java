package sda.jrafalko.streams;

import sda.jrafalko.figures.Figura;

import java.util.List;
import java.util.Map;

public class ImplementacjaInterfejsu implements MetodyStrumieniowe {

    List<Figura> figury;

    public ImplementacjaInterfejsu(List<Figura> fig) {
        this.figury = fig;
    }

    /**
     * 1
     *
     * @return Największa figura względem pola wysokosc
     */
    @Override
    public Figura getNajwiekszaFigure() {
        return null;
    }

    /**
     * 2
     *
     * @return Figura o najmniejszym polu powierzchni
     */
    @Override
    public Figura getFigureONajmniejszymPolu() {
        return null;
    }

    /**
     * 3
     *
     * @return Najwyższa figura 3D
     */
    @Override
    public Figura getNajwyzszaFigure3D() {
        return null;
    }

    /**
     * 4
     *
     * @return Najmniejszy stożek względem objętości
     */
    @Override
    public Figura getNajmniejszyStozek() {
        return null;
    }

    /**
     * 5
     *
     * @return Lista figur posortowanych względem pola powierzchni
     */
    @Override
    public List<Figura> getPosortowaneWzgledemPowiezchni() {
        return null;
    }

    /**
     * 6
     *
     * @return Druga figura z posortowanych malejaco względem obwodu
     */
    @Override
    public Figura getDrugaZPosortowanychMalejacoWgObwodu() {
        return null;
    }

    /**
     * 7dd
     *
     * @return Lista pięciu pierwszych figur posortowanych rosnąco względem pola powierzchni,
     * o wysokości nie większej niż 10 i polu powierzchni nie mniejszym niż 10
     */
    @Override
    public List<Figura> getPierwszePiecPosortowaneRosnacoWgPowierzchni() {
        return null;
    }

    /**
     * 8
     *
     * @return Lista wszystkich sześcianów o długości boku nie większej niż 10
     */
    @Override
    public List<Figura> getSzesciany() {
        return null;
    }

    /**
     * 9
     *
     * @return Koło o najmniejszym polu powierzchni
     */
    @Override
    public Figura getNajmniejszeKolo() {
        return null;
    }

    /**
     * 10
     *
     * @return Mapa figur względem ID
     */
    @Override
    public Map<Integer, Figura> mapaWgId() {
        return null;
    }

    /**
     * 11
     *
     * @param pole Max pole powierzchni
     * @return Ilość figur o polu powierzchni nie większym niż "pole"
     */
    @Override
    public int getiloscMalych(double pole) {
        return 0;
    }

    /**
     * 12
     *
     * @return Posortowany ciąg figur zaczynając od podanej w nr
     */
    @Override
    public List<Figura> posortowaneWgPolaZaczynajacOd(int nr) {
        return null;
    }
}
