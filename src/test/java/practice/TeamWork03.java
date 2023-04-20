package practice;

import java.util.Scanner;

public class TeamWork03 {
    public static void main(String[] args) {
        //Kullanicidan gun ismi alip haftaici veya haftasonu yazdiralim

        Scanner input = new Scanner(System.in);

        System.out.println("Gun ismi giriniz");

        String gunIsmi=input.next().toLowerCase();

        switch (gunIsmi){
            case"pazartesi":
                System.out.println("Hafta ici");
               break;
            case"sali":
                System.out.println("Hafta ici");
                break;
            case"carsamba":
                System.out.println("Hafta ici");
                break;
            case"persembe":
                System.out.println("Hafta ici");
                break;
            case"cuma":
                System.out.println("Hafta ici");
                break;
            case"cumartesi":
                System.out.println("Hafta sonu");
                break;
            case"pazar":
                System.out.println("Hafta sonu");
                break;
        }

















    }
}
