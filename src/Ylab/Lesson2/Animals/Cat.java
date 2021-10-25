package Ylab.Lesson2.Animals;

import Ylab.Lesson2.Animal;

public class Cat extends Animal {
    public Cat(String name, Boolean sleep, String eat, String voes) {
        super(name, sleep, eat, voes);
    }

    @Override
    public void habits(){
        if (!getSleep()){
            System.out.println(getName() + " урчит");
        }else {
            System.out.println(getName() + " не урчит");
        }

    }

}
