package day15arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Eng_Arrays02 {
    public static void main(String[] args) {

        //ex1:Create a string array and print the elements in alphabetical order on the console in different lines

        String cities[] = new String[5];

        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "Jacksonville";
        cities[4] = "Calgary";

        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacksonville, Calgary]

        //How to put elements in alphabetical order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacksonville, Tokyo]

        for (String w : cities) {
            System.out.println(w);
        }

        //note; To get the number of characters from a String use"length()"
        //      To get the number of elements from an Array use "length"

        //ex2:Create a String Array and print the elements whose length is less than 5
        //Short way to create an array and add elements into th array
        System.out.println();
     /*
       String names[] = {"Ali","Thomas","Mark","Jackson","Tom","Martin"};
        System.out.println(Arrays.toString(names));
        for(String w : names){
            if(w.length()<5){
                System.out.println(w);
                */


        //ex3:Create a String Array and print the elements before "Tom"
        String students[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

     /*   for (String w : students) {
            if (w.equals("Tom")) {
                break;
            }
            System.out.println(w);

      */

        //ex4: Create a String Array and print the elements before "Tom" and "Tom"
        for (String w : students) {
            if (w.equals("Tom")) {
                break;
            }

        }
        //ex5: Create a String Array and print the elements different from "Tom"

        String employees[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for (String w: employees){
            if(w.equals("Tom")){
                continue;
            }
            System.out.println(w);

        }

    }
}















