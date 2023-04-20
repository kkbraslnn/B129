package day03Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //ex: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz


        //input==>12345==> 1+2+4+5 = 12

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayiyi giriniz");

        int num = input.nextInt();//12345
        int ilkIkiRkm = num / 1000;
        System.out.println("ilkIkiRkm ==>" + ilkIkiRkm);//12

        int ilkIkiTop = (ilkIkiRkm % 10) + (ilkIkiRkm / 10);//3
        System.out.println("ilkIkiTop" + ilkIkiTop);

        int sonIkiRkm = num % 100;
        System.out.println("sonIkiRkm ==>" + sonIkiRkm);//45

        int sonIKiRkmTop = (sonIkiRkm % 10 + sonIkiRkm / 10);
        System.out.println("sonIkiTop" + sonIKiRkmTop);//9

        int toplam = ilkIkiTop + sonIKiRkmTop;
        System.out.println("Toplam" + toplam);//12


       /*
       son rakami al
       int lastDigit = number%10;
       number =number/10

       son ikinci rakami al
       int lastSecondDigit = number%10;
       number =number/10

       son ucuncu rakami al
       int lastThirdDigit = number%10;
       number =number/10

       son dorduncu rakami al
       int lastForthDigit = number%10;
       number =number/10

       son besinci rakami al
       int lastFifthDigit = number%10;
       number =number/10

      System.out.println(lastDigit +lastFirstDigit +LastSecondDigit + lastThirdDigit +LastForthDigit +lastFifthDigit);


        */








    }









}
