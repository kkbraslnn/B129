package day28exceptions;

public class Exceptions01 {

        /*
        1)Exception demek beklenmedik problem demektir.Seyahatte benzinin bitmesi ,arabanin bozulmasi gib..
        2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir.Mesela benzin bitince
        yol yardimi arariz.
           Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz ,
           bu isleme "Exception Handling " denir.
        3)Exceptionlar temel olarak ikiye ayrilirlar .
           i)Compile time exception:siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
           ii)Run time exception: siz code yazarken farkedilomez ama , code u calistirdiginizda concole da hata alirsiniz.
        4)Exception lar disinda "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
        Gercek hayatta soforun olmesi gibi,handle edilemeyecek durumlar "Error"dur
        Application larda "Memory" dolmasi "Error"dur.
        iki tur memory var i)Stack memory dolarsa "StackOverFlow Error" alirsiniz
                           ii)Heap Memory dolarsa "OutOfMemory Error" alirsiniz.
        5)Yazdiginiz code calismadiginda problemi bulmak icin "Log"lara bakariz
        6)if else kullanilirsa tum kosullari(olusabilecek muhtemel tum problemleri) yazmak zorundayiz.bu da kodu uzatir.
          ama try catch te java ilgili exception ile ilgili olusabilecek tum problemleri java yakalar.

         */

    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        divide(a,b);
        divide2(a,b);

    }

    //ArithmeticException yazdiginiz code da matematiksel islem kullaniyorsaniz alinabilecek bir Exception dir.
    //Nasil handle edilecegini asagida yazdik.

     public static void divide(int a, int b){
        try {
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("Do not divide by zero");

        }
     }
     public static void divide2(int a, int b){
        if(b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
        }
     }
}
