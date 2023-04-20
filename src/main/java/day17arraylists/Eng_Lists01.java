package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Eng_Lists01 {
    public static void main(String[] args) {

        //How to create a List (Array List)
        //1.way:
        ArrayList<Integer> mylist1 = new ArrayList<Integer>();
        //2.way:
        ArrayList<Integer> mylist2 = new ArrayList<>();
        //3.WAY:
        List<Integer> mylist3 = new ArrayList<>();

        //How to print a list on the console
        System.out.println(mylist3);// []

        //How to add elements into a list
        mylist3.add(12);
        mylist3.add(7);
        mylist3.add(23);
        System.out.println(mylist3);

        //How to add an element into a spesific index
        mylist3.add(1, 50);
        mylist3.add(3, 99);

        //How to join two lists
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("y");
        b.add("z");

        a.addAll(b);

        System.out.println(a);//[A, B, X, y, z]
        System.out.println(b);//[X, y, z]

        a.addAll(1, b);
        System.out.println(a);//[A, X, y, z, B, X, y, z]

        //How to get the number of elements in a List
        int sizeOfA = a.size();
        System.out.println(sizeOfA);//8

        int sizeOfB = b.size();
        System.out.println(sizeOfB);//3

        //note:When you talk about the number of the elements in an Array use "length
        // of the array" ,for the Lists use "size of the list"

        //ex1: Type code to check if the given List is empty or not?

        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');

        //1.way
        int sizeOfC = c.size();

        if (sizeOfC == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("\"The list is not empty\"");
        }

        //2.way: Java created a method to check if a list is empty or not
        //       isEmpty() method returns "true" if the list does not have any element
        //       isEmpty() method returns "false" if the list has at least one element
        boolean isEmty = c.isEmpty();
        if (isEmty) {
            System.out.println("The list is empty");
        } else {
            System.out.println("\"The list is not empty\"");
        }
        //note: If Java has a method for spesific functionality using the method is preferable

        //ex2: Type code to check if the list doesn't have any element from space or the list doesn not have any element
        //     [] ==> acceptable       [ , , ]==> acceptable    [a] ==> not acceptable
        //     Java created a method to check if a list is empty or the list has just space in it
        //     it is "isBlank()" method

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");

        //To be able to use removeAll() method you need list ,therefore we created a List contains space character
        //When you use removeAll() method, you will need a list stores the elements you want to remove
        List<String> e = new ArrayList<>();
        e.add(" ");

        d.removeAll(e);
        System.out.println(d);

        if (d.isEmpty()) {
            System.out.println("The list is empty or has just space character");

        } else {
            System.out.println("The list has chracters different from space");
        }

    }
}
