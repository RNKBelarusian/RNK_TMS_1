package com.tms.HomeWork;

import java.util.Random;

public class Lesson6HWTask16Array {

    public static void main(String[] args) {

        /* Задание 16. Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.  */

        Random rand16 = new Random();
        int var16 = rand16.nextInt(8) + 8; // Эта будет длинна массива

        int array16[] = new int[var16]; // объявление массива

        System.out.println(var16 + " - Длинна массива");

        // Динамичесская инициализация массива (Заполняем массив)
        for (int i = 0; i < array16.length; i++) {
            Random rand16for = new Random();
            int var16for = rand16for.nextInt(12) + 3;
            array16[i] = var16for;
        }
        // Вывод всех динамически проинициализированных элементов массива
        for (int i = 0; i < array16.length; i++) {
            System.out.print(array16[i] + " ");
        }
        System.out.println(" - Сам массив)) ");
        // Определение максимального элемента массива и его индекса
        System.out.println();
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < array16.length; i++) {
            if (array16[i] > max) {
                max = array16[i];
                indexMax = i;
            }
        }
        // Определение минимального элемента массива
        int min = 100;
        int indexMin = 100;
        for (int i = 0; i < array16.length; i++) {
            if (array16[i] < min) {
                min = array16[i];
                indexMin = i;
            }
        }
        System.out.println(min + " - Минимальный элемент массива");
        System.out.println(indexMin + " - Индекс минимального элемента массива");
        System.out.println();
        System.out.println(max + " - Максимальный элемент массива");
        System.out.println(indexMax + " - Индекс максимального элемента массива");
        System.out.println();

        // Определяем сумму элементов массива
        // if - если индекс минимального значения меньше индекса максимального
        // else - если индекс максимального значения меньше индекса минимального
        int summm = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin; i < indexMax - 1; i++) {
                summm = summm + array16[i + 1];
            }
            System.out.println(summm + " - Сумма элементов массива между min и max элементами");
        } else {
            for (int i = indexMax; i < indexMin - 1; i++) {
                summm = summm + array16[i + 1];
            }
            System.out.println(summm + " - Сумма элементов массива между max и min элементами");
        }
    }
}
