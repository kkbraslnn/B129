package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

   //note 1:sort() metodu sayisal data type larini kucukten buyuge siralar.(ascending order)
   //note 2:sort() metodu String data type larini alfabetik olarak siralar.(alphabetical order)
   //note 3:ascending order + alphabetical order ==> Natural Order
   //note 4:sort() methodu array elemanlarini "Natural Order " a gore siralar

   //note 5:binarySearch() method u bir elemanin bir array de olup olmadigini kontrol etmek icin kullanilir
   //       binarySearch() methodunu kullanmadan once "sort()" methodunu kullanmak zorundayiz
   //       sort() methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz.
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));

        int num= Arrays.binarySearch(colors,"Blue");
        System.out.println(num);//0 ==> var hem de indexi sifir

        int num1= Arrays.binarySearch(colors,"Orange");
        System.out.println(num1);//3  ==> var hem de indexi 3

        int num2= Arrays.binarySearch(colors,"Tarik");
        System.out.println(num2);//-6 ==> "-" bu eleman yok dmeek
                                 //       "6" ise olsaydi 6. eleman olurdu demek
        


















    }
}
