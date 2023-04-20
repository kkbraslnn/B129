package day27encapsulationabstraction;

public class Student {

    private String stdId = "AC123";    // private koyarsak saklar
    private double gpa = 3.99;

    private boolean poor = true;
    /*
      Encapsulation is data hiding (bilgileri gizleme saklama).
      Nasil data saklanir bir class'in icinde: access modifier'ini private yaparim boylelikle saklamis olurum.
               Encapsulation yapilmis data'yi okuyabilir miyiz?
      get method'lar(getter) encapsule edilmis(saklanmis) data'yi okumamiza yarar.
      get method'lar(getter) her zaman "public" olur.
      get method'lar(getter) return type'i variable'larin data type'i ile ayni olur.
      get method'lar(getter) isimleri "get + variable name" seklinde olur.
      get method'lar(getter) isimleri variable boolean ise "is + variable name " seklinde olur.
      get method'lar(getter) parametre kullanmazlar.
     */


    public String getStdId() {return stdId;}   // sag click generate getter ok

    public double getGpa() {return gpa;}

    public boolean isPoor() {return poor;}   // normalde yukarida getle basladi burda is ile basladi

/*
  Encapsulation yapilmis data'larin degeri degistirilebilir mi?
  set method'lar (setter) encapsule edilmis data'larin degerlerini degistirmemize yarar.
  set method'lar (setter) her zaman "public" olur.
  set method'lar (setter) return type'i her zaman void dir.
  set method'lar (setter) isimleri "set + variable name" seklinde olur.
  set method'lar (setter) variable ile ayni data type'inda parametre kullanirlar.
  getter ve setter'larin ikisine birden "Java Beans" denir.
  set method'lar kalibi degistirmez , objeyi degistirir
 */

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setStdId(String stdId) {this.stdId = stdId;}

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}