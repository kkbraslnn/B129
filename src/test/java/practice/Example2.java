package practice;

import java.util.Scanner;

public class Example2 {

    //Kullanicidan toplamak icin sayi isteyin ve toplam 500 e ulasincaya kadar istemeyi devam ettirin.
    //Toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int toplamSayi = 0;
        int toplam= 0;

        do{
            System.out.println("Sayi giriniz:");
            int sayi = input.nextInt();

            toplam+=sayi;
            toplamSayi++;
        }
        while(toplam<500);
        System.out.println("Toplam sayi: "+ toplamSayi);
        System.out.println("Toplam : "+ toplam);



















    }
}
