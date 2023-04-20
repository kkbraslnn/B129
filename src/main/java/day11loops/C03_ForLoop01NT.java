package day11loops;

public class C03_ForLoop01NT {
    public static void main(String[] args) {
//Verilen bir Stringde ilk 'a' harfinden onceki tum character leri console a yazdiriniz
        //"I love Java"==>"I Love J"
        String s = "Tramvay";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(s.charAt(i));
        }

        System.out.println();

//ex:2 Verilen bir String te son 'a' dan sonraki tum character leri yazdiriniz
//     "Germany" ==>yn

        String t = "Germany";

        for (int i = t.length() - 1; i >= 0; i--) {
            char ch = t.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }
    }
}
