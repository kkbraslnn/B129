package day11loops;

public class C03_ForLoopNT {
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
