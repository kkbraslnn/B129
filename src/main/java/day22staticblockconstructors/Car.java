package day22staticblockconstructors;

  /*
      Constructor nedir?
      Class'dan obje uretmemize yarayan code blocklaridir.
      Class olusturdugunuzda Java bize otamatik olarak constructor verir.
      Ama bu constructor gozle gorulmez, gozle gorulmeyen otamatik olarak Java tarafindan verilen bu constructor'lara
      "default constructor" denir. Bu sadece obje olusturmaya yarar.
      "default constructor" lar  ==> "Car(){}" seklindedir.
      Siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler.
      Bir class'da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.
      Farkli constructor'lar sayesinde bir class'dan farkli farkli object'ler olusturabilirsiniz.
      Interview sorusu: Method ile Constructor'in farki var midir? Varsa nedir?
      Cevap:            Method ile Constructor farkli yapilardir.
                        i) Method'larda "return type" vardir ama "constructor'larda" "return type" yoktur.
                        ii) Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                            Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.
       */




public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

    }
    public  Car(String make, String model){
        this.make=make;
        this.model=model;

        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }
    }

    // Intellij yardimiyla hizlica yaptik. generate==>
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

//CarRunner clasindaki objeleri console'da gormek icin
//    bu class'da' sag tikla orda generate'ye bas
//    we toString bas ve hepsini tikla ve ok de.

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}