package day11loops;

public class C05_ForLoopNT {
    public static void main(String[] args) {

       /*
        //ex1 :Asagidaki ciktiyi verecek kodu yaziniz
           Week:1
              Day:1
              Day:2
              Day:3
           .........
            Week:2
              Day:1
              Day:2
              Day:3
           ..........
            Week:3
              Day:1
              Day:2
              Day:3
            ..........
        */

        for (int i = 1; i <5 ; i++) {

            System.out.println("Week:" +i);
            for (int j = 1; j <8 ; j++) {
                System.out.println("Day:"+ j);

            }
            System.out.println();

        }















    }
}
