package Uebungen;

import java.util.Random;

public class _170_SwitchCase {
    public static void main (String[] args){

        //Case ist der EINSTIEGSPUNKT
        // ohne break wird auch der näschte case ausgefürht.

        Random r = new Random();
        int nummer=  6 ;//r.nextInt(6)+1;

        System.out.println( nummer +" "+ "entspricht: ");

        switch (nummer){
            case 1 :
                System.out.println(" gut");
                break;
            case 2 :
                System.out.println("befriedigend");
                break;
            case 3 :
                System.out.println("mangelhaft");
                break;
            case 4 :
                System.out.println("Sehr gut");
                break;
            case 5 :
                System.out.println("mangelhaft");
                break;
            case 6 :
                System.out.println("ungenügend");
                break;
            default:
                System.out.println("FEHLER");




        }
        int tag = r.nextInt(7)+1;
        System.out.println(tag + " - ");
        switch (tag){
            case 1:
            case 2:
                System.out.println("Schöne Woche");
                break;
            case 3:
                System.out.println("Mittwoch");
            case 4:
            case 5:
                System.out.println("Schöne Woche");
                break;
            case 6:
            case 7:
                System.out.println("Schönes Wochenende");

        }
        String name ="Gani";
        switch (name){
            case "Peter":
                System.out.println("Pe");
                break;
            case "Paul":
                System.out.println("Pa");
                break;
            case "Mary":
                System.out.println("Ma");
                break;
            default:
                System.out.println("Den Namen kenne ich nicht ! ");
        }





    }
}
