package Uebungen;


import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EinListeErzeugen{

    Vector<String> kopfSpalte = new Vector<>();
    Vector<Vector<String>> tabInhalt = new Vector<>();

    public EinListeErzeugen()
    {
        kopfSpalte.add("Name");
        kopfSpalte.add("vorname");
        kopfSpalte.add("Adresse");

        Vector<String> hilfsDings = new Vector<>();
        hilfsDings.add("Meier");
        hilfsDings.add("Peter");
        hilfsDings.add("Luisenstr 16");

        tabInhalt.add(hilfsDings);

        //------------------
        hilfsDings= new Vector();
        hilfsDings.add("Schmidt");
        hilfsDings.add("Hans");
        hilfsDings.add("Bismarkstr 16");

        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        tabInhalt.add(hilfsDings);
        JTable meineTabelle = new JTable(tabInhalt, kopfSpalte);

        JFrame meinFrame = new JFrame();
        meinFrame.getContentPane().add(new JScrollPane(meineTabelle), BorderLayout.CENTER);
        meinFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new EinListeErzeugen();
    }
}




















