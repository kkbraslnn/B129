package interviewquestions;

public class InterviewQuestion05 {
    public static void main(String[] args) {
        ///////////very common interview question///////////
        //ex1:Type code to reverse a String
        //    For example: Tom ==> moT

        String name = "Mark";
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--){
            char ch = name.charAt(i);
            reversedName = reversedName + ch;
        }
        System.out.println(reversedName);//kraM
    }
}
