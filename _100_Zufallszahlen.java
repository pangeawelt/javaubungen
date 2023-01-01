package Uebungen;

import java.util.Random ;

public class _100_Zufallszahlen {


public static void main(String[] args ) {

    Random r = new Random();
    System.out.println(r);  // Java.util.Random@65ab77665

    // nextInt(wert) Methode
// gibt 0 bis bound (exklusive) zurück

    System.out.println(r.nextInt(6)); //0-5
    System.out.println(r.nextInt(23 ) + 1); // 1-6
    System.out.println(r.nextInt(10));; // 0-9



}
}
