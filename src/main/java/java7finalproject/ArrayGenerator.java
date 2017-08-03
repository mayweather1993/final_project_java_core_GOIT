package java7finalproject;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
    public static int[] fillRandom(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] fillArrayPlusRandomElementToEnd(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i;
        }
        array[array.length - 1] = random.nextInt();
        return array;
    }

    public static int[] fillArrayReverseOrder(int size) {
        int[] array = new int[size];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = (array.length - 1) - i;
        }
        return array;
    }

    public static int[] fillSortingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i;
        }
        return array;
    }
}
