package Uebungen;

public class _040_Fakultat_gani {
    public static void main(String[] args){
        /*
        Schreibe ein Programm
        * das ermittelt welche Zahl möglichst gross ist
        * ohne das ihre Fakultät über 1.000.000.000 ist
        *HInweis :
        * Fakültät von 5 (Kurzschreibweisse: 5!):
        * 1*2*3*4*50 !"120
        */

        int i=1;
        int counter= 1;

        int ergebniss= 1;

        while (ergebniss < 1000000000)

        {ergebniss= ergebniss*i ;
            i++;
            counter++;
        }
        System.out.println("Grösstmögliche Zahl bildet " + (counter-1)) ;
        System.out.println("Denn Fakultät "+ counter + " bildet "+ergebniss);

    }

}

