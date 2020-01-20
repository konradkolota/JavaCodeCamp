package pl.edu.pw.mini.jrafalko;

import pl.edu.pw.mini.jrafalko.person.Osoba;
import pl.edu.pw.mini.jrafalko.person.StringParser;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        for (String str: args) {
//            System.out.println(str);
//        }


        Osoba os1 = new Osoba("Zenon", "Bąk", 33);

        System.out.println(os1);

        //System.out.println(os1.szyfrCezara(3));

        Osoba os2 = StringParser.parse("Mateusz Konieczno urodzony 21.06.1978, mój e-mail: mkonieczko@op.pl");
        System.out.println(os2);

    }
}
