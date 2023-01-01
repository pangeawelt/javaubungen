package Uebungen;

public class _130_BreakContinue {
    public static void main(String[] args ){

      //continue
        // Beendet den aktuellen Schleifeendurchlauf vorzeitig.
      for (int k=1; k<=10 ; k++){


          if (k==7){
              continue;// Mit if trotzdem geht weiter bis 10.Bis Schleife

          }
          System.out.print(k + "  "); //123456789

      }
        System.out.println();
      System.out.println("________________________________");

        for (int k=1; k<=10 ; k++){


            if (k==7){
                break; // Nach 6 beendet Schleife

            }
            System.out.print(k + "  "); //123456789

        }
        System.out.println();
        System.out.println("________________________________");

    }
}
