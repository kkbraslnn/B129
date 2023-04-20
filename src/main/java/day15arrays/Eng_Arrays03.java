package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Eng_Arrays03 {
    public static void main(String[] args) {

        //ex1:Let user enter students names into the application
        // (Create and Array together with the user)

        Scanner input = new Scanner(System.in);

        //1.step:Create an Array
        System.out.println("Enter the number of the students you want to enter");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println(Arrays.toString(names));

        //2.step:Insert the elements into the Array
        for (int i = 0; i < numOfStd; i++) {
            System.out.println("Enter the" + (i + 1) + "student name.To stop insertion press Q");
            String stdName = input.next();
            if (!stdName.equalsIgnoreCase("q")) {
                names[i] = stdName;
            } else {
                break;
            }

        }
        System.out.println(Arrays.toString(names));


    }
}
