package day03Scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Ex1)Kullanicidan sayilari alarak tolama islemi yaptiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

        double sayi1 = input.nextDouble();

        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

        double sayi2 = input.nextDouble();

        System.out.println("Toplam"+(sayi1+sayi2));







    }





}
