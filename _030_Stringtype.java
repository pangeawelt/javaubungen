package Uebungen;
public class _030_Stringtype {


    public static void main(String[] args ){

        // Datentyp String - Zeichenkette
        //Reference type
        //Dopplte Anführungszeichen

        String text = "Hello";
        System.out.println(text);

        // String Verkettung - Konkatenation-Verknüpfung
        // String concatenation
        // Pluszeichen als Operator

        String name = "Peter" ;
        System.out.println(text + name); // HelloPeter
        System.out.println(text + " "+  name); // HelloPeter
        // Nur ein Operand(islenen) muss String sein
        // Implizite Typenkonvertierung
        System.out.println(text + ' ' + 42 );
        System.out.println(42 + " "+ text);

    }


}
