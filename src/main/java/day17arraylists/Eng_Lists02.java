package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Eng_Lists02 {
    public static void main(String[] args) {
        //ex1: Type code to remove the first occurrence of a spesific element from a String List
        //     ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        //To remove first occurrence  Java created a method which is "remove()"
        List<String>a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println(a);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //ex2: Type code to all occurrences of a spesific element from a String list
        //     ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        List<String>b = new ArrayList<>();
        b.add("Shoes");
        b.add("TV");
        b.add("Radio");
        b.add("Laptop");
        b.add("Shoes");
        b.add("Book");
        b.add("Shoes");

        List<String> c = new ArrayList<>();
        c.add("Shoes");

        b.removeAll(c);
        System.out.println(b);//[TV, Radio, Laptop, Book]

        //ex3:Type code to remove an element at a specific index
        //     ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]     remove the 5th element

        List<String>d = new ArrayList<>();
        d.add("Shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("Shoes");
        d.add("Book");
        d.add("Shoes");
        System.out.println(d);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        d.remove(4);
        System.out.println(d);//[Shoes, TV, Radio, Laptop, Book, Shoes]

        //ex4:Create an integer list , then remove the 4th element
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);//[12, 4, 13, 25, 432]
        e.remove(3);
        System.out.println(e);//[12, 4, 13, 432]

        //ex4:Create an integer list , then remove the first occurence of 4
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);

        System.out.println(f);//[12, 4, 13, 25, 432]

        f.remove(Integer.valueOf(4));
        System.out.println(f);//[12, 13, 25, 432]

        //Note: If you use Integer List element directly inside the remove() method lik remove (4), Java will accept it as index,
        //      Because indexes are primitive integers, when you put 4, it will be accepted as primitive and it will be index.
       //       Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
        //      To do that, use valuef() method from Integer wrapper class




    }
}
