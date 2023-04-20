package practice.daytime;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //kullanicidan String bir ifade aliniz , girilen String ifadenin harflerini altalta gelecek sekilde " " veya 'a' harfi geldiginde yazdirmayan diger karakterleri yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz");

        String str = input.nextLine();

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)==' '){

                continue;

            }
            System.out.println(str.charAt(i));
        }









    }
}
