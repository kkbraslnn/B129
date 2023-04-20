package pdf;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        // konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
               // Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
                Scanner scan = new Scanner(System.in); System.out.println("iki String giriniz :"); String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String a1[] = s1.toLowerCase().split(""); Arrays.sort(a1);
        String a2[] = s2.toLowerCase().split(""); Arrays.sort(a2);
        if (s1.length() != s2.length()) { System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) { System.out.println("Anagram Degil");
        } else if (Arrays.equals(a1, a2)) { System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }
    }
}
