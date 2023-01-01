package Uebungen;

public class _260_Statiche_Methoden {
    //static- Methoden gehören der Klasse
    //Funktion außer OOP
    //Methoden über OOP
    // Integer ist Objekt.x
    // In Java ist man immer in OOP heisst es immer Methode

    static void gibAus(){
        System.out.println("Ich bin Methode gibAus!");
    }
static int addiere(int x, int y){
        return x+y;
}
    public static void main(String[] args){

        //
        gibAus();
        gibAus();

        //Parameter zur Übergabe von Werten
        int summe= addiere(45,7);
        System.out.println(addiere(4,17));
        addiere(3,7);
        //10; addiere (3.7) // Hier wäre es unnütz
        System.out.println(addiere(4,17)*5);


    }
}
