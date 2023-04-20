package day20passbyvaluemethodoverloading;

public class Student {

        /*
Normal applicationlarda her class'in icine main method koymazlar, bir class olur ve o class main method'a sahip olur ve
diger class'lari calistirir. boyle class'lara "RUNNER CLASS'LAR DENIR".
        Static 1 kere olusturulur.
        Non-Static ise obje sayisinca olusturulur.
    1) static variable veya static method'lar (class member) tum object'ler icin ortak elemanidir.
    2) static class member'lar uzerinde tum degisiklikler tum object'leri etkiler.
    3) static class member'lar Class'a, non - static member'lar object'lere monte edilir.
       Mesela bir class'dan 100 tane object olusturdugunuzda non- static olanlar 100 kere olusturulur,
       non- static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4) Static class member'ara ulasmak icin object olusturmaya gerek yoktur, ama non - static class'lara
       ulasmak icin object olusturmak sarttir.
    5) static variable'larin diger adi "Class Variable" dir.
       Non-Static Variable'larin diger adi "Instance(GORUNUM) Variable" ve ya "Object Variable" dir.
         */

    public static String stdName = "Tom Hanks";  // static
    public int age = 13; // non-static

    // ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name) {
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }

    // Ogrenci ismindeki sesli harfleri(a, e, i, o, u) sayan bir method olusturnuz
    int counter = 0;

    public int countVowels(String name) {
        for (int i = 0; i < name.length(); i++) {

            char ch = name.toLowerCase().charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }

        }
        return counter;
    }


}