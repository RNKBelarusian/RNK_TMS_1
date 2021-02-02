package com.tms.HomeWork;

import java.util.Random;

public class Lesson6HWTask13Array {

    public static void main(String[] args) {

        /* Задание 13. Создать последовательность случайных чисел, найти и вывести наибольшее из них  */

        int array13[] = new int[8]; // объявление массива

        // Динамичесская инициализация массива
        for (int i = 0; i < array13.length; i++) {
            Random rand = new Random();
            int var13 = rand.nextInt(100);
            array13[i] = var13;
        }
        // Вывод всех динамически проинициализированных элементов массива
        for (int i = 0; i < array13.length; i++) {
            System.out.print(array13[i] + " ");
        }
        // Поиск наибольшего элемента массива
        System.out.println();
        int max = 0;
        for (int i = 0; i < array13.length; i++) {
            if (array13[i] > max) {
                max = array13[i];
            }
        }
        System.out.println(max + " - Максимальный элемент массива.");
    }
}
