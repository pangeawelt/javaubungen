package Uebungen;

import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class _210_Stringstest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "CP850"));

            String vorname = JOptionPane.showInputDialog("V‰ﬂorname ");
            String nachname = JOptionPane.showInputDialog("Nachname ");
            String altersangabe = JOptionPane.showInputDialog("Alter ");
            double alter = Double.parseDouble(altersangabe);


            String name = vorname + " " + nachname;
            String trimmed = name.trim();
            System.out.println("Sie heissen " + trimmed);
            System.out.println("Vorname besteht aus " + vorname.length() + " ﬂ‰Zeichen ");
            System.out.println("Der Nachname beginnt mit " + nachname.charAt(0));
        System.out.println("------------");
            System.out.println("Ihre Vorname beginnt "+ vorname.endsWith(vorname)+ " "+ vorname.startsWith(vorname));

            if ((alter - 18) >= 0) {
                System.out.println("Sie sind seit " + String.valueOf(alter - 18) + " Jahre volljaehrig ");

            } else {
                System.out.println("Sie werden in " + String.valueOf(18 - alter) + " Jahren ");
            }

            //Vergleich mit compareTo()
            if (vorname.compareTo(nachname) < 0) {
                System.out.println("Vorname ist lexikalisch(sˆzl¸ksel) vor " + " dem Nachname einzusortieren ");
            } else if (vorname.compareTo(nachname) > 0) {
                System.out.println("Nachname ist lexikalisch vor " + " dem Vornamen einzusortieren ");
            } else if (vorname.compareTo(nachname) == 0) {
                System.out.println("Ihr Vorname ist identisch mt dem Nachnamen");

            }

            //Umwandeln in groﬂe Schriftzeichen
            System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());


        }
        catch (Exception e ){
            System.out.println("Geben Sie bitte richtige Info ");
        }


    }
}
