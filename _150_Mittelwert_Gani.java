package Uebungen;


import java.util.Random;
import java.util.Scanner;

public class _150_Mittelwert_Gani {


    static double mittelwert(double x, double y,double z) {
            return ( x+y+z)/3;
    }


    public static void main(String[] args){



        Scanner nummer= new Scanner(System.in);
        System.out.println("1.Zahl");
        double x= nummer.nextInt();
        System.out.println("2.Zahl");
        double y= nummer.nextInt();
        System.out.println("3.Zahl");
        double z= nummer.nextInt();

        System.out.println("Mittelwert" +" "+ Math.round(mittelwert(x,y,z)));

    }
}
