package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

       //ex1: Bir String in bas ve sonunda space character i varsa siliniz.
       //     "    Ali   Can   "   ==>     "Ali Can"

       String s = "  Ali Can  ";
       System.out.println(s);

        // trim() method u bir String in bas ve sonundaki space character lerini siler,aradaki space lara dokunmaz.
       String sTrimmed = s.trim();
       System.out.println(sTrimmed);

       //ex2 : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //     String tv = "$456.99"; String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98


        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 =tv1.replace("$" , "");
        System.out.println(tv2);

        String laptop2 =laptop1.replace("$","");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //ex3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //     "Ali Can" ==> AC

        String name ="  ali cAN  ";

       char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char second = name.trim().split(" ")[1].charAt(0);
        System.out.println(second);//C

        System.out.println("" + first + second);//AC

        //4: Bir String in hic character icermedigini (Bos String) kontrol ediniz.

        String str = "";

        //1.yol length () kullan
        boolean result1 = str.length() ==0;
        System.out.println("String bos mu ?" + result1);

        //2.yol isempty() kullan.Java bir konuda method uretmisse , o methodu kullanmak en iyisidir
        Boolean result2 = str.isEmpty();
        System.out.println("String bos mu ?" + result2);

        //ex5:Bir String in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String t = "      ";

        //1.yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?" + result3);
        //2.yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?" + result4);
        //3.yol
        //isBlank() methodu sadece space iceren String ler icin true verir ,space disinda bir character icerirse false verir.
        //isBlank() methodu bos String ler icin de true verir.
        //isBlank() ==> space + hicbir sey icin true     isEmpty==>hicbir sey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5);

        //ex6: Bir String de a,e,i characterlerinin ilk gorunumleri toplamini ekrana yazdirirniz
        //     "Java is easy to learn" ==> 1+5+8=14

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');//1
        System.out.println(idxA);
        int idxI = r.indexOf('i');
        System.out.println(idxI);//5
        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index ler toplami: "+ (idxA + idxI + idxE));

        //ex7:Bir String de "java" kelimesinin ilk kacinci indexlerde kullanildigini ekrana yazdirirniz
           //   "Ah Java vah Java sensiz olmuyor Java."

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        // indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz.

        int idxJava = u.indexOf("Java");

        System.out.println(idxJava);//3

        //indexOf() methodu olmayan character ler icin kullanilirsa her zmaan "-1" verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //ex8:Bir String de a,i,e characterlerinin son gorunumleri toplamini ekrana yazdirirniz
        //        //     "Java is easy to learn" ==> 5+17+18=40

        String v = "Java is easy to learn";

       int idxOfA= v.lastIndexOf('a');//18
        System.out.println(idxOfA);

        int idxOfI= v.lastIndexOf('i');//5
        System.out.println(idxOfI);

        int idxOfE= v.lastIndexOf('e');//17
        System.out.println(idxOfE);

        System.out.println(idxOfA + idxOfI + idxOfE);//40

        // lastIndexOf() methodu olmayan character ler icin kullanilirsa her zmaan "-1" verir.

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

        //Java daki if cumleis

        //ex10:Sayi cift ise ekrana pozitif yazdirin
        int num = 12;

        if(num>0){
            System.out.println("Pozitif");
        }

        //ex11:Sayi -1 ile 10 arasinda  ise ekrana rakam yazdirin
        int number= 3;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }


        //ex12:Sayi 3 basamakli ise ekrana "Wooow!" yazdirin.
        int sayi =123;

        sayi = Math.abs(sayi);//-123 icin

        //mutlak deger eksi sayiyi pozitif sayiya cevirir

        if(sayi>99 && sayi<1000){
            System.out.println("Wooow!");
        }





    }
}
