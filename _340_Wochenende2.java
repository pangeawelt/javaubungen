package Uebungen;

public class _340_Wochenende2 {

    public static void main(String[] args) {

        String[] Werktag = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
        String[] Wochenende = {"Samstag", "Sonntag"};

        for (int i = 0; i < 8; i++) {
            if (i < 6) {
                System.out.println("Gute Woche" + Werktag);
            } else {
                System.out.println("Schönes Wochenende");
            }


        }
    }
}