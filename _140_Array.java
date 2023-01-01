package Uebungen;

public class _140_Array {

    public static void main(String[] args) {
        // Es darf nur einen Datenytp in einem Array geben
        // Die Länge von Arrays ist nicht veränderar
        // Arrays sind null-bassiert
        int[] values1;  // Deklaration als Array von Integern
        values1 = new int[3]; // Zuwesiung des ersten Wertes
        int[] values2 = new int[3]; // Initialisierung : Deklaration und gleich Zuweisung von ersten Wertes
        // Der Default-Wert von Datentyps wird automatisch eingeführt.
        System.out.println(values2[0]); // 0
        System.out.println(values2[1]); // 0
        System.out.println(values2[2]); // 0

        values2[0]= 23;
        System.out.println(values2[0]); //23

        // Die Eigenschaft length des Array_Objekts
        for (int i=0 ; i< values2.length; i++){
            System.out.print(values2[i]+ " "); // 23 0 0 [Ljava.lang.String;@3d075dc0
        }
        //Schreibweise wenn man die Start Werte schon weiss
        String[] namen= {"Peter", "Paul", "Mary"} ;
        System.out.print(namen);

        //foreach Variante von der for Schleife für Arrays
        for (String name: namen) {
            System.out.print(name + " "); // Peter Paul Mary
            System.out.println();
            System.out.print(namen[1]); //Paul
        }

    }
}
