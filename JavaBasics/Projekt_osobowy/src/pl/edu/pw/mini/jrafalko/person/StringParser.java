package pl.edu.pw.mini.jrafalko.person;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {


    public static Osoba parse(String str){

        //"Mateusz Konieczno urodzony 21.06.1978, mój e-mail: mkonieczko@op.pl"

        String wz = "([A-Z][a-ząęółćńśźż]+)\\s+([A-Z][a-ząęółćńśźż]+)" +
                "\\s+[\\wąęółćńśźż]*\\s+([0-9]{1,2})\\.([0-9]{1,2})\\.([0-9]{4})," +
                "\\s+[\\wąęółćńśźż]*\\s+e-mail:\\s+(.+@.+)";
        Pattern wzorzec = Pattern.compile(wz);
        Matcher matcher = wzorzec.matcher(str);

        Osoba os = null;
        if (matcher.matches()) {
            String imie = matcher.group(1);
            String nazwisko = matcher.group(2);
            int dzien = Integer.parseInt(matcher.group(3));
            int miesiac = Integer.parseInt(matcher.group(4));
            int rok = Integer.parseInt(matcher.group(5));
            String email = matcher.group(6);
            LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);

            os = new Osoba(imie, nazwisko, dataUrodzenia, email);
        }

        return os;
    }
}
