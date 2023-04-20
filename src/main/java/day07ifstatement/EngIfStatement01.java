package day07ifstatement;

public class EngIfStatement01 {

    public static void main(String[] args) {

        //If Statement: We sometimes need to execute some codes under some spesific conditions

        //ex1:Type code to print negative for the numbers less than zero, non-negative for the numbers greater than or equal to zero

        double d = 2.3;

        if(d<0){

            System.out.println("Negative");

        }

        if(d>=0){
            System.out.println("Non-Negative");
        }

        //note:"%" in Java is an operator gives you the remainder in division operation
        //     "%" is called "modulus" operator

        //note: "==" in Java checks quality like "=" in Math

        //note: "!" in Jva means "not"
        //      !true ==> false   !false ==>true  !!true ==>true
        //       "!=" means "does not equal to"


        //ex2: Type code to print "Divisible by 5 " if the number can be divided by 5
        //otherwise print "Not divisible by 5" if the number cannot be divided by 5

        //1st way
        int i = 15;

        if(i%5 == 0){
            System.out.println("Divisible by 5");
        }
                                                         //2 conditions were checked
        if (i%5!= 0) {
            System.out.println("Not Divisible by 5");
        }


        //second way

        int k =15;
        if(k%5 == 0){
            System.out.println("Divisible by 5");              // //1 condition was checked
        }else{
            System.out.println("Not Divisible by 5");
        }




    }

}


