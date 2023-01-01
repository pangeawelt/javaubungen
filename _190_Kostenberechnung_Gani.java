package Uebungen;


import java.text.DecimalFormat;
import java.util.Scanner;

public class _190_Kostenberechnung_Gani {

    static double kosten(double preis, double anzahl) {
        return (anzahl * preis);
    }

    static double kosten(double preis) {
        return kosten(preis,100);
    }

    public static void main(String[] args) {
        DecimalFormat f= new DecimalFormat("#.00");
        System.out.println(f.format(kosten(100))+" " +"€");
        System.out.println(f.format(kosten(50))+" " +"€");
        System.out.println(f.format(kosten(60,50))+" " +"€");




        /*
         *Kostenberechnung
         *
         * Erstelle eine Methode zur Kostenabrechnung.
         * Dieser wird Preis, Anzahl und Währung als Argument übergeben
         * und sie soll daraus die Kosten berechnen und zurück geben.
         * Standardmäßig soll die Anzahl 100 betragen und die Währung Euro sein.
         * die Rückgabe soll formatiert mit zwei Stellen hinterm Komma erfolgen.
         */



    }

}

