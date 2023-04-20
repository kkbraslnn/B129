package day16multidimensionalarrays;

public class Eng_Md04 {
    public static void main(String[] args) {

        //ex1: Find the max element in a two-dimensional array
        //     { {5,8},{-2,4},{65,-12,23} }

        int arr [][]={ {5,8},{-2,4},{65,-12,23} };
        int max= arr[0][0];
        for(int []w:arr){
            for(int u : w){
                if(max<u){
                    max=u;
               // max=Math.max(max,u);//max() method selects the maximum value of the given two numbers
                }
            }
        }
        System.out.println(max);























    }
}
