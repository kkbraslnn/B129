package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //3ten 10 kadar tamsayilari ayni satira yazdiran kodu yazdirnix

        //1.yol
        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");//3 4 5 6 7 8 9 10
        }

        System.out.println();

        //2.yol
        int i = 3;//baslangic degeri
        while (i <11) { //bitis degeri
            System.out.print(i+" ");//3 4 5 6 7 8 9 10
            i++;
        }

        //ex:17den 4 e kadar olan tum cift tamsayilari yanyana yazdiriniz

        int x = 17;

        while(x>3) {//bitis degeri
            if (x % 2 == 0) {//ciftse
                System.out.println(x + " ");
            }//if

            x--;

        }//while

    }//main
}//class
