package day27encapsulationabstraction;

public abstract class Courses {


    /*
     1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
       Body'si olmayan method'lara" abstract method (soyut meleklerin bodysi yok soyut varlik)"lar denir.
     2) "Abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
        Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur etmek isterseniz
        o method'u abstract yapmak gerekir.
     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
       " access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.
     4) "Abstract method"lar siradan class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar
        abstract olmak zorundadirlar.
      5) "abstract class " larda hem "abstract method " lar hem de "concrete method" lar kullanilabilir.
      6) "Concrete class" lar "abstract class "larin child'i olabilirler.
          "abstract method " larin override edilme zorunlulugu "concrete class" lar icindir.
     */

    public abstract void math();    // abstract method   zorunlu ders gibi

    public void art() {
        System.out.println("Painting...");   // concrete method secmeli ders gibi
    }


    // final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
    // Bu celiskidir, bu yuzden Java abstract method'larin final olmasina musaade etmez.
    // public final  abstract void science();
    // Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
    // Ama "Abstract Class" lar icin Child Class olmalidir, cunku Child Class'lar abstract parent class'daki abstract
    // method'lari kullanirlar.
    // Bu yuzden, Java "Abstract Class " laerin "final" olmasina musaade etmez.
    // "abstract method "lar "private" olamazlar, cunku child class'lar abstract method'lari kullanirlar,
    // private yapinca kullanima kapali olur.
    // Bu celiskidir, bu yuzdne Java abstract method'larin "private" olmasina musaade etmez.

    // "abstract" method'lar "static" olamazlar cunku static method'lar override edilemez,
    // halbuki abstract method'lar override edilmek icin olusturulmustur.



}