package pdf;

import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
     /*   //Kullanicidan toplamak icin sayi isteyin ve toplam 500 e ulasincaya kadar istemeyi devam ettirin.
        //Toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.

        Scanner input = new Scanner(System.in);
        int toplamSayi = 0;
        int toplam = 0;

        do {
            System.out.println("Sayi giriniz: ");
            int sayi = input.nextInt();

            toplam += sayi;
            toplamSayi++;
        }

        while (toplam < 500);
        System.out.println("Toplam Sayi: " + toplamSayi);
        System.out.println("Toplam: " + toplam); */

        int arr[] = {12, 23, 12, 2, 3}; Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 5));



    }
}