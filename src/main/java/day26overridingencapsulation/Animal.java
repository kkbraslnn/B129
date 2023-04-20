package day26overridingencapsulation;

public class  Animal {

     /*
        1)Sometimes using method directly from parent class may not be enough for us.
          We may need the method to specify.
          When we need the method to specify, we change the method body.
          This is called "Method Overriding"
        2)We cannot touch "Method Signature"(Method Name and Method Parameters) in "Method Overriding"
          I mean do not touch Method Name and Method Parameters in "Method Overriding"
        3)The method in child class(Overriding Method) can use "same" or "wider" access modifier than the method in parent class(Overridden Method)
        4)When you change the "return type" in "method overriding", from child to parent you must have "IS-A" relationship.
        5)Return Type of the Overridden Method can be the "top return type" of the Overriding Method
        6)If there is "IS-A" relationship between return types, those called "Covariant Return Types"
        7)Between the "Wrapper Classes" there is no "parent-child relationship" that is why you cannot have "IS-A" relationship
          If you do not have "IS-A" relationship you cannot change return type in "Method Overriding"
        8)Between the "primitive data types" there is no "parent-child relationship" that is why you cannot have "IS-A" relationship
          If you do not have "IS-A" relationship you cannot change return type in "Method Overriding"
        9)If the return type is void you cannot change it in method overriding
        10)"private" methods in "parent class" cannot be overridden
        11)"static" method cannot be overridden
            "final" keyword in Java:
            1)"final" keyword can be used for variables
              If you use "final" keyword for variables i)You have to initialize the variable ii)After assigning a value you cannot update the value.
            2)"final" keyword can be used for classes
              If you use "final" keyword for a class, the class cannot have "Child Class"
            3)"final" keyword can be used for methods
              If you use "final" keyword for methods, the method cannot be overridden.
              The body of a "final method" cannot be updated, so it cannot be overridden because in overriding we update the method body
         12) Polymorphism = Method Overloading + Method Overriding
         What is the difference between "Method Overloading" and "Method Overriding"?
            i)"Method Overriding" needs "inheritance" but "Method Overloading" occurs in a single class we do not need "inheritance"
            ii)"private" methods cannot be overridden but can be overloaded
            iii)We do not touch "method signature" in "Method Overriding" but we change "parameters" I mean method signature in "Method Overloading"
            iv)We cannot override "static" methods, we can "overload" them
            v) Other name of "Method Overloading" is "Static Polymorphism"
               Other name of "Method Overriding" is "Dynamic Polymorphism"
            vi)Other name of "Method Overloading" is "Compile Time Polymorphism"
               Other name of "Method Overriding" is "Run Time Polymorphism"
     */

    /*
    1) Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
    2) Overriding'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
    3) @Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
    4) Overriding'de parent class'daki method'a "Overridden Method", child class'daki method'a ise "Overriding Method" denir.
    5) "primitive" method'lar "override" edilemezler.
    6) Child Class'daki override edilmis method(Overriding Method)'un
       access modifier'i Parent Class'daki override edilmis method(Overridden Method)'un
       access modifier'indan dar olamaz.
       Overridden Method ==> protected ise Overriding Method==> protected+ public
       Overridden Method ==> default ise Overriding Method==> default + protected + public
       Overridden Method ==> private ise Overriding Method==> override olmaz ki access modifier'i olsun. (Bkz 5. kural)
    7) Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin aynisi veya o data type'inin
       parent'i olarak secilebilir.
    8) Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir ama
       primitive'ler arasinda "parent - child iliskisi" olmadigindan parent'dan secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir kalir.
    9) Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir,
       ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
    10) Method'un return type'i "void" ise, Overriding yaparken return type degistirilemez.
    11) Final kelimesini "Variable" larda kullanabilirsiniz.
        ==> final variable ise;
        i) mutlaka deger atanmalidir
        ii) ilk atanan deger degistirilemez
    12) Final kelimesini "Method" larda kullanabilirsiniz.
        ==> method final ise;
        i) method body'si degistirilemez
        ii) method body'si degistirilemeyince override yapmak mumkun olmaz
    13) Final kelimesini "Class" larda kullanabilirsiniz.
        ==> class final ise;
        i) class'in child'i olamaz.
    14) "final" method'lar ve "static" method'lar "override" edilemezler.
    15) "Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent - Child iliskisi sarttir.
    16) Method Overloading "Compile Time Polymorphism" (Poly - coklu, morph- gorunum demektir) dir, Method Overriding "Run Time Polymorphism" dir.
        Example: public int add(){}, public int add(int a, int b){} ;   public int add(){a+b} , public int add(){a+b+5}.
    17)  Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.
     */





    public void eat() {// Parent'deki overirride edilmis eat() method'una "Overridden Method" denir
        System.out.println("Animals eat...");
    }

    public void drink(){System.out.println("Animals drink...");
    }

    public Animal create(){return new Animal();
    }

    public int add(int a, int b){return a+b;
    }
    public Integer multiply(int a, int b){return a*b;}

}