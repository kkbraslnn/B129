package practice;

public class TeamWork {
    public static void main(String[] args) {
        /*B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
        olmadıgını kontrol etmek !ç!n kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
‘  AliCan  ’ için konsolda false yazmalıdır.
‘   Ali Can   ’ için konsolda false yazmalıdır.
‘AliCan’ için konsolda true yazmalıdır./*


         */

        String str="AliCan";

        String strtrim=str.trim();

        String strtrimbosluksuz=strtrim.replaceAll("\\s","");

        boolean  sonuc=strtrim.length()-strtrimbosluksuz.length()==1;
        System.out.println(sonuc);














    }
}
