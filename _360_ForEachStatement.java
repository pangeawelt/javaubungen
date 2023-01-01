package Uebungen;

import java.util.ArrayList;
import java.util.List;

public class _360_ForEachStatement {
    public static void main(String[] args) {

        List<String> wert1 = new ArrayList<String>();
        wert1.add("Ali");
        wert1.add("Mehmet");
        wert1.add("Gani");
        for (int i =0; i<wert1.size(); i++) {
            String wer=wert1.get(i);
            if(i>0){
                System.out.print(",");
            }
            System.out.println(wer);
        }

        System.out.println("--------------------");
        int[] wert= new int[3];
        wert[0]=10;
        wert[1]=15;
        wert[2]= new Integer(5);
        for (int i=1; i<wert.length; i++){
            System.out.println(wert[i]-wert[i-1] + " ");
        }

        System.out.println("-----------------");
        List<String> values = new ArrayList<String>();
        values.add("Ali");
        values.add("Mehmet");
        values.add("Gani");
        for (String value:values){
            System.out.println(values+" ");
        }
        System.out.println("-----------------");

        final String [] list = new String[3];
        list[0]="Lisa";
        list[1]="Ali";
        for (String name:list){
            System.out.print(name+" ");
        }

        String [] names = new String[3];
        for (String name:names)
            System.out.println(name+" "); //OUTPUT NULL NULL NULL
       /* String names ="Ali";
        for (int name:names){
            System.out.println(name+" ");//OUTPUT FEHLER WEGEN int steht im for
        }*/
        /*String names ="Ali";
        for (String name:names){  //OUTPUT FEHLER WEGEN IST ES NICHT EIN ARRYLISTE
            System.out.println(name+" ");*/

    }
}
