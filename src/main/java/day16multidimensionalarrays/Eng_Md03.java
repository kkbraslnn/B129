package day16multidimensionalarrays;

import java.util.Arrays;

public class Eng_Md03 {
    public static void main(String[] args) {
        //ex1:Convert multidimensional array to one dimensional array
        //{{"learn", "java", "it"}, {"is", "easy"}}; ==>{"learn", "java", "it","is", "easy"};

        String arr[][] ={{"learn", "java", "it"}, {"is", "easy"}};

        //1.step:Finf the total number of elements in the multidimensional array
        int sum= 0; //number of elements
        for(String[] w : arr){
            sum=sum +w.length;
        }

        //2.Step:Create one dimensional array by using the total of elements in multidimensional array

        String brr[] = new String[sum];
        System.out.println(brr);

        //3.Step:Transfer the elements from multidimensional array to one dimensional

        int idx=0;
        for(String[]w:arr){
            for(String u : w){
                brr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));











    }
}
