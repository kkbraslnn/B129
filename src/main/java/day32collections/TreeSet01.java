package day32collections;

import java.util.*;

public class TreeSet01 {

    public static void main(String[] args) {
        // bunuda ben yazdim oylesine gormek icin.
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(25);
        lhs.add(8);
        lhs.add(32);
        lhs.add(3);
        System.out.println(lhs); // [12, 25, 8, 32, 3]  insertion order(senin koydugun siraya gore)


        // TreeSet olusturalim
        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts); // [3, 8, 12, 25, 32]  Natural order(kucukten buyuge)


        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hs); // [32, 3, 8, 25, 12] Random (rastgele siraladi)

        long three = System.nanoTime();

        System.out.println("TreeSet in uygulama suresi: " + (two - one));
        System.out.println("TreeSet in uygulama suresi: " + (three - two));
        // Note : TreeSet eleman eklemede cokkkk yavas, HashSet ise coooook hizlidir.
        //        TreeSet'in bu negatif yonunden kurtulmak icin;
        //        HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e cevirirsiniz.


        // [3, 8, 12, 25, 32]
        int first = ts.first();
        System.out.println(first);//3

        int last = ts.last();
        System.out.println(last);//32

        int floor1 = ts.floor(15);         // verdiginiz degerin bir alti
        System.out.println(floor1);// 12 ==> 15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi.

        // floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz.
        int floor2 = ts.floor(12);
        System.out.println(floor1);// 12 ==> 12 elemanlardan biri  o yuzden 12 direkt yazdirildi.

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1); // 25 ==>  15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdirildi.

        // ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz.
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2); // 25 ==>  15 elemanlardan biri o yuzden 25 direkt yazdirildi.


        SortedSet<Integer> tailSet1 = ts.tailSet(12);  // tail kuyruk     // SortedSet<Integer>   data tipi
        System.out.println(tailSet1); // [12, 25, 32] ==> 12 elemanlardan biri  o yuzden "12 ve sonraki elemanlar" bir Set icine yazdirildi

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2); // [25, 32] ==>   15 elemanlardan biri degil o yuzden "15 den sonraki elemanlar" bir Set icinde yazdirildi.


        NavigableSet<Integer> tailSet3 = ts.tailSet(12, false);    //  NavigableSet<Integer> data tipi   tailset method'un icine girp bakabilirsin bilgi almak icin

        System.out.println(tailSet3); // [25, 32] ==> 12 elemanlardan biri  normalde  "12 ve sonraki elemanlar" bir Set icine yazdirildi,
        // ama ikinci parametre'de "false" kullandigim icin 12 haric tutuldu.


        //  ????????   1:15:15 dakikadan sonra

        // GENERIC METHOD - her data type'le calisan method demektir.   Tester sadece ne oldugunu bilmesi yeterli.
        // public E ceiling(E e){......}


    }


    }