package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //INterview sorusu olabilir.
        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, karakter sayisi 5'den cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

//  Logic: Yeni bir Array olusturup,character sayisi 5 ve 5 den kucuk  elemanlari yeni array e transfer edecegiz.
        // boylelikle yeni array de character sayisi 5 den buyuk olan hicbir eleman olmayacak.

        //soru:Array olusturmak icin iki sey belirlenmelidir.
        //    1)elemanlarin data type i
        //    2)yeni array de kac tane eleman olacak

        // verilen array de eleman sayisi 5 ve 5 den kucuk olan kac eleman var bulmaliyiz

        int counter= 0;

        for (String w : colors){
            if (w.length()<=5){
                counter++;
            }
        }

        System.out.println(counter);

        String newColors[] = new String[counter];

        int idx= 0;

        for(String w : colors){

            if(w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(newColors));


















    }
}
