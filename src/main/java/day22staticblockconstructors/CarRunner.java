package day22staticblockconstructors;

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car("BMW", "M4",2023, false);
        Car c2 = new Car("Audi","R8",2022,true);
        Car c3 = new Car("Honda","Civic",1999,false);

        System.out.println(c1);// Car{make='BMW', model='M4', year=2023, hybrid=false}
        System.out.println(c1);
        System.out.println(c1);
        Car c4 = new Car("Mercedes","C300");
        System.out.println(c4);


    }
}