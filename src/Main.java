import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;
        double[] weight = {1.57, 7.654, 9.986};
        int cars[] = {2, 4, 5, 6, 7, 8,};
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));
        double[] weight = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(weight));
        int cars[] = {2, 4, 5, 6, 7, 8,};
        System.out.println(Arrays.toString(cars));
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(+numbers[i]);
            if (i != 0) System.out.print(",");
        }
        System.out.println(" ");

        double[] weight = {1.57, 7.654, 9.986};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(+weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        int cars[] = {2, 4, 5, 6, 7, 8,};
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.print(+cars[i]);
            if (i != 0) System.out.print(",");
        }
        System.out.println(" ");
        numbers[2] = 3;
    }

    public static void task4() {

        System.out.println(" Задача 4 ");
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i]%2!=0) {
                numbers[i] += 1;}
        System.out.println(Arrays.toString(numbers));
    }
        }














