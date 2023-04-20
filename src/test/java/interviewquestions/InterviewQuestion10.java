package interviewquestions;

public class InterviewQuestion10 {
    public static void main(String[] args) {
        //Interview sorusu:
        // ex9: Bir String deki tekrarsiz character leri ekrana yazdiriniz
        //      abbccdc==> ad

        String y = "aac";

        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);

        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }


        //note:Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //     Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //     If you study hard, you will learn Java.

    }
}
