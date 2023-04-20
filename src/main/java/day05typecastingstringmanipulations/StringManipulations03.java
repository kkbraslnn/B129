package day05typecastingstringmanipulations;
import java.util.Scanner;
public class StringManipulations03 {

    public static void main(String[] args) {

        /*

        ex1: Asagidaki kurallara gore kullanicinin girdigi passwordu girirniz
        i) en az 8 character olsun
        ii)space karakteri olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane sembol  olsun
        vi)En az bir tane rakam olsun


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        //i)en az 8 character olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii)space karakteri olmasin
        boolean second = !pwd.contains(" ");//! olumsuzluk eki
        System.out.println(second);

        //iii)En az bir tane buyuk harf olsun
        //Note:buyuk harf olmayanlari sil,
        // kalan character sayisina bak
        //Character sayisi sifir ise buyuk harf yok demektir
        //sifirdan buyuk ise buyuk harf var demektir
       boolean third = pwd.replaceAll("^A-Z" , "").length()>0;//methodlari ayni satirda kullanmaya "method chain " denir
        System.out.println(third);

        //iv)En az bir tane kucuk harf olsun
     boolean  fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        //v)En az bir tane sembol (harf ve rakam harici her sey) olsun

       boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //vi)En az bir tane rakam olsun
        boolean sixth =pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);


        System.out.println("Password gecerli mi ? " + (first && second && third && fourth && fifth && sixth));

















    }
}
