package day07ifstatement;

import java.util.Scanner;

public class EngIfStatement02 {

    public static void main(String[] args) {

        /*

        ex1: Type code to print "Weekday" for the weekday names, "Weekend day for the
        weekend day names
        Monday -->Friday ==>Weekday
        Saturday,Sunday ==>Weekend day

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName = input.next();

        //note:To come Strings use "equals()", do not use "=="
        //1.Way :That code works ,but it has many repetitions and Java does many tasks
        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")) {
            System.out.println("Weekend Day");
        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend Day");
        }


        //2.way:I will use if-else statement

        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");

        } else if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend Day");
        } else {
            System.out.println("Invalid Day Name");
        }


        /*
        note:"OR" operator in Java is "||"
             " || " can be used just with "boolean"s


             true || true ==> true
             true || false ==> true
             false || true ==> true
             false || false ==> false
         */


    }
}
