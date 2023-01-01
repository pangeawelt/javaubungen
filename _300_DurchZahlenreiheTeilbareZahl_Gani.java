package Uebungen;

import java.util.Scanner;

public class _300_DurchZahlenreiheTeilbareZahl_Gani {
    public static void main(String[] args) {
        /*
         * Durch Zahlenreihe teilbare Zahl
         *
         * Die kleinste positive Zahl,
         * die durch alle Zahlen von 1 bis 10 ohne Rest teilbar ist, ist die 2520.
         * Schreibe ein Programm mit der die kleinste positive Zahl ermittelt werden kann,
         * die durch alle Zahlen von 1 bis 40 ohne Rest teilbar ist.
         */

        Scanner scan= new Scanner(System.in);

        long a ;
        long b ;
        long max;
        System.out.println("Geben Sie 2 Zahlen");
        a= scan.nextInt();
        b=scan.nextInt();



        long min = (a < b ) ?  a : b;

        for (long i=min; i >0 ; i--){
            if ((a%i==0)&& ( b%i==0 )) {
                max = i;
                break;
            }


            }
        }



}












