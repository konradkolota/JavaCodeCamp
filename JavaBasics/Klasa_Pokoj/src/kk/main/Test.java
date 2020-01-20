package kk.main;

public class Test {
    public static void main(String[] args) {
        Pokoj sypialnia = new Pokoj(1.5, 2,3,"Biały");
        sypialnia.info();

        Pokoj[] pokojArray = {
                new Pokoj(1.5, 2,3,"Biały"),
                new Pokoj(1.5, 4, 5, "Biały"),
                new Pokoj(1.5, 2,2,"Brązowe")
        };

        for(int i = pokojArray.length; i>0; i--){
            System.out.println(pokojArray[i-1]);
        }


    }
}
