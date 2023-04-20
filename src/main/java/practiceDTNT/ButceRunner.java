package practiceDTNT;

public class ButceRunner {

    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi butce="+Butce.butce);
        baba.maasAl(3000);
        System.out.println("Maas sonrasi butce="+Butce.butce);
        baba.harclikAl(100);
        baba.harclikHarca(20);
        baba.ButcedenHarca(500);
        System.out.println(baba.harclik);
        System.out.println(Butce.butce);




    }//main
}//class
