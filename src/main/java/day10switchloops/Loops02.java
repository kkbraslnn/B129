package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {
        //ex1: 21 den 180e kadar hem 4 hem 6 ile bolunebilen tamsayilari yazdiran kodu yazdiriniz

        for (int i=21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.println(i + " ");
            }
        }

        System.out.println();
        //ex2:size verilen kucuk harfle yazilmis stringin indexi cift sayi olan karakterlerini buyuk harf yapiniz
        //       ankara ==> AnKaRa
        //note:Yazdiginiz doce belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu kodlara 'hard kod' denir
        //'hard code' yanlis yazilmis code dur mutlaka duzeltilmelidir.

        //note:Bir String de son index=length()-1


        String s = "ankara";


        for(int i=0;i<s.length(); i++){

            String ch = s.substring(i, i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }






















    }
}
