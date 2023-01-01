package Uebungen;

public class erfasseneZeit {
    public static void main(String[] args) {

        Integer wochen=604800;
        Integer tag=86400;
        Integer stunde=3600;

        Integer minuten=60;
        Integer sekunde=60;

        Integer zeit=788645;

        Integer temp=zeit/wochen;
        Integer rest=zeit%wochen;
        Integer temp2=zeit/tag;
        Integer rest2=zeit%tag;
        Integer temp3=zeit/stunde;
        Integer rest3=zeit%stunde;


        Integer temp4=zeit/minuten;
        Integer rest4=zeit%minuten;
        Integer temp5=zeit/sekunde;
        Integer rest5=zeit%sekunde;

        System.out.println(temp+" "+ temp2+" "+temp3+" "+rest5);

    }
}
