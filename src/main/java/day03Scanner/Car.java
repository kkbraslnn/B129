package day03Scanner;

public class Car {
    //class>> variables (pasif ozellikler) ==>object


    public String model = "Corolla" ; //pasif ozellikler Variable

    public int fiyat = 200000;


    public static void main(String[] args) {

        //Class ismini yazin #Objeye ismini verin new keywordunu kullanin  Class ismini ()
          Car                 myCorolla         = new                     Car();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();


    } // main in body si

    public void hareket (){//Aktif ozellikler Methodlar

        System.out.println("Toyota hizli hareket eder...");

    }

    public void dur () {//Aktif ozellikler Methodlar

        System.out.println("Toyota guvenle durur...");

    }


} //Class body si
