package kk.grafika;

public class Test {

    public static void main(String[] args) {

        //Tworzenie punktów domyślnych
        Punkt2D punkt1 = new Punkt2D();
        //double wsp_x = punkt1.x;
        double wsp_x = punkt1.getX();
        System.out.println(wsp_x);
        //double wsp_y = punkt1.y;
        double wsp_y = punkt1.getY();
        System.out.println(wsp_y);

        Punkt2D punkt2 = new Punkt2D();
//        double wsp_x2 = punkt2.x;
//        System.out.println(wsp_x);
//        double wsp_y2 = punkt2.y;
//        System.out.println(wsp_y);
//        System.out.println(punkt2.x);
//        System.out.println(punkt2.y);
        System.out.println(punkt2.getX());
        System.out.println(punkt2.getY());

        System.out.println(punkt1);
        System.out.println(punkt2);

        //Metoda wyświetlająca współrzędne
        System.out.println("\n------METODY------");
        punkt1.info();

        System.out.println("\n------------------");
//        punkt1.x = 3.5;
//        punkt1.y = 4.7;
        punkt1.setX(3.5);
        punkt1.setY(4.7);
        punkt1.info();
        punkt2.info();

        System.out.println("\n----Punkt 3----");
        Punkt2D punkt3 = new Punkt2D();
        punkt3.info();
        punkt3.setXY(100, 100.1);
        punkt3.info();

        System.out.println("\n----Kopiowanie wsp----");
        punkt1.info();
        Punkt2D punkt4 = new Punkt2D();
        punkt4.info();
        punkt4.setXY(punkt1);
        punkt4.info();

        System.out.println(punkt4.toString());
        System.out.println("Punkt 4: " + punkt4);

        System.out.println("\n----Konstruktory----");
        Punkt2D punkt5 = new Punkt2D(20.5, 6.3);
        punkt5.info();
        Punkt2D punkt6 = new Punkt2D(10);
        punkt6.info();

        Punkt2D punkt7 = new Punkt2D(punkt1);
        punkt7.info();

        Punkt2D punkt8 = punkt5.klonPunktu();
        punkt8.info();

        int ilosc = Punkt2D.iloscPunktow;
        System.out.println("Wszystkich punktów jest " + ilosc);

        System.out.println("========================================================================================");

        Punkt3D punkt9 = new Punkt3D();
        System.out.println(punkt9);
        punkt9.info();

        System.out.println("========================================================================================");


        Punkt3D punkt10 = new Punkt3D(2,4,5);
        System.out.println(punkt10);
        punkt10.info();

        System.out.println("========================================================================================");

        Punkt3D punkt11 = new Punkt3D(3);
        punkt11.info();
        System.out.println(punkt11);

        System.out.println("========================================================================================");

        Punkt3D punkt12 = new Punkt3D(punkt10);
        System.out.println(punkt12);
        punkt12.info();
        punkt12.setXYZ(4,6,8);
        punkt12.info();
        punkt12.setXYZ(punkt10);
        punkt12.info();

        System.out.println("Wszystkich pukntów jest: " + Punkt3D.iloscPunktow);

        System.out.println("========================================================================================");

        Punkt2D punkt13;
        punkt13 = new Punkt3D(1,2,3);
        punkt13.info();

        punkt13 = punkt8;
        punkt13.info();

        System.out.println("========================================================================================");

        Punkt3D punkt14;
//        punkt14 = (Punkt3D) punkt8;
//        punkt14.info();            //wywali błąd rzutowania

        System.out.println("========================================================================================");

        Punkt2D punkt15 = new Punkt3D(6);
        punkt15.info();

        punkt14 = (Punkt3D) punkt15;
        punkt14.info();

        System.out.println("========================================================================================");

        Punkt2D tablicaPunktow[] = new Punkt2D[5];
        tablicaPunktow[0] = punkt1;
        tablicaPunktow[1] = punkt11;
        tablicaPunktow[2] = new Punkt3D(4,7.2,6.5);
        tablicaPunktow[3] = new Punkt2D(7);
        tablicaPunktow[4] = punkt14;

        System.out.println("___Informacja o tabliy___");
        for(int i = 0; i < tablicaPunktow.length; i++){
            tablicaPunktow[i].info();
        }

        System.out.println("___Metoda 2D___");
        for(int i = 0; i < tablicaPunktow.length; i++){
            tablicaPunktow[i].metoda2D();
        }

        System.out.println("___Metoda 3D___");
        for(int i = 0; i < tablicaPunktow.length; i++){

            if(tablicaPunktow[i] instanceof  Punkt3D) {

                ((Punkt3D) tablicaPunktow[i]).metoda3D();
            }
        }


    }
}
