package kk.grafika;

public class Punkt2D {

    //właściwości, atrybuty, pola
    protected double x;
    protected double y;
    public static int iloscPunktow = 0;

    //Konstruktory
    public Punkt2D(){
        this.x = 0;
        this.y = 0;
        iloscPunktow++;
    }
    public Punkt2D(double x, double y){
        this.x = x;
        this.y = y;
        iloscPunktow++;
    }
    public Punkt2D(double wsp){
        this.x = this.y = wsp;
        iloscPunktow++;
    }

    public Punkt2D(Punkt2D p){
        this.x = p.x;
        this.y = p.y;
        iloscPunktow++;
    }

    //Metody
    public void info(){
        System.out.println("Punkt o współrzędnych (" + x + ", " + y + ")");
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXY(Punkt2D p){
        this.x = p.x;
        this.y = p.y;
    }

    public Punkt2D klonPunktu(){
        Punkt2D p = new Punkt2D(this.x, this.y);
        return p;
    }

    public void metoda2D(){
        System.out.println("Jestem dwuwymiarowy");
    }

    public String toString(){
        return "(" +  x + ", " + y + ")";
    }
}
