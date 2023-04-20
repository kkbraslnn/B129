package day07ifstatement;
import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        /*
        Iki tane String datanin birbirine esit olup olmadigini anlamak icin
        "==" degil ; equals kullanilir.
        i)equals() == > Buyuk kucuk harf onemser.
        ii)equalsIgnaoreCase() == > Buyuk kucuk harf onemsemez.
         */

        //Kullanicidan gun isimlerini aliniz , hafta ici mi hafta sonu mu oldugunu yazdiran kodu olustuurnuz

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") ||gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazar") ||gunIsmi.equalsIgnoreCase("Sali")
                ||gunIsmi.equalsIgnoreCase("Carsamba") || gunIsmi.equalsIgnoreCase("Persembe")
                ||gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        }else {
            System.out.println("Gecerli bir gun ismi giriniz");
        } //else body
          //2.yol

            boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi")
                    || gunIsmi.equalsIgnoreCase("Sali") || gunIsmi.equalsIgnoreCase
                    ("Carsamba") || gunIsmi.equalsIgnoreCase("Persembe") ||
                    gunIsmi.equalsIgnoreCase("Cuma");

            boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                    gunIsmi.equalsIgnoreCase("Pazar");
            if (haftaici){
                System.out.println("Hafta Ici");
            } else if (haftasonu);{


        }



















    }


}
