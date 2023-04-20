package day12loops;

public class WhileLoop01NT {
    public static void main(String[] args) {
        //ex: 3 ten 10 a kadar tamsayilari console a yazdiriniz

        //1.yol
        for (int i = 3; i <11 ; i++) {
            System.out.println(i+ " ");

        }
        //2.yol while-loop
        int i =3;
        while(i<11){
            System.out.println(i+ " ");
            i++;
        }
        System.out.println();
//ex: 23 ten 12 a kadar tamsayilari console a yazdiriniz

        int k =23;
        while(k>11){
            if(k%2==0)
            System.out.println(k+ " ");
            k--;
        }
        System.out.println();

//interview sorusu
        //ex3: Verilen bir tamsayiyinin rakamlari toplamini console a yazdiriniz
        //sayi %10 her zaman sayinin son rakamini verir.


        int num = 578;

       num =  Math.abs(num);

        int sum = 0;

        while(num>0){

            sum=sum+num%10;

            num/=10;

        }

        System.out.println(sum);














    }
}
