package day30exceptionsinterface33session;

public class HondaRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();

        Accord myAccord = new Accord();
        myAccord.cool();

        System.out.println(Ac.price);  // variable icin obje olusturmaya gerek yok
        System.out.println(Engine.price);
        System.out.println(Security.price);
        System.out.println(Ac.model);



    }
}