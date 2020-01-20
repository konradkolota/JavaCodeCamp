package kk.grafika;

public class Punkt3D extends Punkt2D {
    private double z;

    public Punkt3D(){}

    public Punkt3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }


    public Punkt3D(double wsp) {
        super(wsp);
        this.z = wsp;
    }

    public Punkt3D(Punkt3D p){
       super(p);
        this.z = p.z;
    }

    @Override
    public void info() {
        System.out.println("Punkt3D o współrzędnych: (" + x + ", " + y + ", "+ z + ")");
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public void setXYZ(double x, double y, double z) {
        super.setXY(x, y);
        this.z = z;
    }

    public void setXYZ(Punkt3D pkt){
        setXY(pkt);
        this.z = pkt.z;
    }

    public void metoda3D(){
        System.out.println("Jestem trójwymiarowy");
    }
}
