package Uebungen;

public class _250_ExponentialSchreibweise {
    public static void main(String[] args ) {


        //Exponentialschreibweise (E | e)
        // Wissenshaftliche Schreibweise (scientific notation)

        double dou1= 1.23233543E3;
        System.out.println(dou1);                       //12345.6
        System.out.println(1.23456 * Math.pow(10,4));   //12345.6
        System.out.println(1.23456 * 10_000);            //12345.6


        double dou2= 7.2342436457658768e13;
        System.out.println(dou2);

        //negativer Exponent
        double dou3 = 4.5678e-2;
        System.out.println(1.23456 * Math.pow(10,4));

        //Beispiel Rundunsfehler bei Floats
        System.out.println(3*0.1-0.3); //5.551115123125783E-17



    }
}
