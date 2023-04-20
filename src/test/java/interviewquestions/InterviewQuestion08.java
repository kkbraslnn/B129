package interviewquestions;

public class InterviewQuestion08 {
    public static void main(String[] args) {
        //Interview question very common
        //ex4: Type code to find the sum of the digits of an integer
        //   584 ==>5+8+4=17

        //note:"number %10" gives you the last digit
        int num= -584;
        num = Math.abs(num);
        int sumOfDigits = 0;
        for(int i =num; i>0; i=i/10 ){

            sumOfDigits= sumOfDigits+i%10;
        }

        System.out.println(sumOfDigits);
    }
}
