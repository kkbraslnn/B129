package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - long - float - double
//float : virgullu sayilar (ondalik sayilar - decimal numbers) icin kullanilir.memory de daha az yer kaplar.(fiyatlandirmalarda kull.12.99)
//double: virgullu sayilar (ondalik sayilar - decimal numbers) icin kullanilir.memoryde daha fazla yer kaplar.(hucre agirligi: 0.000000012)
//
    //!!!!!!!interview de sorulabilir!!!!!!
    //note1:primitive data type larini java olusturmustur ,biz olusturamayiz
    //note2:primitives her zaman kucuk harfle yazilir.
    //note3:primitive datalar data type lara gore memory de farkli farkli yer kaplarlar.
    //note4:primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar


    public static void main(String[] args) {

        //orn1: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ...
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89f;
        //note; java 'decimal numbers' otomatik olarak "double" kabul eder o yuzden sonuna "F" ya da "f" konulur.
        //"float" yazarsak hata verir.
        //float memory de 4 byte yer kaplar, double 8 byte yer kaplar.

        //System.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar.
        //System.out.print() ekrana yazdirir ve "pointer"i ayna satirda tutar
        System.out.println(shirtPrice + shoesPrice);
        //System.out.println() yazdirmanin kisa yolu ==> sout yaz ve enter a bas
        System.out.println();
        //ornek2 : Hucre agirligi ve amipin agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirirn.
        //genelde decimal numbers icin double kull
        double weightCell = 0.00000000012;
        double weightAmip = 0.00000000023;

        System.out.println(weightCell - weightAmip);//-1.1000000000000001E-10 ==>'E' exponent numbers uslu sayilar





    }



}



