package Uebungen;

import java.util.Random;
import java.util.Scanner;

public class _080_Begruessung_gani {
    public static void main(String[] args) {
        /*
         * Begrüßung
         *
         * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
         * ausgegeben werden.
         * Zwischen 22Uhr und 5Uhr: Gute Nacht
         * Vor 11Uhr: Guten Morgen
         * Vor 15Uhr: Mahlzeit
         * Vor 18Uhr: Guten Nachmittag
         * Vor 22Uhr: Guten Abend
         *
         * stunde per Random zwischen 0 - 23 erstellen
         */
        Random r = new Random();

        int stunde = (r.nextInt(24));


            if( stunde>=22 && stunde<5 ){
                System.out.println("Gute Nacht");
            }
            else if (stunde>5 && stunde<11){
                System.out.println("Guten Morgen");
            }
            else if (stunde>=11 && stunde<15){
                System.out.println("Mahlzeit");
            }
            else if (stunde>=15 && stunde<18){
                System.out.println("Guten Nachmittag");
            }
            else  if (stunde>=18 && stunde<22){
                System.out.println("Gute Abend");
            }

        System.out.println( "Es ist"  +" "+ stunde+" "+ "UHR");

    }


}
