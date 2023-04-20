package day23datetimestringbuilder;

public class StringBuffer01 {



    /*
       String olusturmak icin String Class, StringBuilder Class, ve StringBuffer Class kullanilabilir.
       1) StringBuffer Java'nin String uretmek icin olusturdugu bir Class'dir. Java 5 de uretilmistir.
       2) StringBuffer "synchronized" dir, StringBuilder "synchronized (MANTIKLI SIRALAMA)" degildir.
       3) StringBuffer "thread-safe" (multi-thread'e uygun) dir, StringBuilder "thread-safe" degildir.
       4) StringBuffer ve StringBuilder ikiside mutable dir.
       SYNCHRONIZED olmadan multithread basarili olamaz.
       Note 1 : Immutable String lazim oldugunda String Class kullaniriz.
       Note 2 : Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
       Note 3 : StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
  Multithread -  Ayni anda coklu is yapmak.   thread - is anlamindadir.
  mesela: sen whatsapp'ta konusuyorken video yollayabiliyorsun, mesaj gelirse cevaplayabiliyorsun,istersen
  goruntulu bile konusabiliyorsun. ayni ayni cok isi yapabilmis oluyorsun.
     Corba salata etli yemek tatli  bunlari mantikli siralamayla yaparsan vakitten kazanabilirsin
  TESTER'LAR sTRING sTRINGbUILDER VE sTRINGbUFFER 3SININ FARKINI BILSIN YETER.
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf); // Java
        System.out.println(sbf.capacity()); // 20


    }
}