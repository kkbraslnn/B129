package ssgscanner;

import java.util.Scanner;

public class Scanner02 {
    //uzunluk,genislik,yukseklik olan dikdortgenler prizmasinin hacmini
    //hesaplayan bir program yaziniz
    //ipucu:dikdortgenin hacmi = width*height*length
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("uzunlugu giriniz ");
        double length=input.nextDouble();

        System.out.println("genisligi giriniz");
        double width = input.nextDouble();

        System.out.println("yuksekligi giriniz");
        double height = input.nextDouble();

        System.out.println("dikdortgenler hacmi:" + length*width*height);


    }

    public static double dikdortgenHacmi(double length,double width,double height){
        return length*width*height;
    }
}
