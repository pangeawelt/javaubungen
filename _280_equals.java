package Uebungen;

public class _280_equals {
    public static void main(String [] args){

        //equal zum vegleichen von STRINGS
        String s1= "Hello";
        String s2="Hello";
        System.out.println(s1==s2); //true
        String s3= "hello";
        System.out.println(s1==s3); // false
        String s4="Hello";
        String s5="World";
        String s6= s4+s5;
        String s7="HelloWorld";
        System.out.println(s6==s7); //false !!!

        //eqauals
        System.out.println(s6.equals(s7)); //true

        // 42 == "42" //true
        // 42 === "42" //false



    }
}
