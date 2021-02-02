package com.tms.HomeWork;

import java.util.Random;

public class Lesson6HWTask15Array {

    public static void main(String[] args) {

        /* Задание 15. Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    еще один массив).  */

        // Динамичесская инициализация массива (Устанавливаем длинну массива)
        Random rand15 = new Random();
        int var15 = rand15.nextInt(10) + 5; // Эта будет длинна массива

        int array15[] = new int[var15]; // объявление массива

        // Динамичесская инициализация массива (Заполняем массив)
        for (int i = 0; i < array15.length; i++) {
            Random rand15for = new Random();
            int var15for = rand15for.nextInt(9) + 1;
            array15[i] = var15for;
        }
        // Вывод всех динамически проинициализированных элементов массива
        System.out.println("Все элементы начального массива ");
        for (int i = 0; i < array15.length; i++) {
            System.out.print(array15[i] + " ");
        }
        // Переворачиваем массив
        for (int i = 0; i < array15.length / 2; i++) {
            int tmp = array15[i];
            array15[i] = array15[array15.length - i - 1];
            array15[array15.length - i - 1] = tmp;
        }
        System.out.println();
        // Вывод перевернутого массива
        System.out.println("Все элементы перевернутого массива ");
        for (int i = 0; i < array15.length; i++) {
            System.out.print(array15[i] + " ");
        }
    }
}
