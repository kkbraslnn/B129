package day30exceptionsinterface33session;

public interface Ac {

    /*
   Interface'lerin icine "concrete method" konulamaz, cunku "concrete" method'larda
   body vardir ve body o method'un isi nasil yapacagini belirtir. Isin nasil yapilacagi
   bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
   Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz
   Child Class'in kafa karisikligini engellemis olursunuz.
   interface'ler "concrete method" iceremezler, dolayisiyla interface'in icindeki hicbir sey istege
   bagli degildir, hersey Child Class'lar icin mecburidir. Bu yuzden interface'lere
   "to-do-list "de (yapilmasi gerekenlerin listesi) denir.
   Interface'lerdeki tum method'lar otomatik olarak "public"dir, "abstract"dir,        "static" degildir..
   Interface'lerdeki tum variableler otomatik olarak "public" dir, "static" dir "final" dir.
   Interface'lerin icine CONCRETE METHOD konulamaz.
   ******* INTERVIEW'DE COK SIK YAPILAN HATA ********
  iNTERFACE class diyorlar, interface class degildir, interface interface'dir.
    */

    public void cool(); // burda sikayet etmiyor. Cunku Java biliyor interface'lerdeki method'lar kesin "abstract".
    // Sen yazsanda olur , yazmasanda.  abstract oldugu icin body olmuyor.
    void run();

    public static final int price = 2000;    // interface'deki variable'lar default olarak public, final, static'dirler.
    // public static final --- bu kelimeleri basinda yazdirmasanda olur.

    String model = "Mitsubishi";












}