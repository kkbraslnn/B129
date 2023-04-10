package practice.daytime;

public class C02_MethodCreation {

    //Dikdortgenin alanini hesaplayan metodu olustururnuz ve kullaniniz.

    public static void main(String[] args) {

        //protokol alani

        dikdortgenAlani(5,10);

        



    } //main in body

    /*

         Access          static      Data         MethodAdi   (parametreler)
         Modifier                    type


     */


        public static int dikdortgenAlani (int a,int b){

            //main method static oldugu icin main icindeki her seyin static olmasi gerekir
            //method adi camelCase kucuk harfle baslar sonraki her kelimenin ilkk harfi buyukj olur.

              return a*b; //carpmanin sonucunu kullaniciya ver



    }


} // class
