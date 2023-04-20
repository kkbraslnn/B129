package interviewquestions;

public class InterviewQuestion18 {
    public static void main(String[] args) {
        //interview de sorulabilir
        //ex1:5 den 8e kadar kadar tamsayilarin toplamini veren kodu yaziniz
        //    5+6+7+8 ==>26

        int sum = 0;

        for (int i = 5; i <9 ; i++) {

            sum = sum+i;

        }

        System.out.println(sum);
    }
}
