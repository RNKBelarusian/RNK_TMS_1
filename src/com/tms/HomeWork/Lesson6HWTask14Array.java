package com.tms.HomeWork;

import java.util.Random;

public class Lesson6HWTask14Array {

    public static void main(String[] args) {

        /* Задание 14. Создать массив оценок произвольной длины, вывести максимальную и
             минимальную оценку, её (их) номера.   */

        // Динамичесская инициализация массива (Устанавливаем длинну массива)
        Random rand = new Random();
        int varr = rand.nextInt(7) + 3; // Эта будет длинна массива с оценками

        int array14[] = new int[varr]; // объявление массива

        // Динамичесская инициализация массива (Заполняем массив оценками)
        for (int i = 0; i < array14.length; i++) {
            Random rand1 = new Random();
            int var14 = rand1.nextInt(9) + 1;
            array14[i] = var14;
        }
        // Вывод всех динамически проинициализированных элементов массива
        System.out.println("Все элемента массива ");
        for (int i = 0; i < array14.length; i++) {
            System.out.print(array14[i] + " ");
        }

        // Поиск наибольшего элемента массива
        System.out.println();
        int max = 0;
        int min = 100;
        for (int i = 0; i < array14.length; i++) {
            if (array14[i] > max) {
                max = array14[i];
            }
        }
        // Поиск наименьшего элемента массива
        for (int i = 0; i < array14.length; i++) {
            if (array14[i] < min) {
                min = array14[i];
            }
        }
        System.out.println(max + " - Максимальная оценка.");
        System.out.println(min + " - Минимальная оценка.");

    }
}
