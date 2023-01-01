package Uebungen;

public class Fitness {


// Geschlecht---Ja Nein
    //Trainingsziel Fitness oder Muskelaufbau
    //wenn ja->


    String trainingziel;
    int alter;
    char geschlecht;
    int aktuelleHerzfrequenz;

    public String ermittleBereich(String trainingsziel,int alter,char  geschlecht, int aktuelleHerzfrequenz){
        int maxfrequenz;
        if(geschlecht=='f') {
            maxfrequenz = 226 - alter;
            double prozent= Math.round(100.*aktuelleHerzfrequenz/maxfrequenz);
            System.out.println(prozent+" %");
            System.out.println("Du bist eine Frau;");
        }
        else{
            maxfrequenz=220-alter;
            double prozent= Math.round(100.*aktuelleHerzfrequenz/maxfrequenz);
            System.out.println(prozent+" %");
            System.out.println("Du bist  ein Man;");}

        if (trainingsziel=="Fitness"){
            System.out.println("Es ist ein Fitness Tranings;");
            if (aktuelleHerzfrequenz<0.5*maxfrequenz)
                System.out.println("zu niedrig");
            else if (aktuelleHerzfrequenz<0.8*maxfrequenz)
                System.out.println("optimal");
            else if (aktuelleHerzfrequenz<0.9*maxfrequenz)
                System.out.println("zu hoch");
            else
                System.out.println("Warn !"); }
        else{
            System.out.println("Es ist ein Muskelaufbau Tranings");
            if (aktuelleHerzfrequenz<0.8*maxfrequenz)
                System.out.println("zu niedrig");
            else if (aktuelleHerzfrequenz<0.9*maxfrequenz)
                System.out.println("optimal");
            else
                System.out.println("Warn !");
        }
        return trainingsziel;
    }


    public static void main(String[] args) {
    Fitness gani= new Fitness();
    gani.ermittleBereich("Fitness",30,'m',160);
        System.out.println("--------------------");
        Fitness Kessy= new Fitness();
        gani.ermittleBereich("Muskelaufbau",45,'f',170);
        Fitness Alexander= new Fitness();
        gani.ermittleBereich("Fitness",25,'m',180);

    }
}
