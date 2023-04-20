package interviewquestions;

public class InterviewQuestion04 {
    public static void main(String[] args) {
        //interview sorusu ==>Leap Year
        /*

        ex1: verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz
        1)Yil 100 e bolunurse 400 e de bolunmelidir . 1600 ==>Leap   1800==>Leap degil
        2)yil 100 e bolunmuyorsa 4 e bolunmelidir .   2004 ==>Leap   2005==> Leap degil


         */

        int year = 1600;
        String result = year%100==0 ? (year%400==0 ? "Leap" :"Not Leap") : (year%4==0 ? "Leap": "Not Leap");

        System.out.println(result);

    }
}
