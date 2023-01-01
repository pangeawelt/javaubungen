package Uebungen;

public class _220_PrimitiveDataType2 {
    public static void main(String[] args){
        //Primitive Datentypen
        //Kleinschreibeung
        //Zahlen
        // byte, short,Int, Long, (8,16,32,649)
        // Babzahlen


        byte b= 1 ;   // 8-Bit(-128<-> 127)
        System.out.println(-(Math.pow(2,8)/2)); //-128.0
        System.out.println(Math.pow(2,8) / 2 -1); //127.0


        //Short - 16 Bit;

        short sh = 423;
        System.out.println(-(Math.pow(2,16)/ 2 )); // -32768.0
        System.out.println(Math.pow(2,16)/ 2 ); // 32767.0

        // Integer -32 Bit
        int i=2_000_000;
        System.out.println(-(Math.pow(2,32)/ 2 )); // -2.147483648E9
        System.out.println(Math.pow(2,32)/ 2-1 ); // 2.147483647E9
        // Long - 64 Bit
        //Abschließendes L

        long lo = 5_000_000_000L;
        System.out.println(Math.pow(2,64) ); // 1.8446744073709552E19
        System.out.println(-(Math.pow(2,64)/ 2 )); // -9.223372036854776E18
        System.out.println(Math.pow(2,64)/ 2-1 ); // 9.223372036854776E18

        //
        //Fließkommazahlen
        //Float-32 Bit
        float f=1234.56F;
        System.out.println(f); //1234.567

        //Double - 64-Bit
        double d=1234567.1234567; // 1234567.1234567
        System.out.println();

        //Booelan
        boolean boo=true;
        System.out.println(boo);

        //char
        //Einfache Anführungsstriche dh ' '

        char c1= 'A';
        System.out.println(c1); //A

        //Char  als ASCII-Wert dezimal angeben:
        char c2= 65;
        System.out.println(c2);//A
        char c3=97;
        System.out.println(c3);//a
        char c4='\u0024';




    }
}
