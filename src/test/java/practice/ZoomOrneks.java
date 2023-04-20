package practice;

import javax.swing.*;
import java.util.Scanner;

public class ZoomOrneks {
    public static void main(String[] args) {


        int g = 2;
        int h = 4;
        String ik = "A";

        System.out.println((g*h) + (h-g) + (h/g) + ik );



        System.out.println();
        for(int i=1; i<=5; i++) {
            for (int j = (5 - i); j > 1; j--) {
                System.out.print(i + j);
            }
            System.out.println();
        }
        System.out.println();
        for ( char i = 'f';  i>'a';  i--){
            System.out.print(i + " " );
            i--;
        }
        System.out.println();
        for(int i=1; i<10; i=i+1) {
            if(i%3==0) {
                System.out.print(i + " ");
                System.out.println();
                int num = 9;
                while(num>1) {
                    System.out.print(num + " ");
                    num=num-3;
                }

            }
            }
        }
}
