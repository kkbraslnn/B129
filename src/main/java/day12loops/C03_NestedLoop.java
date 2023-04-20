package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {
    public static void main(String[] args) {
          /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/
        for (int i = 1; i <6 ; i++) {  //satir kontrolu
            for (int j = 1; j <=i ; j++) { //rakam kontrolu
                System.out.print(j+"*");

            }

            System.out.println();//alt satira atti
        }


        for (int i = -3; i < 3; i++) {
            for (int j = -3; j <=i ; j++) {
                System.out.print("£");
            }
            System.out.println();
        }
        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.
            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }

        System.out.println("ex =");

        //    Example 2: Asagidaki sekil cizen kodu yaziniz
        //                * * * *
        //                * * *
        //                * *
        //                *

        int satir=10;
        for (i = 1; i <=satir ; i++) { // satir kontrol
            for (int l = satir; l >=i ; l--) { // yildiz kontrol
                System.out.print("* ");


            }
            System.out.println();
        }

       /*

         *
        * *
       *   *
      *     *
     * * * * *

        */

        //Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();


        for (i = 1; i <=row ; i++) {
            for (int bosluk = row; bosluk >=i ; bosluk--) {//bosluk kontrol
                System.out.print(" ");

            }

            for (int yildiz = 1 ; yildiz <=i ; yildiz++) {//yildiz kontrol

                if(yildiz==1 || yildiz==i){
                    System.out.print("* ");//en distaki yildizlar
                } else if ( i==row){
                    System.out.print("* ");// en alt *
                }else
                    System.out.print("  ");//3 ve 4.satir
            }
            System.out.println();
        }















    }
}
