package day16multidimensionalarrays;

public class Eng_Md02 {
    public static void main(String[] args) {
        //ex2: Print the elements which have "a" from a 2 dimensional String array.{{"learn","java","it"},{"is","easy"}}
        String arr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
        for (String[] w : arr) {

            for (String u : w) {

                if (u.contains("a")) {
                    System.out.println(u + " ");
                }

            }
        }

        //ex2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = { {12,54},{3,2,7},{21} };

        int sum= 0;

        for(int[] w: brr){

            for(int u:w){
                sum= sum+u;

            }
            System.out.println(sum);
        }
    }
}
