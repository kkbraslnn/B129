package day12loops;

import day03scannernt.Scanner01;

import java.util.Scanner;

public class C01_ForLoopIfElse {
    public static void main(String[] args) {

    /*
    Kullanicidan baslangic ve bitis degerlerini alin
    Baslangic degerinden baslayip bitis degerine kadar tum sayilari
    ekrana yazdiriniz
    */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = input.nextInt();

        if (baslangic > bitis) {
            System.out.println("Verdiginiz baslangic degeri bitis degerinden kucuk olmali");

        } else {

        }//else

        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");


        }//fori



        //odev
/*
    Kullanicidan baslangic ve bitis degerlerini alin
    Baslangic degerinden baslayip bitis degerine kadar aradaki
    tum cift tamsayilari ekrana yazdiriniz

    */











    }//main
}//class
