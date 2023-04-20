package practice.daytime;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
         /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);

        System.out.println("*******************TERNARY**************");

        boolean harfMi=(ch<='z' && ch>='a') || (ch<='Z'&& ch>='A');
        boolean kucukHarfMi=(ch<='z' && ch>='a');

        String result=(harfMi)    ? kucukHarfMi?"Kucuk Harf"    : "Buyuk Harf" :"Harf Degil";
        System.out.println("result ="+ result);

    }
}
