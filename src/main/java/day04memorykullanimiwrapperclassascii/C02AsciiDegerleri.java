package day04memorykullanimiwrapperclassascii;

public class C02AsciiDegerleri {

    /*
 ASCII= Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
 Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi  char data
 turunde isleme alinirsa o char degerinin Ascii Table'daki karsiligini isleme alir.
 Harf ve sembollere deger atar.
 Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda
 hersey 1001001 den olusur. bu yapiya cevirebilmek icin Ascii Table olusturulmustur.
 Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.

*/

    public static void main(String[] args) {
        //Bir tam sayi ile bir harfi toplayiniz

        int deger = 20;
        char harf = 'a';

        //1.yol

        int sum = deger+harf; // 20+97
        System.out.println("Bir tamsayi ile harfin toplami="+sum);
        
        //2.yol

        System.out.println(deger+harf);
        
        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);
        
        char rakam2='2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3= '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+ rakam1+rakam2+rakam3+rakam4);//1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 ASCII toplam= "+ (rakam1+rakam2+rakam3+rakam4));//202(Ascii degerini aldi.

        char kh='a';
        char bh='A';

        System.out.println("a'nin Ascii degeri = "+(kh+0));//97
        System.out.println("A'nin Ascii degeri = "+(bh+0));//65

        System.out.println("kh >bh ==>  " + (kh<bh)); // true //karsilastirma islemlerinin sonucu true ya da false doner


        //Herhangi bir karakterin ASCII degerini hasaplatalim.

        //1.yol

        char space =' ';
        System.out.println(space+ 0);

        //2.yol

        int hrf = 'm';

        //Char data type larinda Java karaktere int degerde atanabilir
        //cunku char data typenin bir resim degeri bir de ASCII den gelen integer degeri vardir
        //Bu sekilde de ASCII degerini bulabiliriz

        System.out.println("int harfin ascii degeri" +hrf);



        byte b= 125;
        float f = 2.45648f;
        long l= 54565378692L;
        char ch ='h' ;
        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(b<ch);//false















    }

}
