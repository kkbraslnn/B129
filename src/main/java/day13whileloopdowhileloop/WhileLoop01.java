package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        /*
        ex1:Kullanicinin verdigi sayi icin carpim tablosunu olusturup
        console a yazdiran kodu yazdiriniz
        3==> 3x1=3 3x2=6 ....3x10=30
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        double num= input.nextDouble();

        int i = 1 ;

        while(i<11){

            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }


        //ex2:Verilen bir String de her harfin sonrasina "*" sembolu ekleyiniz.
        //    J*a*v*a*

        System.out.println("Bir kelime giriniz...");
        String word = input.next();
        String newWord = "" ;
        int k=0;
        while(k<word.length()){

            newWord = newWord + word.charAt(k) + "*" ;

            k++;
        }
        System.out.println(newWord);


        //ex3:Verilen bir tamsayinin rakamlari toplamini console a yazdiran kodu yazdiriniz
        //1.yol

        int num1 = -578;
        num = Math.abs(num);
        int sum = 0;
        while (num > 0) {
            sum = sum + num1 % 10;
            num1 /= 10;
        }
        System.out.println(sum);

        //2.yol for-loop
        int a = 684;

        int toplam = 0;

        for(int m = a; m > 0; m/=10){

            toplam = toplam+ m%10;
        }
        System.out.println(toplam);//19






    }
}
