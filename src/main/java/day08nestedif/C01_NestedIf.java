package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {
    /*
    Task:Kullanicidan 3 tane pozitif tamsayi aliniz.
         Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
         Eger ucgen ise "eskenar ucgen" olma durumunu kontrol ediniz

      Info: Ucgen olma sarti:Herhangi iki kenar toplami ucuncu kenardan
      buyuk olmali , herhangi iki kenar farki ucuncu kenardan kucuk olmali

         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
         a=b=c ise eskenar ucgen


         Java nested kodalri calistirirken cok zaman harciyor
         Buna "Tima Complexity" deniyor
         Bu yuzden mumkunse nested kod yazilmamali

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) { // ucgen olma durumu buyuk if

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else {
                System.out.println("Ucgen ama Eskenar ucgen degildir");
            }


        } else {//ucgen olmama durumu
            System.out.println("Ucgen degildir");


            //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
            //uc kenari birbirine esitse "Eskenar ucgen" yazdiriniz
            //Sadece iki kenar uzunlugu birbiri ne esitse "Ikizkenar ucgen"
            //Tum kenarlari birbirinden farkli ise "cesitkenar ecgen"yazdiriniz

            System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            if ((x + y > z && x - y < z && x + z > y && x - z < y && y + z > x && y - z < x)) {

            }
            if (x == y && y == z) {
                System.out.println("Eskenar Ucgen");
            } else if (x == y || y == z || x == z) {
                System.out.println("Ikizkenar Ucgen");
            } else if (x != y && y != z) {
                System.out.println("Cesitkenar Ucgen");
            }else{
                System.out.println("Ucgen Degildir");
            }


        }//main body

    }
}//class body

