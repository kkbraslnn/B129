package day24accessmodifierinheritance;

import day23datetimestringbuilder.Snake;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat();


    }
}