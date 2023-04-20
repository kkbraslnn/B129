package practice;

import java.util.Scanner;

public class TeamWorkIQ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz. (1 ile 100 arasinda");

        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir,  ");

            } else if (i % 3 == 0) {
                System.out.print("Java, ");

            } else if (i % 5 == 0) {
                System.out.print("Guzeldir, ");


            } else {
                System.out.print(i+",");

            }

        }



    }
}
