package Uebungen;

public class _180_TernaererOperator {
    public static void main (String[] args) {

        // Ternärer Operator
        // Kurzform von if else
        // Drei Teile : bedingung ? true Fall : false Fall(B ? : ;)
        //Ternär wei es drei Operanden
        // Binären O

        int stunde =20; // Stunde kommt von OS
        String begruessung;
        if (stunde>18){
            begruessung="Guten Abend";

        } else {
            begruessung="Guten Tag";
        }
        System.out.println(begruessung);

        // per ternären Operator
        begruessung= stunde > 12 ? "Guten Abend " : "Gute Nacht";
        System.out.println(begruessung);



    }
}
