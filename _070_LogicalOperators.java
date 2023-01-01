package Uebungen;

public class _070_LogicalOperators {

    public static void main(String[] args){


        //Logische Operatoren
        // Boolesche Operatoren

        // && , ||, !
        // && UND(sowohl als auch)
        System.out.println( 3 >=2 && 7 != 9); //7 true

        System.out.println(true && true); //True
        System.out.println(true&& false);// false
        System.out.println(false&& true);// false sowohl als auch
        System.out.println(false&&false);// false
        // || - ODER( und /oder) eich

        System.out.println(1== 1 || 1 > 3); // true

        // Nur false, wenn beide false sind
        System.out.println(true || true); //True
        System.out.println(true || false);// True
        System.out.println(false || true);// True
        System.out.println(false|| false);// False


        // ! NICHT (not)
        System.out.println(!(1==1)); //false
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(true|| true)); //

        //NOR
        System.out.println(!(true || true)); //


    }

    public static class _080_IfElse {

        public static void main(String[] args){

            // if else
            // Kontrolstruktur
             int x =7;
             if (x==7) {
                 System.out.println("In x ist die sieben!");


             }

             // if else
            x=11;
             if (x==11) {
                 System.out.println("In x ist die Sieben!");
             } else  if (x==11){
                 System.out.println("In x ist nicht die Sieben !");

             }
          /*   // if else if
            // in der Mitte kann es beliebig viele else if Zwige geben
            x=23;
            if (x==7) {
                System.out.println("In x ist die Sieben!"); // Wenn
            } else  if (x==11){
                System.out.println("In x ist  die elf !"); // Sonst wenn
                else{                                      // Sonst
                    System.out.println("In x ist weder sibene noch elf!");*/
                }


            }
}
