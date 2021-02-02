package com.tms.HomeWork;

import java.util.Random;

public class Lesson5HWTask10Cycle {

    public static void main(String[] args) {

        /* Задание 10. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию) */

        Random rand10 = new Random();
        int var10 = rand10.nextInt(5) + 10;
        int fact = 1;
        for (int i = 1; i < var10 + 1; i++) {
            fact *= i;
        }
        System.out.println("Факториал числа - " + var10 + " равен - " + fact);

    }
}
