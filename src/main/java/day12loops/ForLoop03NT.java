package day12loops;

import java.util.Scanner;

public class ForLoop03NT {
    public static void main(String[] args) {

       /*
        ex1:Asagidaki sekli cizdiren kodu giriniz

            * * * *
            * * *
            * *
            *

        */

        Scanner input = new Scanner(System.in);

        System.out.println("Row sayisini giriniz");
        int row= input.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int j = row; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

























    }
}
