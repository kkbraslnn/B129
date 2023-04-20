package practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*

        Kullanicidan bir gun alin eger gun cuma ise "Muslumanlar Icin
        Mubarek Gun" ; eger gun cumartesi ise "Yahudiler icin kutsal gun" ;
        eger gun pazar ise "Hristiyanlar icin kutsal gun"
        yazdiran kodu olusturunuz.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        String gun = input.next().toLowerCase(); // kucuk harfe cevirdik

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar Icin Mubarek Gun");

        }else if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else
            System.out.println("Kutsal gun degil");







    }

}
