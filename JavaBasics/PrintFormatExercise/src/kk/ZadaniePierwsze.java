package kk;

public class ZadaniePierwsze {
    public static void main(String[] args) {

        String imie = "Konrad";
        System.out.println("Witaj" + imie);

        String randomString = "przykładowy drugi string";
        System.out.println(imie + " " + randomString);

        String value1 = "test";
        String value2 = "test test";
        String value3 = "test test test";



        float a = 1.12345f;
        System.out.printf("Wartość zmiennej a = " + a + " zaokroglonej do 2 miejsc po przecinku wynosi: %10.2f",a);

        int a1 = 192;
        int a2 = 168;
        int a3 = 1;
        int a4 = 10;
        System.out.printf("\n%02X:%02X:%02X:%02X", a1, a2, a3, a4);

    }
}
