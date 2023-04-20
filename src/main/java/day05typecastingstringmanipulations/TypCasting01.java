package day05typecastingstringmanipulations;

public class TypCasting01 {

    /*

    Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denir
    Numeric Data Type lar  byte-short- int-long-float-double

    Note1:Kucuk data type larini buyuk data typelarina cevirmeyi Java otomatik olarak yapar
          Bu islmee"Autowidening" denir.
    Note2:Buyuk data type larini kucuk data typelarina cevirmek riskli bir istir, Java bu riskli isi
    otomatik olarak yapmaz.Bu islemi kod yazanlar yapar.
          Bu isleme "ExplicitNarrowing" denir.

     */

    public static void main(String[] args) {

        //byte data type ini int data type ina ceviriniz

        byte age = 13;
        int ageint = age; //AutoWidening

        //long data typeini short data type ina cevirelim

        long weight = 234;
        short weightShort = (short) weight;

        //int data type ini float data type ina ceviriniz

        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //

        double value = 123.4;
        System.out.println(value);

        short valueShort=(short) value;
        System.out.println(valueShort);

        //Dikkat!
        //Donusum yaptiginiz sayi ,donuseceginiz data type inin sinirlari disinda ise Java kullandiginiz sayi ile "mod" islemi yapar
        //ve mod isleminin sonucu sizin yeni degeriniz olur

        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //ex2
        short n= 1023; //1023
        System.out.println(n);//1023
        byte nByte= (byte)n;
        System.out.println(nByte);//-1

        //





    }

}
