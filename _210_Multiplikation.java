package Uebungen;

import java.util.logging.SocketHandler;

public class _210_Multiplikation {

    public static void main(String[] args) {

        /*
         * Multiplikation
         *
         * Schreibe ein Programm, das ermittelt,
         * wie viele ganzzahlige Multiplikator-Multiplikand-Kombinationen
         * vom Produkt 8.420.000 es gibt,
         * bei denen sowohl Multiplikator, als auch Multiplikand
         * kleiner als 10.000 sind.
         *
         * 1000*8420 und 8420*1000 ist nur eine Kombination
         */

        int zahl=8420000;
        int multi;


        for (int i=1; i<=zahl; i++) {
            if (zahl % i == 0) {
                if (i < 10000) {

                    System.out.println(i + "*" + " " + (zahl / i) + "=" + zahl);


                }

            }
        }

    }
}
