package com.tms.ClassWork;

public class Lesson5Array {
    public static void main (String [] args) {
        //Алгоритм сортировки массива методом "пузырька"
        int array[] = {20, 50, 30, 10, 40, 60};
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[(index + 1)];
                    array[index + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Вариант сортировки массивов – методом прямого перебора.

        int array2[] = {1, 7, 5, 6, 3, 15, 10, 5, 4, 6, 4, 2, 8, 6, 9};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 3 && array2[i] < 8) {
                System.out.print(array2[i] + " ");
            }
        }
      // Пример заполнения массива единицами.

        int array3[][] = new int[5][5];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = 1;
            }
        }
        // Пример создания массива треугольной формы.
        // Создаем треугольный массив
        int array4[][] = new int[5][];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = new int[i++];
        }
        // заполняем треугольный массив
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = 1;
            }
        }
        // Выводим на экран

    }
}
