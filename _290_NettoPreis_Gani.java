package Uebungen;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _290_NettoPreis_Gani {


        static double nettopreis (double bruttopreis, double mehrwertsteuer ) {
            return (bruttopreis /(mehrwertsteuer+1));
        }
    static double nettopreis (double bruttopreis) {
        return nettopreis(bruttopreis,0.19);
    }


    public static void main(String[]args ){

        DecimalFormat f= new DecimalFormat("#.00");
        System.out.println(f.format(nettopreis(1.19,0.19))+" " +"€");
        System.out.println(f.format(nettopreis(1.19,0.19))+" " +"€");
        System.out.println(f.format(nettopreis(1.19))+" " +"€");



        /*
         * Nettopreis
         *
         * Schreibe eine Methode zum Berechnen des Nettopreises.
         * Dieser Methode soll der Bruttopreis übergeben werden
         * und sie soll den Nettopreis zurück geben.
         * Der Mehrwertsteuersatz soll als zweiter Parameter
         * übergeben werden können.
         * Der Standardwert des Mehrwertsteuersatzes soll 19 sein.
         */



    }
}
