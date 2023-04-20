package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {

    //Kullanicidan bir sayi alin ve mutlak degerini yazdirin


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi= input.nextInt();

        System.out.println(sayi<=0  ? sayi*-1: sayi);

        // : degilse
        // ? ise


        Scanner input1 = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi1 = input1.nextInt();

      String sonuc = sayi1>=0 ? "Pozitif"   :  "Negatif" ;
        System.out.println(sonuc);


        ////Kullanicidan bir sayi aliniz Pozitifse
        // Pozitif Negatifse sayinin karesini yazdirin(hm)




    }
}
