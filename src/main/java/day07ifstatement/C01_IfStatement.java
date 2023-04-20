package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // If it rains , I will cancel the picnic

        //ex1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz.

        char ch = 'S';

        if (ch>='A' && ch<'Z'){

            System.out.println("Buyuk Harf");
        } // If body
        // ex2) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.

        byte n = -16;

        if (n %2==0 ){
            System.out.println("Cift Sayi");

        } // if body

        //ex3) verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz

        int s = 300;

        if (s<300 || s>1200){
            System.out.println("Harika Sayi");
        }

        // Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1.yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();
        //burada iki kontrol yapildi
        if(num%2 ==0){
            System.out.println("Cift Sayi");
        } // if body
        if(num%2!=0){
            System.out.println("Tek Sayi");
        }

        //2.yol

        if (num%2==0){
            System.out.println("Cift Sayi");

        }else{  //else diger tum ihtimaller
            //burada conditional yok tek kontrol var
            //bu sekilde javaya az is yaptirdik
            System.out.println("Tek sayi");
        }

        //sayinin negatif,pozitif.notr olmasini karsilastirin

        int numara=99;

        if(numara<0){
            System.out.println("Negatif Sayi");
        }else if(numara==0){
            System.out.println("Notr Sayi");
        }else {
            System.out.println("Pozitif Sayi");
        }








    } // main body
} // class body



