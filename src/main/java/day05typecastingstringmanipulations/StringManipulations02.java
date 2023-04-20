package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //ex1 : " s " String inin "money" ile bitip bitmedigini kontrol ediniz

        Boolean isEnd= s.endsWith("money");
        System.out.println(isEnd);

        //ex2:" s " String inin "money" kelimesini dolar kelimesine ceviriniz

        String rePlace=s.replace("money","dollar");
        System.out.println(rePlace);

        //ex3:earn change to win
        String rePlace2=s.replace("earn","win");
        System.out.println(rePlace2);//Lwin Java win money

        //ex a change to *
        //note : replace() methodunda coklu karakter kullanacaksaniz mecbur cift tirnak kullanacaksiniz
        //ama tek karakter ise cift ya da tek tirnak kullanabilirisniz
        //note:ama ya ikisi de cift tirnak olmali ya da ikisi de tek tirnak olmali

        String rePlace3=s.replace("a","*");
        System.out.println(rePlace3);//Le*rn J*v* e*rn money

// n change to XXX
        String rePlace4=s.replace("n","XXX");
        System.out.println(rePlace4);

        //ex6 : butun e sil
        //note: "Hicbir sey" char data type inda yojtur o yuzden replace()methodu kullanarak silme islemi yaparsaniz mutlaka "" cift tinak kullanilir


        String rePlace5=  s.replace("e","");

        System.out.println(rePlace5);


        String t= "Ali 13 yasindadir!...";

        //ex7:"t" Stringindeki tum rakamlari "*" a cevriirniz
        //note:bir grup data yi degistirmek icin rePlaceAll()kullanilir


        //note:Bir grup datayi ifade etmek icin "Regular Expressions" kullaniriz(regex)
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
            Meshur Regex ler
            1)Tum rakamlar ==>[0-9]
            2)Tum kucuk harfler ==>[a-z]
            3)Tum buyuk harfler ==>[A-Z]
            4)Tum kucuk harfler ve buyuk harfler ==>[a-zA-Z]
            5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
            6)Tum noktalama isaretleri ==>\\p{Punct}
            7)Tum sesli harfler ==>[aeiouAEIOU]
              x , q , w harfleri  ==>[xqw]

            8)Kucuk harflerden farkli tum character ler ==>[^a-z]
            9)Tum harflerden farkli tum character ler ==>[^a-zA-Z]
            10)Space disindaki tum caharacters ==> \\S





         */


        //ex8:Tum harfler ve rakamlarI ! CEVIRINIZ

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //ex9 butun sesli harfleri soru isaretine degistirn
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //ex10 :t stringteki kucuk harfle rdisindaki tum karakterleri <> ceviriniz

        String t4= t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>


        //EX10
        String t5= t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);//Ali++++yasindadir++++
        //EX11
        String t6= t.replaceAll("[^ ]","TL");
        System.out.println(t6);//TLTLTL TLTL TLTLTLTLTLTLTLTLTLTLTLTLTLTL


        //13
        String t7= t.replaceAll("[^aeiouAEIOU ]","&");
        System.out.println(t7);//A&i && &a&i&&a&i&&&&&


    }
}
