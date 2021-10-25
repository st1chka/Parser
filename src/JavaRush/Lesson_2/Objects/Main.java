package JavaRush.Lesson_2.Objects;

public class Main {
    public static void main(String[] args) {
        cats();
        System.out.println("---------------------");

        dogs();
        System.out.println("---------------------");

        allDie();
        System.out.println("---------------------");

        rearrangementOfPhrases();
        System.out.println("---------------------");

    }



    private static void rearrangementOfPhrases() {
        String phrase1 = "Nothing personal";
        String phrase2 = "it's just business";

        System.out.println(phrase1 + " ," + phrase2);
    }

    private static void allDie() {
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
    }

    private static void cats() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println("Объекты " + cat1 + " (cat1) и " + cat2 + " (cat2) созданы");
    }

    private static void dogs() {
        Dog Max = new Dog("Max");
        Dog Bella = new Dog("Bella");
        Dog Jack = new Dog("Jack");

        System.out.println("Собаки с именами " + Max.getName() + " ," + Bella.getName() + " ," + Jack.getName() + " созданы");
    }
}
