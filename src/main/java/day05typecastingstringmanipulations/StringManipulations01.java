package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type dir ve ayni zamanda bir Classtir


    public static void main(String[] args) {

        String s ="Java is easy";

        //Ex 1: "s" String indeki tum charaacter leri buyuk harf ve kucuk harf yapiniz

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //ex2: "s" String indeki ilk charaacteri aliniz.

        char firstChar = s.charAt(0);
        System.out.println(firstChar);//j

        //ex3: "s" String indeki ikinci ve sondan ikinci charaacteri aliniz.
        //ekrana yanyana yazdiriniz.

        //1.yol==ayni satirda yazdirmak icin
        char secondChar = s.charAt(1);
        System.out.print(secondChar);

        char secondLastChar= s.charAt(10);
        System.out.println(secondLastChar);

        //2.yol==ayni satirda yazdirmak icin
        System.out.println(" "+secondChar + secondLastChar);

        //ex4: "s" string de karakter sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //ex5:"s" string deki ilk 4 karakteri aliniz

        //substring(0,4) ==>"0" yani ilk index dahil,"4" yani ikinci index harictir.
        String sub1 =s.substring(0,4);
        System.out.println(sub1);

        //6."s" string deki 'is' karakteri aliniz

        String sub2 =s.substring(5,7);
        System.out.println(sub2);

//
        String sub3 =s.substring(8,12);
        System.out.println(sub3);

        // bir karakterden baslayip String in sonuna kadar almak istersek ikinci indexi yazmayiniz

//
        String sub4 =s.substring(8);
        System.out.println(sub4);

        //ex "s" string de money kelimesi olup olmadigini yaziniz

       boolean isExit= s.contains("money");
        System.out.println(isExit);

        /*

        Bir methodu ogrenirken 3 seyi mutlaka ogrenin;

        i)Bu method ne is yapar?
        ii)Bu method un farkli kullanimlari nasildir?
        iii)Bu method size ne return eder?

         */

        //ex : "s" stringinin belli bir harfle baslayip baslamadigini kontrol ediniz

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //ex: "s" stringinin 6.karakterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz

      boolean isBegin =s.startsWith("i",5);
        System.out.println(isBegin);

        //









    }

}
