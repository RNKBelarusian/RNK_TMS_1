package com.tms;
import java.util.Random;

public class Lesson5HW {

    public static void main (String [] args) {
        /* Задание 10. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию) */

        Random rand10 = new Random();
        int var10 = rand10.nextInt(5)+10;
        int fact = 1;
        for (int i=1;i<var10+1;i++){
            fact *= i ;
        }
        System.out.println("Факториал числа - " + var10 + " равен - " + fact);

    /* Задание 11. Имеется целое число, определить является ли это число простым, т.е.
       делится без остатка только на 1 и себя. */

        Random rand11 = new Random();
        int var11 = rand11.nextInt(100)+2;
        int count = 0;
        for (int i=1; i<var11+1;i++){
            if ( var11 % i == 0 ){
               count++;
            }
        }
        if (count == 2) {
            System.out.println ("Число - " + var11 +  " простое)) ");
        } else {
            System.out.println ("Число - " + var11 +  " НЕ простое)) ");
        }

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
