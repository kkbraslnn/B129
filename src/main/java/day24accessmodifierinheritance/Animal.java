package day24accessmodifierinheritance;

public class Animal {


//  Buyuk seyler yavas haraket eder, kucuk seyler hizli hareket eder dag ve sinek ornekleri.


    /*
                     Inheritance'in faydalari:(INGILIZCEDE MIRAS DERLER)
    * Java'da inheritance, bir objenin/ class'in baska bir objenin/ class'in
    * tum ozelliklerini ve davranislarini elde ettigi mekanizmadir.
    1) Code standardinda tekrar iyi degildir.
    2) Code degisime acik olmalidir. Hatayi duzeltmek kolay olmali.
    3) Gelisime update'e acik olmali.
    4) Code atomic yapida olmali.
    Note 1: parent class (super class) (ortak ozellikleri icerir) - "child class" (sub class) (Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bagli child class'i belirtmek icin "extends" keyword kullaniriz
    Note 3:" public" method'lar" child class'lar tarafindan kullanilabilir".
           " child class'lar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
    Note 4:" protected" method'lar "inherit edilebilir".
            Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilabilir.
    Note 5:" default" method'lar object'in uretildigi class ile ayni package'de olduklari surece "inherit edilebilir".
            Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler.
    Note 6: "private" method'lar "inherit edilemezler".
    Note 7: Java "birden fazla parent'i"  (multiple inheritance Java tarafindan desteklenmez) onaylamaz.
    Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
            Apartman gibi olan.
    Note 9: Java'da Object Class tum Java Class'arinin ortak parent'idir.
    Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
    Note 11: Java'da parent'dan child'a olan olan iliskilere "HAS - A RELATIONSHIP" denir.
             Java'da child'dan parent'a olan olan iliskilere "IS - A RELATIONSHIP" denir.
    Note 12: Java'da her class'in bir tane default constructor'i vardir.
             Bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir.
             Bizim class'miz default constructor'a ihtiyac duydugunda parent olan "Object Class" a gider ve oradaki constructor'i kullanir.
       Javada birden fazla parent'i onaylamaz
    */

    public void eat() {System.out.println("Animals eat...");}

    void drink() {System.out.println("Animals drink...");}






}