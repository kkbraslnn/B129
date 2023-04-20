package interviewquestions;

public class InterviewQuestion13 {
    public static void main(String[] args) {
        //Very common interview question
        //ex3: Find the multiplication of the integers from 3 to 6

        int multiplication=1;
        for(int i=3; i<7; i++){

            multiplication = multiplication*i;

        }

        System.out.println(multiplication);
    }
}
