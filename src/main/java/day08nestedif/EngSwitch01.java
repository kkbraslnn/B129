package day08nestedif;

import java.util.Scanner;

public class EngSwitch01 {

    // Switch statement does the some with "if - else if",
    //it has just different syntax

    public static void main(String[] args) {

       //Get the number of days from user and print the name of the day
        //For example

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number");

        byte dayNumber = input.nextByte();

        //1.way:if/ else-if
        if(dayNumber==1){
            System.out.println("Sunday");
        }else if (dayNumber==2){
            System.out.println("Monday");
        }else if (dayNumber==3){
            System.out.println("Tuesday");
        }else if (dayNumber==4){
            System.out.println("Wednesday");
        }else if (dayNumber==5){
            System.out.println("Thursday");
        }else if (dayNumber==6){
            System.out.println("Friday");
        }else if (dayNumber==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day number");
        }


        //2.way:"Switch Statement"

        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");


        }

















    }
}
