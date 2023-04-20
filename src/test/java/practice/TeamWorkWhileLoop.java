package practice;

public class TeamWorkWhileLoop {
    public static void main(String[] args) {
        //ex1.Bir tamsayidaki rakamlarin toplamini bulmak icin kodu yaziniz.

        int num=578;// 5+7+8=20
        num=Math.abs(num);
        int sum=0;

        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }

        System.out.println(sum);

        System.out.println();

        //ex2:Bir String de benzersiz(tekrarsiz)karakterler yazdirmak icin kod yaziniz.
        //orn: Hello ==>Heo

        String s= "Hello";
        int i=0;

        while(i<s.length()){
            String c= s.substring(i,i+1);
            if(s.indexOf( c)==s.lastIndexOf(c)){
                System.out.println(c);
            }
            i++;
        }






    }
}
