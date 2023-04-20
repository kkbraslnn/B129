package variablesdaytime01;

import java.util.Scanner;

public class C02_Variables2 {

        /*
TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
salona devam edeceği ay süresi
bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("TechproEd Spor Salonuna hosgeldiniz");


        System.out.println("Lutfen isim soyisim giriniz ");
        String isim = input.nextLine();// tum cumleyi alir

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();//73.8

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();//1.70

        int aylik_ucret = 20;
        System.out.println("aylik_ucret = " + aylik_ucret);

        System.out.println("Kac ay geleceginizi giriniz");
        int ay = input.nextInt();


        int toplam_tutar = aylik_ucret * ay;
        System.out.println("toplam_tutar = " + toplam_tutar);
        System.out.println("\nIsminiz : " + isim + "\t" + "Yasiniz : " + yas +
                "\t"+" Kilo" + kilo + " Boyunuz : " + boy+ "Odemeniz gereken toplam tutar : " +
                toplam_tutar + "$");

        /*

        \n bosluk birakir
        \t bir tab bosluk birakir

         */




    }

}
