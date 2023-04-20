package day30exceptionsinterface33session;


 /*
    1) Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz.
    2) Java parent'lar "Class" oldugunda "multiple parent" a musaade etmez ama biz bazen
       "multiple parent" a ihtiyac duyariz.
       Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu
       Bu yapi sayesinde bir Class icin coklu "interface parent" olusturabilirsiniz.
    3) Coklu interface parent'lerin icine ayni isimli method'lar koyabiliriz.
       Mesela: Ac'nin, Engine'nin ve Security'nin iclerine "run()" koymak gibi.
       Child Class herhangi birini override ettiginde hepsini override etmis gibi olur, sonrada
       body'yi Child Class'da yazarak uygulamasini yapmis olur.
     */

public class Civic implements Ac, Engine, Security {

    public void cool(){
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");  // bu uygulama kismi child'a kalmis
    }

}