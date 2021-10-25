package Ylab.Lesson2.Animals;

import Ylab.Lesson2.Animal;

public class Dog extends Animal {


    @Override
    public void habits() {
        if (!getSleep()) {
            System.out.println("Собака машет хвостом");
        } else {
            System.out.println("Собака не машет хвостом");
        }

    }

    @Override
    public void moveEat() {
        if (!getSleep()) {
            System.out.println("Собака ест");
        } else {
            System.out.println("Собака не может есть, спит");
        }
    }

    @Override
    public void moveVoice() {
        if (!getSleep()) {
            System.out.println("Собака лает");
        } else {
            System.out.println("Собака не подает голос, спит");
        }
    }
}
