package JavaRush.Lesson_2.Function;

public class Main {

    public static void main(String[] args) {
        minTwo(6,1);
        System.out.println("---------------------");

        maxTwo(3,4);
        System.out.println("---------------------");

        minThree();
        System.out.println("---------------------");

        minFour();
        System.out.println("---------------------");

        alpha("Переданная фраза");
        betta("Переданная фраза");
    }

    private static void betta(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print(name + " ");
        }
    }

    private static void alpha(String name){
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }

    }

    private static void minFour() {
        Integer[] arr = new Integer[]{-4, -45, -60,6};
        int value1 = Math.min(arr[0], arr[1]);
        int value2 = Math.min(arr[2], arr[3]);

        System.out.println(Math.min(value1, value2));
    }

    private static void minThree() {
        Integer[] arr = new Integer[]{-4, 1, -6};
        Integer value = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                value = arr[i + 1];
            }
        }
        System.out.println(value);

    }


    private static void maxTwo(int value1, int value2) {
        System.out.println(Math.max(value1, value2));
    }

    private static void minTwo(int value1, int value2) {
        System.out.println(Math.min(value1, value2));
    }
}
