package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Створення масиву та випадкове заповнення його числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Числа від 0 до 99
        }

        // Виведення масиву до сортування
        System.out.println("Array before sorting: " + Arrays.toString(array));

        // Застосування сортування злиттям
        ArrayUtils.mergeSort(array);

        // Виведення відсортованого масиву
        System.out.println("Array after merge sort: " + Arrays.toString(array));

        // Використання бінарного пошуку для знаходження певного значення
        int target = array[random.nextInt(array.length)]; // Вибір випадкового значення з масиву
        int resultIndex = ArrayUtils.binarySearch(array, target);

        // Виведення результату пошуку
        if (resultIndex != -1) {
            System.out.println("Target " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}