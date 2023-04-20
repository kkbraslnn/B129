package day07ifstatement;

import java.util.Scanner;

public class C06_EngIfStatementNt {

    public static void main(String[] args) {
        //ex1: Get first,middle,last names and the SSN from the user then print them like the given format
        //     Tom Jim Hanks
        //     234567891

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your middle name");
        String middleName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter you SSN");
        String ssn = input.next();

        System.out.println(firstName+ " " +middleName+ " " +lastName);
        System.out.println(ssn);






    }

}
