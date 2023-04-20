package day24accessmodifierinheritance;

public class Student {

    // Defalut'lar ayni package daysan gozukur,olmazsa gozukmez.

    // name herkes tarafindan bilinebilir, o yuzden public yaptim
    public String name = "Tom Hanks";

    // student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden "default (diger adi PACKAGE PRIVATE)" yaptim.
    String stdId = "TH2023HU12001";

    // account number ben, esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected" yaptim.
    protected int accountNum = 76532145;

    // hseabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private" yaptim.
    private int balance = 123000;




    /*
       Bir grup == package demek
     */

    /*
                   ******  MESHUR INTERVIEW SORUSU ********
        1)  Access modifier'lar ne ise yararlar?
            Variable'lara, method'lara, ve class'lara ulasmayi duzenler.
            * zaten access - ulasmak ve modfier- duzenleyici demek, yani ulasim duzenleyici
        2)  Class'lar protected ve private olamazlar, sadece public ve default olabilirler.
        3)  Kac tane access modifier vardir?
            public > protected > default > private
            * ONLARI ACIKLAR MISINIZ?
            i) "public"'ler icin hicbir sinirlama yoktur projenin her tarafindan ulasilabilir.
            ii) "protected" ayni package'in icindeyseniz heryerden ulasilabilir farkli package giderseniz o package'deki cocuklar yani child class'lar ulasabilir
            iii) "default" sadece ayni package'den ulasilabilir. package'in disina cikarsan ulasilamaz. Bu yuzden default'larin diger adi " package private" dir
            iv) "private" sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz.
            v) "protected" ile "default" un FARKI nedir?
                Package disina ciktigimizda childlardan "protected" lara ulasabiliriz. "default" lara ulasamayiz.
        4)  Access modifier'lari genisden dara sayiniz?
            public> protected > default > private
     */






}