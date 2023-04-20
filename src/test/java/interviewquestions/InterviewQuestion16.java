package interviewquestions;

public class InterviewQuestion16 {
    public static void main(String[] args) {

        //Interview Sorusu
        //  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!  //
        //ex1:Size verilen bir String i tersten yazdirirniz
        //   "Germany" ==>ynamreG

        String s = "Germany";

        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            t = t + s.charAt(i);

        }

        System.out.println(t);
    }
}
