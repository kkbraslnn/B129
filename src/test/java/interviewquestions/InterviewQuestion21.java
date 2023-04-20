package interviewquestions;

public class InterviewQuestion21 {
    public static void main(String[] args) {
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
