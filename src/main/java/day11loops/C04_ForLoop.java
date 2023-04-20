package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {
        //ex: 1 den 100 e kadar 6 ya bolunebilenler haric tamsayilari ekrana yazdiriniz
        for (int i = 1; i <101 ; i++) {
            if(i%6 == 0) {
                continue;//bosver
            }//if body
            System.out.print(i + " ");
        }//for body
        System.out.println();

        //interview sorusu

        //size verilen bir Stringi ters ceviren kodu yaziniz
        String str = "Kubra" ;//arbuK
        String ters = "";//yeni bir conteyner olusturduk

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);

            //ters=ters+harf
            ters+=harf;
            System.out.println(ters);//her bir adimi gormek istersek

        }
        System.out.println(ters);//sadece sonucu gormek istersek














    }
}
