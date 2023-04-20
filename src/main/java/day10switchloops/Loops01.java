package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        Code Standarts
        i)Tekrar olmamali(no repetition)
        ii)Dynamic olmalidir
        iii)tamir (fix) ve update kolay yapilabilmelidir

         */


        //ex1:ekrana 5 kere "Hi" yazdiriniz

        //1.yol(tavsiye edilmez)
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        //ayni adimlar tekrar tekrar yapilmasi gerektiginde "loop"lar kullanilir.
        //Doret tane loop var ;
        //i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop


        //i)for-loop
        //baslangic degeri    Loop un calisma sarti   Increment/decrement
        for(int i =1        ; i<6                   ; i++  ){

            System.out.println("Hi!");
        }

        //ex2:11 den 44e kadar tum sayilari ekrana yazdiran kodu yazdiriniz

        for(int i=11 ; i<45 ; i++){
            System.out.println(i);
        }

        //ex3:40dan 23 e kadar tum cift tamsayilari yazdiran kodu

        for(int i=40 ; i>22 ; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

            //18den 56 ya kadar tum tek sayilari ekrana yaziran kodu yazdiriniz

        for(i = 18; i<57; i++){
            if(i%2!=0){
                System.out.print(i);
            }
        }



        }

    }
}
