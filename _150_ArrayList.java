package Uebungen;

import java.net.Socket;
import java.util.ArrayList;

public class _150_ArrayList {
    public static void main(String[] args) {


        //ArrayList ( BEFEHLE : remove, clear, add,get,size)
        // Die Grösse ist veraenderbar


        ArrayList<Integer> nums = new ArrayList<>();
        // add()
        nums.add(2);
        nums.add(7);
        nums.add(9);
        nums.add(11);

        System.out.println(nums); // [2,7,9,11]

        for (int num : nums) {
            System.out.print(num + " "); // 2 7 9 11

        }
        //remove(index)
        // Das Array wird nee indiziert
        //remove() gibt den entfernten Wert zurück

        // get index
        System.out.println(nums.get(3));
        nums.remove(0);

        System.out.println(nums);
        System.out.println(nums.get(0));



        // set(index, wert)
        nums.set(0,23);
        System.out.println(nums); // [23, 9 , 11 ]

        // Size()
        System.out.println(nums.size()); //3

        //index - Ermittelt den Index eines Wertes
        System.out.println(nums.indexOf(11)); //2 sira da anlaminda
        System.out.println(nums.indexOf(17)); //-1
        //Rückgabewert, wenn esden Wert nicht gibt = -1
        System.out.println(nums.indexOf(999)); //-1
        // clear() - Leert die ArrayList
        nums.clear();
        System.out.println(nums);// []
    }
}