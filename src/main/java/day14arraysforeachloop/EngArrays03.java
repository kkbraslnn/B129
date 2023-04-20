package day14arraysforeachloop;

import java.util.Arrays;

public class EngArrays03 {
    public static void main(String[] args) {

        //Ex1:Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};

        //1.way
        String name = "Ali";
        int counter = 0;

        for (String w : str) {
            if (w.equals(name)) {
                counter++;
            }

        }
        if (counter > 0) {
            System.out.println(name + "exists in the array");

        } else {
            System.out.println(name + "does not exists in the array");
        }

        //2.way : we will use binarySearch() method
        //      i)if the element exists binarySearch() method returns the index of the element
        Arrays.sort(str);
        int idx = Arrays.binarySearch(str,"Carl");
        System.out.println(idx);//if the index zero or more ,it means the element exists

        int idxMiami = Arrays.binarySearch(str,"Miami");
        System.out.println(idxMiami);//-4 ==> "-" means does not exist. "4" means if it exists it would be 4th element.





    }
}
