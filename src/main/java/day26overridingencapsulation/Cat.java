package day26overridingencapsulation;

public class Cat extends Mammal {

    public void meow() {// Overriding Method
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {   //Override Annotation ==>Override kurallarinin Java tarafindan kontrol edilmesini saglar
        // Checks the overriding rules
        System.out.println("Cats eat...");
        //   super.eat(); // spuer-  parent'ta git eat'i kullan demek
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Animal create() {return new Cat();}

    @Override
    public int add(int a, int b) {return a+b;}

    @Override
    public Integer multiply(int a, int b) {return a*b;}}