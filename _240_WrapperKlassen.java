package Uebungen;

import java.util.ArrayList;

public class _240_WrapperKlassen {
    public static void main(String[] args ){

        /*
        * Primitive Data Type	Wrapper Class
            byte	                Byte
              short	                Short
                int	                Integer
                   long	            Long
                    float	        Float
                    double          Double
                    boolean     	Boolean
                    char	       Character*/
        Integer int1=711;
        Double dou1 =123.456;
        Character char1='Z';
        System.out.println(char1);  //Z

        //ArrayList braucht die Wrapper Klassen
        ArrayList<Integer> nums = new ArrayList<>();


        // Bei Wrapper Klassen läuft die Typen Umwandelung anders
        // ...als bei den primitiven Datentypen

        System.out.println(dou1.intValue());// 123

        //System.out.println((int) dou1); // java: incompatible types : java.lang.Double cannot be converted to int
        System.out.println(dou1.toString());
        System.out.println(dou1.toString().length()); //7
        Double dou2= null;
        System.out.println(dou2); // null
        double duo3= 0.0 ;

        // double dou4 = null; // java: incompatible types: <nulltype> cannot be converted to double




    }
}
