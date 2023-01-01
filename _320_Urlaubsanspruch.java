package Uebungen;

import java.util.Scanner;

public class _320_Urlaubsanspruch {
    public static void main(String[] args) {
/*
     *Urlaubsanspruch
     *
     * Für die Bestimmung des Urlaubsanspruch der Beschäftigten einer Firma
     * soll ein Programm entwickelt wrden.
     * Die Grundlage für die Berechnung des Urlaubsanspruch
     * bildet die Betriebsvereinbarung.
     * Das Programm soll die Anzahlöder Urlaubstage für
     * jeweils einen Beschäftigten berechnen.
     *
     * Betriebsvereinbarung:
     * Allen Beschäftigten stehen 26 Tage Urlaub zu.
     * Minderjährige Beschäftigte erhalten 30 Tage Urlaub.
     * Beschäftigte die älter als 55 Jahre sind, erhalten 28 Tage Urlaub.
     * Beschäftigte mit einer Behinderung ab 50% erhalten
     * zusätzlich weitere 5 Tage Urlaub.
     * Beschäftigte mit einer Betriebszugehörigkeit von mehr als 10 Jahren
     * erhalten 2 zusätzliche Tage Urlaub.*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Geben Sie eine jt zahl ein.");
        int alt = scan.nextInt();; //wie alt

        System.out.println("bist du behindert?.");
        int bg = scan.nextInt();; //behinderung
        int ua = 0; // urlaubsanspruch
        int lg = 0; // weitere Urlaub

        if (alt < 18 && alt>15) {
            ua = 30;
        } else if (alt <= 55) {
            ua = 26;
        } else {
            ua = 28;
        }

        if (lg < 10) {
            ua = ua;
        } else {
            ua += 2;
        }

        if (bg >= 50) {
            ua += 5;
        } else {
            ua = ua;
        }
        System.out.println("Olley ! du hast " + ua + " Tage im Jahr Urlaub.");
    }
}




