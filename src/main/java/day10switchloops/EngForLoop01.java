package day10switchloops;

public class EngForLoop01 {
    public static void main(String[] args) {

        ///////////very common interview question///////////
        //ex1:Type code to reverse a String
        //    For example: Tom ==> moT

        String name = "Mark";
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--){
            char ch = name.charAt(i);
            reversedName = reversedName + ch;
        }
        System.out.println(reversedName);//kraM

        //Interview question(very common)
        //ex2: Find the sum of the integers from 3 to 6

        int sum = 0;
        for(int i=3; i<7; i++){

           sum = sum + i;

        }

        System.out.println(sum);


        //Very common interview question
        //ex3: Find the multiplication of the integers from 3 to 6

        int multiplication=1;
        for(int i=3; i<7; i++){

            multiplication = multiplication*i;

        }

        System.out.println(multiplication);

        //Interview question very common
        //ex4: Type code to find the sum of the digits of an integer
        //   584 ==>5+8+4=17

        //note:"number %10" gives you the last digit
      int num= -584;
      num = Math.abs(num);
        int sumOfDigits = 0;
      for(int i =num; i>0; i=i/10 ){

          sumOfDigits= sumOfDigits+i%10;
      }

        System.out.println(sumOfDigits);

















    }
}
