package interviewquestions;

public class InterviewQuestion17 {
    public static void main(String[] args) {
        //interview sorusu
        //ex2:
        //Size verilen bir String in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
        //     civic,nalan,kucuk,11211 ==>Palindrome

        //logic:String i ters cevir sonrada duz hali ile ters halini
        //karsilatir,ayni ise "Palindrome" de

        String duz ="civic";

        String ters = "";

        for (int i =duz.length()-1 ; i >=0 ; i--) {

            ters = ters + duz.charAt(i);

        }

        if(duz.equals(ters)){

            System.out.println(duz +": Palindrome dur");

        }else{
            System.out.println(duz +": Palindrome degildir");
        }

    }
}
