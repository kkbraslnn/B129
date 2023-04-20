package interviewquestions;

public class InterviewQuestion24 {
    public static void main(String[] args) {
        /*INterview Sorusu

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        int numberofbananas=165;//4 8 12 ....... 164 ==>geriye bir muz kaldi
        int survivaldays=1;     //1 2 3  ....... 41  ==>42. gun oldu
        boolean monkeyalive=true;

        do {
            System.out.println("***maymunlar gunde 4 muz yer***");
            numberofbananas -= 4;//toplam muz sayisindan her gun 4 muz eksiltir.
            System.out.println("Kalan muz sayisi" + numberofbananas);
            survivaldays++;

            if (numberofbananas<4){
                monkeyalive=false;
                System.out.println("Bugun "+ survivaldays+". gun yeterli muz kalmadi.Maymun rahmetli(rest in peace)");
                System.out.println("Bugun "+ survivaldays+".gun oldu");
            }else{
                System.out.println("Bugun "+ survivaldays+".gun maymun hala yasiyor");
            }

        }while(monkeyalive);//do while loop




    }//main
}
