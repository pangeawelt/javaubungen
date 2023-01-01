package Uebungen;

import java.util.Random;

public class _30_KleinsteVonDreiUnterschiedlichen_Gani {

    public static void main(String[] args) {


        Random r = new Random();
        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int c = r.nextInt(100);

        while ((a==b)|| b==c|| a==c){
            a= r.nextInt((7));
            b= r.nextInt((7));
            c= r.nextInt((7));
        }

        System.out.println("(Zahl1:)"+" "+ a + " " + "(Zahl2:) " +  b + " "+"(Zahl3: )" + c );

        int largestNumber= (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        int kleinsteNummer= (a < b) ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println("The largest numbers is:  "+largestNumber);
        System.out.println("Die kleniste ist "+ kleinsteNummer);

        System.out.println("Andere a:  "+a);
        System.out.println("Andere b:  "+b);
        System.out.println("Andere c :  "+c);


       /* if (a < b && a <c) {
            System.out.println("Es ist die kleinste Zahl1 ;" + a);

        } else if( b<a && b<c) {
            System.out.println("Es ist die kleinste Zahl2 ;" + b  );


        }
        else  if(c<a && c<b){
            System.out.println("Es ist die kleinste Zahl2; " + c);
        }
        else {
            System.out.println(" Andere Möglichkeiten ");
        }
*/

        System.out.println("_______________________");

   /*     int a = 35;
        int b = 68;
        int c = 89;

        if (a < b && c > b) {
            System.out.println("Es ist kleinste;"+ a);

        } else {
            System.out.println("Es is nicht kleinste"  );

        }*/


    }
}