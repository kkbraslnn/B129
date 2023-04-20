package day25inheritance;

public class Honda extends Car {


    public int price = 10000;


    public void engine() {
        System.out.println("Honda engine");
    }


    public Honda() {
        //   this("R8", 2023);
        System.out.println("Honda 1");
    }


    public Honda(String model, int year) {
        super("Audi");      //super(); yazmazsaniz da ayni isi gorur. // buraya yazarsaniz hata verir, o yuzden ilk satirdan baska yere yazilmaz
        System.out.println("Honda 2: " + model + "- " + year);
    }
}