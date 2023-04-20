package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
               Java da method nasil olusturulur?

               1)main method un disinda olusturulur
               2)Access Modifier + Return Type + Method Ismi + () + {}

               Olusturulan methodlar nasil kullanilir?
               1)main methodun icinden kullanilir.
               2)methodun ismini yazin + () yazin
               3)Islem yapacaginiz sayilari parantezin icine koyun


         */

    public static void main(String[] args) {

       int sonuc = add(30, 50);
        System.out.println(sonuc);

       long carpmaSonucu = multiply(3,6);
        System.out.println(carpmaSonucu);

       int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);

       double kup = getCube(5);
        System.out.println(kup);

    }

    public static int add(int a, int b){
        return a+b;

    }

    protected static long multiply(int a, int b){
       return a*b;
    }

    //ornek1:verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz
     private static int firstTwoMultiplyThirdAdd(int a, int b,int c){
        return a*b+c;
    }
    //ornek2: verilen bir ondalik sayinin kupunu hesaplayan metodu olusturup kullaniniz.
    //note:Access Modifier i default yapmak icin access modifier i yazmayiniz.
     static double getCube(double a){
        return a*a*a;
     }

     //1)Dikdortgenin alanini hesaplayan methodu olusturnuz ve hesaplayiniz
    //2)Dikdortgenin cevresini hesaplayan methodu olusturnuz ve hesaplayiniz
    //3)Dairenin cevresini hesaplayan methodu olusturnuz ve hesaplayiniz
    //4)Dairenin alanini hesaplayan methodu olusturnuz ve hesaplayiniz


}









