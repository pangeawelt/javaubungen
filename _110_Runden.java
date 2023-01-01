package Uebungen;
import static java.lang.Math.round;
import java.text.DecimalFormat;

public class _110_Runden {

    public static void main(String[] args) {

        // round()
        // Java rundet bei round() kaufmännisch
        System.out.println(round(4.49));  // 4
        System.out.println(round(4.5));   // 5

        // floor()
        // Abrunden
        // Zieht zu Minus-Unendlich
        System.out.println(Math.floor(4.9));   // 4.0
        System.out.println(Math.floor(-4.9));  // -5.0

        // ceil()
        // Aufrunden
        // Zieht zu Plus-Unendlich
        System.out.println(Math.ceil(4.1));   // 5.0
        System.out.println(Math.ceil(-4.1));  // -4.0

        // DecimalFormat
        // # steht für eine beliebige Anzahl von Stellen
        // 0 steht genau für eine Stelle
        DecimalFormat df1 = new DecimalFormat("#.0");
        System.out.println(df1.format(123.456));  // 123,5

        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println(df2.format(123.456));  // 123,46
        System.out.println(df2.format(123.4));    // 123,40

        DecimalFormat df3 = new DecimalFormat("#.##");
        System.out.println(df3.format(123.456));  // 123,46
        System.out.println(df3.format(123.4));  // 123,4

    }
}




