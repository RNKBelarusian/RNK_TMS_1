package com.tms.HomeWork;

import java.util.Random;

public class Lesson5HWTask12Cycle {

    public static void main(String[] args) {

        /* Задание 12. Найдите сумму первых n чисел, которые делятся на 3. */

        int result = 0;
        for (int i = 0; i < 3; ) {
            Random rand12 = new Random();
            int n = rand12.nextInt(100);
            if (n % 3 == 0) {
                System.out.println(n + " - это число делится на 3. ЗАПОМИНАЕМ ЭТО ЧИСЛО))");
                result = result + n;
                i++;
                if (i == 3) {
                    System.out.println(result + " - это сумма трех чисел, которые нацело делятся на 3. УРАААА");
                } else {
                    System.out.println("Рандомим дальше... Три числа еще не набралось))");
                }
            } else {
                System.out.println(n + " - рандомное число не делится на 3. ЗАБЫВАЕМ ЭТО ЧИСЛО)) ");
            }
        }

    }

}
