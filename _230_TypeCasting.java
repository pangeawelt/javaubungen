package Uebungen;

public class _230_TypeCasting {
    public static void main(String[] args){
        //Type Casting : Typen Umwandelung

        //Kleinerer Wert in größßeren Container ist erlaubt
        byte b1=100;
        int int1=b1;
        System.out.println(int1); //100

        int int2=42;
        byte b2;
        System.out.println(int2);

        int int3=42;
        byte b3=(byte) int3;
        System.out.println(b3);

        int3=100;
        b3=(byte) int3;
        System.out.println(b3); //100

        // double- integer
        int int4=78;
        double dub1 = int4;
        System.out.println(dub1); // 78.0

        // Hinter dem Punkt wird abgeschnitten
        double doub5= 123.7234;
        int int5 = (int) doub5;
        //int int5 = (int) round(doub5); 124
        System.out.println(int5); // 123


        double a=(int) 2424.93232;
       // int a1=(int) a;
        System.out.println(a); // 2424.0

        // int String
        // Per toString() Methode des Integer-objekts
        int int6= 12345;
        String str6;
        str6= Integer.toString(int6);
        System.out.println(str6); //12345
        System.out.println(str6.length()); //5 charkaterzahlen

        String str7= "789";
        int int7= Integer.parseInt(str7+10);//789
        System.out.println(str7+11); //78911
        System.out.println(int7);//789
        System.out.println(int7+11); //800
        int int8= Integer.parseInt(str7);//789

        String ax="5";
        int bx= Integer.valueOf(ax);
        int bxx= Integer.parseInt(ax);
        int bxy=456;
        String bh=Integer.toString(bxy);
        System.out.println(bh+5);
        System.out.println(2+bx);

        int ay = 5;
        double cx= (double) ay;
        System.out.println(cx);
        float m = 5.12f;
        int ma= (int) m;
        System.out.println(ma);







    }
}
