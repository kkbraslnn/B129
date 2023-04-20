package practice.daytime;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a=12;
        int b=a++;
        System.out.println("b = "+b);// b=12
        System.out.println("a = "+a);// a=13

        int x = 15;
        int y = x--; // PostDecrement

        System.out.println("x = " + x);//14
        System.out.println("y = " + y);//15

        int m = 21;
        int n=++m;//pre inc
        System.out.println("m="+m);
        System.out.println("n="+n);

        int t =32;
        int u =--t;
        System.out.println("t="+t);
        System.out.println("u="+u);




    }
}
