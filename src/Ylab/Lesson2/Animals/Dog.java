package Ylab.Lesson2.Animals;

import Ylab.Lesson2.Animal;

public class Dog extends Animal {



    public Dog(String name, Boolean sleep, String eat, String voes) {
        super(name, sleep, eat, voes);
    }

    @Override
    public void habits(){
        if (!getSleep()){
            System.out.println(getName() + " машет хвостом");
        }else {
            System.out.println(getName() + " не машет хвостом");
        }

    }
}
