package variablesdaytime01;

import java.util.Scanner;

public class C02_Variables {

    /*
TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
salona devam edeceği ay süresi
bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
 */

    public static void main(String[] args) {

        
        Scanner input= new Scanner(System.in);
        System.out.println("TechproEd Spor Salonuna hosgeldiniz");

        System.out.println("Adiniz=");
        String name= input.next();

        System.out.println("Soyadiniz=");
        String familyname= input.next();

        System.out.println("Yasiniz=");
        Integer age= input.nextInt();

        System.out.println("Kilonuz=");
        Float weigh= input.nextFloat();

        System.out.println("Boyunuz=");
        Integer height= input.nextInt();

        System.out.println("Kac ay devam edeceksiniz?");
        Integer month= input.nextInt();

        System.out.println("Adiniz=" +name);
        System.out.println("Soyadiniz="+familyname);
        System.out.println("Yasiniz="+age);
        System.out.println("Kilonuz="+weigh);
        System.out.println("Boyunuz="+height);
        System.out.println("Toplam ucretiniz="+month*20);


        //input.nextline();// tum cumleyi alir







    }





}
