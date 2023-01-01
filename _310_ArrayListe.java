package Uebungen;

public class _310_ArrayListe {
    static Boolean pruefung(Integer[] x){
        for (int i = 0; i <x.length-1;i++){
            if (x[i] == x[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
int a,b;

        Integer list1[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        Integer list2[] = {1, 2, 3, 4, 5, 6, 8, 10, 10};
        System.out.println(pruefung(list1));
        System.out.println(pruefung(list2));








    }
}