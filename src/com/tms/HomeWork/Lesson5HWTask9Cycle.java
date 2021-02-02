package com.tms.HomeWork;

public class Lesson5HWTask9Cycle {

    public static void main(String[] args) {

        /* Задание 9. Изменить пример с суммой чисел таким образом, чтобы расчитывалась не сумма,
            а произведение, т.е факториал числа.  */

        double averageSum = 0;
        double sum = 1;
        int counterFor9 = 0; // counter

        int var9 = (int) (Math.random() * 20);
        while (var9 != 0) {
            sum *= var9;
            counterFor9++;
            var9 = (int) (Math.random() * 20);
        }
        if (counterFor9 != 0) {
            averageSum = sum / counterFor9;
        } else {
            averageSum = 0;
        }
        System.out.println("Колличество итераций - " + counterFor9);
        System.out.println("Среднее " + averageSum);
    }

}
