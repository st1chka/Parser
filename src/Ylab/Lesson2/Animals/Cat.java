package Ylab.Lesson2.Animals;

import Ylab.Lesson2.Animal;

public class Cat extends Animal {

    @Override
    public void habits() {
        if (!getSleep()) {
            System.out.println("Кошка урчит");
        } else {
            System.out.println("кошка не урчит");
        }

    }

    @Override
    public void moveEat() {
        if (!getSleep()) {
            System.out.println("котя ест");
        } else {
            System.out.println("котя не может есть, спит");
        }
    }

    @Override
    public void moveVoice() {
        if (!getSleep()) {
            System.out.println("Кошка мяукает");
        } else {
            System.out.println("Кошка не подает голос, спит");
        }
    }

}
