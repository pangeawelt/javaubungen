package Uebungen;

import static java.lang.Math.abs;

public class _190_Mathe {
    public static void main(String[] args ){

        //min() & max()
        //
        System.out.println(Math.max(3,7));
        System.out.println(Math.min(3,70));
        System.out.println(Math.pow(2,8)); // 256.0
        System.out.println(Math.pow(2,8)); // 256.0
        System.out.println(Math.sqrt(64)); // 8.0


    // abs Betrag (der Wert ohne Vorzeichen)- absolut
        System.out.println(Math.abs(-7));
        // 0 bis 0.99999999
        System.out.println(Math.round(Math.random())); //zb 0.4654

    // Würfel per random()
        System.out.println(Math.round(Math.random()*6)); // 0 bis 5
        System.out.println("__________");
        System.out.println(Math.floor(Math.random()*6+1)); // 1 bis 6



    }

}
