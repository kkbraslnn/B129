package day22staticblockconstructors;

public class StaticBlocks01 {

    // Bir variable olusturdugunuzda , deger atamazsaniz o variable'i "initialize- baslatmak demek" etmediniz demektir.
    // Static variable'lar static block'lar icinde initialize edilirse o class'in icinde herseyden once hazir hale getirilmis olur.
    // Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir bu yuzden static block'lar kullanilir.

    // Note 1: "static block" static variable'lari initialize etmek icin kullanilirlar.
    // Note 2: "static block" lar class icinde "herseyden once" calistirilirlar.

    // "STATIC BLOCK" static variable'larin main method calistirilmadan once hazir olmasini temin eder.
    // Static block sentezi =  static{}


    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Static block 1");}

    static{
        shape="Circle";
        System.out.println("Static block 2");}

    public static void main(String[] args) {
        System.out.println("main method");


    }

}