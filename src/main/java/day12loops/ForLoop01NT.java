package day12loops;

import java.util.Scanner;

public class ForLoop01NT {
    public static void main(String[] args) {
        /*
        Asagida gordugunuz sekli console a yazdiran kodu olusturunuz
               X X X X X
               X X X X X
               X X X X X
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisi giriniz");
        int row=input.nextInt();

        System.out.println("Sutun (column) sayisi giriniz");
        int column=input.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.print("X ");

            }
            System.out.println();

        }

        }

    }

