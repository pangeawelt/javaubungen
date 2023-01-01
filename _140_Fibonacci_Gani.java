package Uebungen;

import java.util.Scanner;

public class _140_Fibonacci_Gani {

    public static void main(String[] args) {



        int zahl1=0;
        int zahl2=1;
        int ergebnis;

        for (int i=1 ; i<=17; i++){
            System.out.print(zahl1+ ", ");
            ergebnis= zahl1+zahl2;
            zahl1=zahl2;
            zahl2=ergebnis;

            if(zahl1>=500){
                break;
            }

        }
    }

}

     /*
         * Fibonacci
         *
         * Schreibe ein Programm, das die ersten 10 Zahlen der
         * Fibonacci-Folge ausgibt: 0 1 1 2 3 5 8 13 21 34
         *
         * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
         *
         * Die Fibonacci-Folge beginnt mit 0 und 1.
         * Ab dann entsteht die folgende Zahl
         * indem man jeweils die beiden vorherigen Zahlen addiert.
         *
         * Zusatz: Gib alle Zahlen unter 500 aus
         */


