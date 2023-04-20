package day11loops;

public class C03_ForLoop02NT {
    public static void main(String[] args) {
        //ex1:  Verilen bir String de 'a' character haric butun character leri yazdiriniz
        //       "Madagaskar"==>Mdgskr

        String s = "Madagaskar";
        //1.yol
        String t = s.replace("a", "");
        System.out.println(t);
        //2.yol
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a') {
                System.out.print(ch);
            }
        }
        System.out.println();

        //3.yol
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                continue;//bazi sartlar icin loopun adimlarini atlamamizi saglar
            }
            System.out.print(s.charAt(i));
        }


//eskiden interview de break ve continue keyword lerinin anlamlarini sorarlardi


    }
}
