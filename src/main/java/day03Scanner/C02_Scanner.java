package day03Scanner;

import java.util.Scanner;

public class C02_Scanner {

    //Scanner classi kullanici ile etkilesim kurmamizi saglar
    //Scanner bir Classtir. Java util kutuphanesinden getirildi icin import ister


    public static void main(String[] args) {


        //Kullanicidan Data Almak icin
        //1.Adim Scanner Classindan Object olusturun

        Scanner input = new Scanner(System.in);

        //Scanner scan = new Scanner(System.in);

        //2.Adim Kullaniciya ne yapacagini soyle

        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim Kullanicidan aldiginiz datayi variables icine koyun

        byte age = input.nextByte();


        //Kullaniciya ad,memleket,yas,boy,
        //yasadigi yeri sevip sevmedigini soran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ismini girin");
        String isim= scan.nextLine();//kullanicidan string bir deger istedik tum satiri almak icin nextline sectik
        System.out.println("Lutfen memleketinizi giriniz..");
        String memleket = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz...");
        short boy = scan.nextShort();
        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("******************");
        System.out.println("isim = "+ isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);











    }




}
