package practice;

import java.util.Enumeration;
import java.util.Scanner;

public class TeamWorkDoWhile {
    public static void main(String[] args) {

    /*
    Kullanicidan toplamak uzere pozitif sayilar isteyin , islemi bitirmek icin 0 a basmasini soyleyin
    Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayin ve "Negatif sayi giremezsiniz"
    yazdirip basa donun.
    Kullanici 0 a bastiginda toplam kac pozitif sayi girdigini ve yanlislikla kac negatif sayi girdigini
    ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
     */

        Scanner input = new Scanner(System.in);

       /* int toplamPozitifSayilar = 0;
        int toplamNegatifSayilar = 0;
        int toplam = 0;

        while (true) {
            System.out.println("Pozitif sayi giriniz (bitirmek icin sifira basiniz): ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi > 0) {
                toplamPozitifSayilar++;
                toplam+= sayi;
            } else {
                System.out.println("Negatif sayi giremezsiniz.");
                toplamNegatifSayilar++;
            }
        }

        System.out.println("Toplam Pozitif Sayilar: " + toplamPozitifSayilar);
        System.out.println("Toplam Negatif Sayilar: " + toplamNegatifSayilar);
        System.out.println("Pozitif sayilarin toplami: " + toplam); */


        int toplamPozitifSayilar = 0;
        int toplamNegatifSayilar = 0;
        int toplam = 0;

        do {
            System.out.println("Pozitif sayi giriniz (bitirmek icin sifira basiniz): ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi > 0) {
                toplamPozitifSayilar++;
                toplam+= sayi;
            } else {
                System.out.println("Negatif sayi giremezsiniz.");
                toplamNegatifSayilar++;
            }
        }while(true);


        System.out.println("Toplam Pozitif Sayilar: " + toplamPozitifSayilar);
        System.out.println("Toplam Negatif Sayilar: " + toplamNegatifSayilar);
        System.out.println("Pozitif sayilarin toplami: " + toplam);







    }
}