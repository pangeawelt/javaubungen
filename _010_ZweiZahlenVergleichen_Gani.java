package Uebungen;

import java.util.Random;

public class _010_ZweiZahlenVergleichen_Gani {

    public static void main(String[] args) {

        /*
         * Zwei Zahlen vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt
         * und testet, ob diese beiden Zahlen gleich sind
         * und dies nur ausgibt, wenn die Zahlen gleich sind.
         *
         * Hilfsmittel: Random.nextInt(), if
         */


        Random r = new Random();

        int x = (r.nextInt(2));
        int y = (r.nextInt(2));

        if (x == y) {
            System.out.println("You won the golden Spoon!: " + x + " und " + y);
        } else {
            System.out.println("Try again!: " + x + " und " + y);
        }
    }
}
