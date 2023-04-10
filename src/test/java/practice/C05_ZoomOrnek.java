package day07ifstatement;

import java.util.Scanner;

public class C05_ZoomOrnek {
    public static void main(String[] args) {
        /*
        //exp: 85-100  girince 5 pekiyi
               65-84  girince 4
               45-64 girince 3
               25-44 girince 2
               0-25 girince 1
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        byte note = input.nextByte();
        if(note>=85 && note<=100){
            System.out.println("5");
        }else if(note<0){
            System.out.println("Gecerli not");
        } else if (note>=65 && note<=84) {
            System.out.println("4");
        } else if (note>=45 && note<=64) {
            System.out.println("3");
        } else if (note>=25 && note<=44) {
            System.out.println("2");
        }else if (note>=0 && note<=24){
            System.out.println("1");
        }

        /*
        exp:kullanicidan girilen 3 sayinin en buyugunu yazdir
         */

        Scanner input1 = new Scanner (System.in);

        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = input1.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = input1.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        int sayi3 = input1.nextInt();

        if(sayi1>=sayi2 && sayi1>=sayi3){
            System.out.println("Birinci sayi buyuk");
        } else if (sayi2>=sayi1 && sayi2>=sayi3 ){
            System.out.println("Ikinci sayi buyuk");

        } else if (sayi3>=sayi1 &&sayi3>=sayi2)
            System.out.println("Ucuncu sayi buyuk");






    }
}
