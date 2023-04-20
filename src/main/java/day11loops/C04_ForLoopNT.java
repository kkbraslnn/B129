package day11loops;

public class C04_ForLoopNT {
    public static void main(String[] args) {
        //interview de sorulabilir
        //ex1:5 den 8e kadar kadar tamsayilarin toplamini veren kodu yaziniz
        //    5+6+7+8 ==>26

        int sum = 0;

        for (int i = 5; i <9 ; i++) {

            sum = sum+i;

        }

        System.out.println(sum);

        //Ex2 : 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz

        int multiply= 1 ;

        for (int i = 7; i <10 ; i++) {

          multiply = multiply*i;

        }

        System.out.println(multiply);






    }
}
