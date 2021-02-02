package com.tms.HomeWork;

import java.util.Random;

public class Lesson5HWTask11Cycle {

    public static void main(String[] args) {

        /* Задание 11. Имеется целое число, определить является ли это число простым, т.е.
       делится без остатка только на 1 и себя. */

        Random rand11 = new Random();
        int var11 = rand11.nextInt(100) + 2;
        int count = 0;
        for (int i = 1; i < var11 + 1; i++) {
            if (var11 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Число - " + var11 + " простое)) ");
        } else {
            System.out.println("Число - " + var11 + " НЕ простое)) ");
        }
    }
}
