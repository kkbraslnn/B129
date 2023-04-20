package ssgmethodcreationobjectcreation;

import java.sql.SQLOutput;

public class SchoolRunner {
    public static void main(String[] args) {
        School obj=new School();
        System.out.println(obj.okulIsmi);
        System.out.println(obj.yil);
        System.out.println(obj.isActive);
        School.okulIsmi("Start Okulu");
        School.okulIsmi("Bahar okulu");
        School.yil(2023);
        System.out.println(School.yil(2023));
        System.out.println(obj.isActiveMi(false));
        









    }
}
