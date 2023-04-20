package passbyvalueoverloading;

import java.util.Scanner;

public class C01passByValue {
    public static void main(String[] args) {
        /*
        Kullanicidan bir int deger alalim ve bu degeri
        3 katina cikaran bir method olusturalim
        olusturdugumuz degeri method icinde yazdiralim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        katlama(sayi);
        System.out.println(sayi);

    }public static int katlama(int sayi){
        sayi= sayi*3;
        System.out.println(sayi);
        return sayi;
    }
}
