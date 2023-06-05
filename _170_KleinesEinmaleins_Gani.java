package Uebungen;

public class _170_KleinesEinmaleins_Gani {

    public static void main(String[] args) {
     // Schleife für die Zeilen
        for (int i = 1; i <= 10; i++) {
            // Schleife für die Spalten
            for (int j = 1; j <= 10; j++) {
                // Berechnung des Produkts
                int produkt = i * j;
                
                // Ausgabe mit führenden Nullen
                System.out.printf("%03d ", produkt);
            }
            
            // Zeilenumbruch am Ende jeder Zeile
            System.out.println();
        }
    }
}






