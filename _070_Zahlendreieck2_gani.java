package Uebungen;

import java.util.Random;
import java.util.Scanner;

public class _070_Zahlendreieck2_gani {
    public static void main(String[] args) {




        int counter=1;
        String dreieck="0";

        for (int i = 0; i < 10; i++) {
            dreieck=dreieck+counter+" ";
            System.out.print(i + " ");
        }

/*

        Scanner klavye=new Scanner( System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n=klavye.nextInt();



        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=(n-i);j++){

                System.out.print(" ");
            }

            for(int k=1;k<=(2*i+1);k++){
                System.out.print("0");
            }
            System.out.println(" ");
        }

*/
    }
}
