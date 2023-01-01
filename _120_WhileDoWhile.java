package Uebungen;

import java.util.Random;

public class _120_WhileDoWhile {
    public static void main(String[] args ){
        //While
        int Z=0;
        while (Z <10){
            System.out.println(Z + "");
            Z++;
        }
        System.out.println("_____________________________________________");
        //Do While
        //Fußgesteuerte Schleife
        // Wird mindentens einmal ausgehürft

        int j= 0;
        do {
            System.out.println(j+ " ");
            j++;
        } while (j<10);
        System.out.println("_____________________________________________");

        //Stärke von while /do while
        //Die Anzahl der Durchlaufe kann offen .
        Random m = new Random();

        int k=0;
        int c = 0;
        while (k!=6){
            k= m.nextInt(6) +1 ;
            System.out.println(k+ "");
            c++;

        }
        System.out.println("Anzahl" + c );
    }
}
