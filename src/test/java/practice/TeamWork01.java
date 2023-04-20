package practice;

public class TeamWork01 {
    public static void main(String[] args) {
        // If else de kontrolu gereken sart cok ise kullanılır.
//long, double, float, boolean kullanilamaz

/* Soru: Kullanicidan bir sayi girmasini isteyin.
         10 ise "iki basamakli en kucuk sayi"
         100 ise "uc basamakli en kucuk sayi"
         1000 ise "dort basamakli en kucuk sayi"
         diger durumlarda "girdigin sayiyi degistir" yazdirin. */

        int a =101;

        switch (a){

            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
               break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;

            default:
                System.out.println("girdigin sayiyi degistir");

        }





    }
}
