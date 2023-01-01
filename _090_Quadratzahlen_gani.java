
public class _090_Quadratzahlen_gani {

    public static void main(String[] args) {

        /*
         * Quadratzahlen
         *
         * Schreibe ein Programm, das alle Quadratzahlen von natürlichen
         * Zahlen (1, 2, 3, ...) ausgibt, die kleiner als 100 sind.
         * (Die Quadratzahlen sollen kleiner 100 sein!)
         *
         *  Zusatz: Gib auch die Anzahl der gefunden Quadratzahlen aus
         */


        for(int zahl=1; zahl<100; zahl++){
            int ergibt =zahl*zahl;
            if(ergibt>=100){
                break;
            }
            System.out.println("Quadrat von "+ " "+ zahl+ " ^ "+"=" + " "+ergibt);


        }

        }

}
