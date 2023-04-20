package practice;

import java.util.Scanner;

public class TeamWorkIQ_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ilk Sayiyi giriniz");

        int ilk = input.nextInt();

        System.out.println("son Sayiyi giriniz");

        int son = input.nextInt();

        if (ilk > son) {
            System.out.println("Ilk sayi kucuk olmali");

        } else {
            int sum = 0;

            for (int i = ilk; i <= son; i++) {

                sum = sum + i;

            }

            System.out.println(sum);


        }
    }
}
