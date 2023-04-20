package day04asciiwrapperclassoperatorsmemoryusageNt;

public class WrapperClass {

    public static void main(String[] args) {

        int n = 12; // "n" yazip "nokta" koyarsaniz hic method goremezsiniz
                    // cunku primitive ler method icermez.
                    // Wrapper class lar non-primitivedir o yuzden cok yer kaplarlar o yuzden sart degilse kullanmayi tercih etmeyiz

        Integer m =12; // "m" yazip "nokta" koyarsaniz bircok method gorursunuz
                        //cunku "wrapper classlar " method icerir



        byte p = 23;
        Byte r = 43;


        //ex1: short data type nin min ve max degerlerini kod yazarak bulunuz

        Short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);


        //ex2: int data type nin min ile byte max degerlerinin toplamini kod yazarak bulunuz

        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);

        System.out.println("Toplam" + (minInt + maxByte));

        //ex3 : i) Primitive int i Wrapper Integer a ceviriniz(Autoboxing)

        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum); //22

        //ii)Wrapper byte i impirimitive byte a cevirirn(Unboxing)

        Byte k = 43;

        byte primitiveK = k;

        System.out.println(primitiveK);

        //ex4: primitive char i wrapper charactere cevirinix
        //wrapper boolean i primitive booleana ceviriniz

        char a = '5';
        Character wrapperChar = a;
        System.out.println(wrapperChar);

        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        






    }
}
