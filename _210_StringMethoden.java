package Uebungen;

import java.util.Locale;

public class _210_StringMethoden {
    public static void main(String[] args ){

        String text= "ASDAÖSFAFDSÖDODSNFDASNFKDSAÖJF";
      // length () Methode
        System.out.println(text.length()); //30
        //tolowerCase() - toUpperCase()
        String s= "HEllo World";
        System.out.println(s.toLowerCase()); // hello world
        System.out.println(s.toUpperCase()); //HELLO WORLD

        // concat()
        String vorname = "Pater";
        String nachname="Wellert";
        System.out.println(vorname.concat(nachname)); // PeterWellert
        System.out.println(vorname.concat(" ").concat(nachname)); // Peter Wellert
        System.out.println(vorname+ " "+ nachname); // Peter Wellert

        //index0f()
        System.out.println(vorname.indexOf("t")); // 2
        //subtring(index)
        System.out.println(vorname.substring(2)); //ter
        System.out.println(vorname.substring(1,1));

        System.out.println(text.indexOf("7")); //-1
        System.out.println(text.indexOf("SDA"));
        //charAt
        System.out.println(vorname.charAt(2)); // t
        //System.out.println(vorname.charAt(999)); // StringIndexOutOfBoundsException
        // Pater

        System.out.println(vorname.substring(4));// 6. indexten itibaren okumaya başlayalım...
        System.out.println(vorname.substring(1,1));
        System.out.println(vorname.substring(0,3));// 0ıncı karakterden itibaren 3 karakter al dedik
        System.out.println(vorname.substring(2,4));




    }
}
