package day12loops;

public class ForLoop05NT {
    public static void main(String[] args) {

        // Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz

        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.print(i + " ");
        }

        //Note1:Bazi loop lar hic calismayabilir
        for (int i = 1; i < 0; i--) {
            System.out.println("Hi!");//zero execution

        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir
        //for (int i = 1; i <10 ; i--) {
        //System.out.println("Java is money...");
        //      }


        //Note3:Baska bir "Infinite(sonsuz) Loop"
        //Loop olusturdugunuzda 'ikinci kismi' yazmazsaniz "Infinite(sonsuz) Loop" olur

        //for (int i = 1; ; i++) {
        // System.out.println("Hi!");
        //  }


    }
}

