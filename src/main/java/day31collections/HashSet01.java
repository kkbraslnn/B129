package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {


      /*
                                  COLLECTIONS
                                    Iterable
                                    Collection
    List                             Queue                      Set
    * ArrayList
    * LinkedList                     * PriorityQueue            * HashSet
                                                                * LinkedHashSet
                                     Deque
                                                                SortedSet
                                                                * TreeSet
      ArrayList ve LinkedList tekrari kabul ediyor.
      Ama  Set -  tekrarsiz tekrar yok demek. mesela @mail'ler unique, araba plakalari.
     * Hash - bir teknikdir, Java bu teknigi kullanarak benzersiz(UNIQUE) datalar uretir.
      2022  381       700          13                   (202238170013  - Java Hashing technique kullanarak  Hashcode uretir.)
      Yil   Uni Kod   Bolum Kodu   Bolume Giris Sirasi     Universitede her ogrenci numarasi farklidir/ unique dir.
     * Set - tekrarsiz data depolamak icin kullanilan bir Collection'dir.
       Set tekrar kabul etmez. Yani; tekrarsiz verileri depolamak icin kullanilir.
       Example: ogrenci kimlik numarasi, araba plakasi, tel numarasi    bunlar tekrarsiz
      "Set" ler 3 e ayrilir.
         i) HashSet: a) Super hizlidir, cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez.
                        yani HashSet'lere eklenen elemanlar rastgele (random) siralanirlar.Mesela: ogrenci @maillerini alfabetik siralamaya
                        koymaya gerek yokki, koy HashSetin icine. Hizli calissin application.
                     b) HashSet'ler tekrarli elemana musaade etmezler.
                     c) HashSet'ler sadece 1 tane "null" i eleman olarak kabul ederler.
        ii) LinkedHashSet:  a) LinkedHashSet elemanlari "insertion order- yani senin istedigin siralamaya gore" dizer.
                            b) LinkedHashSet elemanlari siralamakta zaman kaybettigi icin, HashSet'e gore yavastir.
                            c) LinkedHashSet'ler tekrarli elemana musaade etmezler.
        iii) TreeSet:       a) TreeSet elemanlari "natural order" (Kucukten buyuge veya alfabetik sira) a gore dizer.
                            b) TreeSet. "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
                            c) TreeSet'ler tekrarli elemana musaade etmezler.
       */


        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);    // 12'ninde hashkodu var
        hs.add(234);   // 234'ninde hashkodu var
        hs.add(78);
        hs.add(5);
        System.out.println(hs); // [5, 234, 12, 78] ==> gordugunuz gibi elemanlar rastgele siralandi.

        int hc = hs.hashCode();
        System.out.println(hc); // 329    hashsetin kodu


    }
}