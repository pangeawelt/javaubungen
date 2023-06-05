package Uebungen;

public class _170_KleinesEinmaleins_Gani {

    public static void main(String[] args) {
        /*
001 002 003 004 005 006 007 008 009 010 
002 004 006 008 010 012 014 016 018 020 
003 006 009 012 015 018 021 024 027 030 
004 008 012 016 020 024 028 032 036 040 
005 010 015 020 025 030 035 040 045 050 
006 012 018 024 030 036 042 048 054 060 
007 014 021 028 035 042 049 056 063 070 
008 016 024 032 040 048 056 064 072 080 
009 018 027 036 045 054 063 072 081 090 
010 020 030 040 050 060 070 080 090 100 */
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






