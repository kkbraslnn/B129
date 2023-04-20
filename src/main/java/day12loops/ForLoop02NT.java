package day12loops;

import java.util.Scanner;

public class ForLoop02NT {
    public static void main(String[] args) {
        /*

        ex1: Asagidaki sekli cizen kodu ciziniz
             1
             1 2
             1 2 3
             1 2 3 4
             1 2 3 4 5

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Row sayisini giriniz");
        int row= input.nextInt();

        for (int i = 1; i <=row ; i++) {


            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");

            }

            System.out.println();

        }













    }
}
