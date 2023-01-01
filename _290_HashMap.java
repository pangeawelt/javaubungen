package Uebungen;

import java.util.Collection;
import java.util.HashMap;

public class _290_HashMap {
    public static void main(String[] args ){
        //Hashmap (sonst Dictionary oder assoziatives Arry (PHP))

        // Key Values Paare
        HashMap<String, String > hauptsaedte = new HashMap<>();
        //put()
        hauptsaedte.put("Deutschnlan","Berlin");
        hauptsaedte.put("Italien","Rom");
        hauptsaedte.put("Frankreich","Paris");
        hauptsaedte.put("Spanien","Madrid");
        System.out.println(hauptsaedte);

        //get()
        System.out.println(hauptsaedte.get("Italien")); //Rom
        //remove()
        hauptsaedte.remove("Italien");
        System.out.println(hauptsaedte);


        /*HashMap<String, Integer > benutzer = new HashMap<>();
    benutzer.put("ali@gmail.com", 1234567);
    benutzer.put("alsjada@gmai.com", 131314);
        System.out.println(benutzer);*/

        //keySEt
        System.out.println(hauptsaedte.keySet()); //[Deutschland,Frankreich,Spanien]
        // for Schleife bei HashMaps
        for (String land: hauptsaedte.keySet()){
            //if (land.length() >7)
            System.out.println(land+ "->"+ hauptsaedte.get(land));
            System.out.println(land+ "->"+ hauptsaedte.get(land));
        }
        //Deutschland-> Berlin
        // Frankreich-> PAris
        // Spanien -> Madrid

        //values ohne eckige Klammer anzusehen ist es möglich it durhlaufen
        System.out.println(hauptsaedte.values());
        for (String stadt: hauptsaedte.values()){
            System.out.print(stadt+" ");
            System.out.println();
        }

        Collection staedliste= hauptsaedte.values(); // Der Collection Datentyp kommt später
        /*Berlin
        Paris
        Madrid
         */
        //size()
        System.out.println(hauptsaedte.size()); //3

        //clear()
        hauptsaedte.clear();
        System.out.println(hauptsaedte);//{}



    }
}
