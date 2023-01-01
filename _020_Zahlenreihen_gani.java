package Uebungen;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class _020_Zahlenreihen_gani {

    public static void main(String[] args) {
        long start= System.currentTimeMillis();

        System.out.println(" __________");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " ");


        }
        System.out.println();

        System.out.println(" __________");
        for (int i = 100; i>0 ; i-=10) {
            System.out.println(i + " ");


        }
        System.out.println(" __________");
        for (int i = 2000; i<7000 ; i+=1000) {
            System.out.println(i + " ");


        }

        System.out.println(" __________");
        for (int i = 2000; i<7000 ; i+=1000) {
            System.out.println(i + " ");


        }
        long end= System.currentTimeMillis();
        NumberFormat formatter= new DecimalFormat("0.00000");

    }


}
/*
     Schreibe eine for Schleife , die Folgendes ausgibt.
    1 2 3 4 5

    2.
    Schreibe eine for Schleife , die Folgendes ausgibt:
    100 90 80 70 60
    3.
    Schreibe eine for Schleife , die Folgendes ausgibt:
    * 2000 3000 4000


     */



