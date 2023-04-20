package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek. 1.kap: Patates 2.kap:domates==> 1.kap :domates 2.kap patates

    public static void main(String[] args) {

//interview sorusu

        int a = 12;
        int b =5; // Swap'den sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a:" +a);
        System.out.println("b:" +b);

        //1.yol
        //1.adim
        temp = a;
        //2.adim
        a= b;
        //3.adim
        b=temp;

        System.out.println("a:" +a);
        System.out.println("b" +b);

        //Interview sorusu cozumu genelde bu yol kullanilir
        //2.yol
        int x = 12;
        int y =5;

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x= " + x);
        System.out.println("y= " + y);








    }


}
