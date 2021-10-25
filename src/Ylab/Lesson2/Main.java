package Ylab.Lesson2;

//import JavaRush.Lesson_2.Objects.Cat;

import Ylab.Lesson2.Animals.Cat;
import Ylab.Lesson2.Animals.Dog;

public class Main {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Собака", false, " чавкает", " лает");

        dog1.moveEat();
        dog1.moveVoes();
        dog1.habits();

        dog1.setSleep(true);

        dog1.moveEat();
        dog1.moveVoes();
        dog1.habits();
        System.out.println("-------------------------------------------");


        Cat cat1 = new Cat("Китя", false, " чавкает", " мяукает");

        cat1.moveEat();
        cat1.moveVoes();
        cat1.habits();

        cat1.setSleep(true);
        

        cat1.moveEat();
        cat1.moveVoes();
        cat1.habits();


    }
}
