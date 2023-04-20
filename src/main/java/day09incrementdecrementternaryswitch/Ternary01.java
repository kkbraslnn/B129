package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int r1  = a<7 ? a++ : b++;

        System.out.println(r1);

        System.out.println(a);

        System.out.println(b);

        //ex1:
       /*
        int a = 10;
        int b = 20;

        int r1  = a<b ? a++ : ++b;

        System.out.println(r1);//10

        System.out.println(a); //11

        System.out.println(b);//20

        */

        //ex2 :
         //verilen bir sayini  mutlak degerini hesaplayan kodu yaziniz
        //      -4 ==> -1*-4     4 ==> 4     0==>0

        int c = -4;
        int r2 = c<0 ? -1*c : c;

        System.out.println(r2);//4

        //ex3: iki sayinin isareti ayni ise bu sayilari carpan , isaretleri farkli ise
        //"Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;

        //"Object." Java da butun "Non-Primitive Data Type " (Class)larinin ortak "Parent"dir
        //"Object"in "Parent" i yoktur.
        //Farkli data typelari icin ortak bir variable olusturmak istediginde,data type olarak object kullanilabilir
        //Java da Object , insanlik aleminde Hz.Adem e benzer
        Object r3=(m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        System.out.println(r3);

        //ex4 :     Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz



        int p=436;

        int r =Math.abs(p);


       String r4= r>99 && r<1000 ? "uc basamaklidir" : "uc basamakli degildir";

        System.out.println(r4);













    }
}
