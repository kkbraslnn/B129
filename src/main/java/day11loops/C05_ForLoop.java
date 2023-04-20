package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //5 den sonra 10 a kadar tamsayilarin toplamini bulan kodu yazini

        /*
        5 6 7 8 9 10= 45
         */
        int sum =0;

        for (int i = 5; i <11 ; i++) {
            sum=sum+i;
            //System.out.println(sum);//buraya da yazabiliriz

        }
        System.out.println("5ten ona kadar sum:"+sum);

        //6 dan 3 e kadar olan tamsayilarin carpimini bulan kodu yaziniz
//interview sorusu olabilir
        int multiply=1;
        for (int i = 6; i >2 ; i--) {
           multiply*=i;

        } //for
        System.out.println(multiply);

        //Bir tam sayinin rakamlarinin toplaminiyazan kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = input.nextInt();
        num=Math.abs(num);

        int sonuc = 0;
        for (int i = num; i>0 ; i=i/10) {
            sonuc=sonuc+i%10;

        }//for
        System.out.println(sonuc);





    }//main
}//class
