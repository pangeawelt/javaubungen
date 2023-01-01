package Uebungen;

import java.util.Scanner;

public class _130_Korrektes_Datum {

    public static void main(String[] args) {

        /*
         * Korrektes Datum
         *
         * Die Meyer GmbH benötigt ein Modul,
         * das ein Datum auf Korrektheit prüft.
         * Ist das zu prüfende Datum korrekt,
         * so ist die Variable datok auf 1, andernfalls auf 0
         * zu setzen.
         *
         * Beispiele:
         *
         * 29.02.1999 - datok: 0
         * 29.02.2000 - datok: 1
         * 13.05.2000 - datok: 1
         * 32.05.2000 - datok: 0
         * 24.13.2000 - datok: 0
         *
         * Für die Jahre gilt: jahr > 1900 && jahr < 2100
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie ein Datum(dd.mm.jjjj) ein: ");
        String datum = scanner.nextLine();

        String jahrs = datum.substring(6);
        String monats = datum.substring(3, 5);
        String tags = datum.substring(0, 2);

        int jahr = Integer.parseInt(jahrs);
        int monat = Integer.parseInt(monats);
        int tag = Integer.parseInt(tags);

        if (jahr > 1900 && jahr < 2100 ) {
            if (monat <= 12) {
                if ((monat != 2 && tag <= 31) || (monat == 2 && tag <= 28) || (monat == 2 && (jahr%4 == 0 && (jahr%100 != 0 || jahr%400 == 0) && tag <= 29))) {
                    System.out.println(datum + " - datok: 0");
                } else {
                    System.out.println(datum + " - datok: 1");
                }
            } else {
                System.out.println(datum + " - datok: 1");
            }
        } else {
            System.out.println(datum + " - datok: 1");
        }






    }







}
