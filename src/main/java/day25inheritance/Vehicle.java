package day25inheritance;

public class Vehicle {


    /*
     1) Child class'dan bir object olusturdugunuzda Constructor'lar en ustteki
        parent class'dan baslatilarak alta dogru calistirilir.
     2) Child Class'daki constructordan Parent Class'daki constructor'a gidebilmek icin "super()" kullanilir.
     3) Parent Class'da birden fazla constructor varsa istenilen constructor, "super()" ifadesinin  parantezi icine yazilan
        parametreler yardimi ile secilebilir.
     4) Ayni Class icindeki constructor'lari secmek icin "this()" kullanilir.
        Ayni Class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin parantezi icine yazilan
        parametreler yardimi ile secilebilir.
     5) "super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
        Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
     6) "super()" ve "this()" ifadesi constructor icinde her zaman ilk satirda olmalidir.
     7) Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bak 6. kurala...
     8) Inheritance'da variable'lari ve method'lari cagirmak icin "this" veya "super" kullanilir.
        "this" ayni class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
        "super" parent class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
                  meshur interview sorulari:
         super()  ve super farki nedir?
         super() parent'daki constructorlari cagirmak icin
         super  parent'daki variable'i cagirmak icin
      9) Inheritance'da object kullanarak variable cagirirsaniz, object'in data type'ni temsil eden class'dan
         variable'i aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.
      10) Inheritance'da object kullanarak method cagirirsaniz, object'in constructor'ini temsil eden class'dan
         method'u aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.
         Note: Code okurken main method'la baslamalisiniz, cunku main method her seyin basladigi yerdir.
       OOP Principals:
       i) Inheritance
       ii) Polymorphism : Method Overloading + Method Overriding
       iii) Encapsulation
       iv) Abstraction
   */

    public int price= 12000;   // variable olusturduk

    public void engine(){
        System.out.println("Vehicle engine");  // method olusturdum
    }


    public Vehicle(){    // constructor olusturduk
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){


        System.out.println("Vehicle 2: " + price);
    }
}