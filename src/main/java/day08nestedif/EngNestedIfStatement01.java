package day08nestedif;


import java.util.Scanner;

public class EngNestedIfStatement01 {
    public static void main(String[] args) {

        /*
        Ask user to enter a password
        If the initial of the password is uppercase
            Check if it is 'A' or not.
        If it is 'A' the output will be "Valid Password"
        otherwise the output will be "Invalid Password"
        For example: Ali ==> Valid Password   -  ali ==> Invalid    -  Mark ==> Invalid

        If the initial of the Password is lowercase
           check if it is 'z' or not
        If it is 'z' the output will be "Invalid Password"
        For example; zoe ==> Valid Password    - Zoe ==> Invalid   - john  ==> Invalid
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        char pwdInitial = input.next().charAt(0);

        if (pwdInitial >= 'A' && pwdInitial <= 'Z') {

            if (pwdInitial == 'A'){
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid Password");
            }
        } else if(pwdInitial >= 'a' && pwdInitial <= 'z'){
            if (pwdInitial=='z'){
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid Pasword");
            }

        }









    }
}
