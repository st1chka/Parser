package Ylab.Lesson2;

//import JavaRush.Lesson_2.Objects.Cat;

import Ylab.Lesson2.Animals.Cat;
import Ylab.Lesson2.Animals.Dog;

public class Main {
    public static void main(String[] args) {



        Dog dog1 = new Dog();

        dog1.moveEat();
        dog1.moveVoice();
        dog1.habits();

        dog1.setSleep(true);

        dog1.moveEat();
        dog1.moveVoice();
        dog1.habits();
        System.out.println("-------------------------------------------");


        Cat cat1 = new Cat();

        cat1.moveEat();
        cat1.moveVoice();
        cat1.habits();

        cat1.setSleep(true);


        cat1.moveEat();
        cat1.moveVoice();
        cat1.habits();


    }
}
