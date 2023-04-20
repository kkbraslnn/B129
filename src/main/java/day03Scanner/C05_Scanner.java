package day03Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //bir dikdortgenin en ve boyunu alan ve hesaplayan kodu yaziniz

        // dikdortgenin alani =en*boy

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Lutfen Bir Dikdortgenin kisa kenarini giriniz");

        int en= input.nextInt();

        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");

        int boy = input.nextInt();

        System.out.println("Alan" +(en * boy));
        System.out.println("Cevre ==> " + 2*(en+boy));



















    }






}
