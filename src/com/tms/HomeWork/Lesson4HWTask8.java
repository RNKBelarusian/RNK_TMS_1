package com.tms.HomeWork;

import java.lang.Math;
import java.util.Random;

public class Lesson4HWTask8 {
    public static void main(String[] args) {

    /* Задание 8. Имеется целое число (задать с помощью Random rand = new Random();
       int x = rand.nextInt() ). Это число - количество денег в рублях. Вывести это число,
       добавив к нему слово <<рублей>> в правильном падеже.   */

        System.out.println("Задание 8");
        //Random rand = new Random();
        int x = 12; // Можно задать ручками (предварительно закаментить Random() )
        //int x = rand.nextInt(1000 );
        if (1 == x % 10 || 1 == x % 100 || 1 == x % 1000 && x != 11 && x != 111 && x != 1111) {
            System.out.println("Ваш баланс: " + x + " рубль.");
        } else if (2 == x % 10 || 2 == x % 100 || 2 == x % 1000 || 3 == x % 10 || 3 == x % 100 || 3 == x % 1000 || 4 == x % 10 || 4 == x % 100 || 4 == x % 1000 && x != 12 && x != 112 && x != 1112 && x != 13 && x != 113 && x != 1114 && x != 14 && x != 114 && x != 1114) {
            System.out.println("Ваш баланс: " + x + " рубля.");
        } else {
            System.out.println("Ваш баланс: " + x + " рублей.");
        }

    }
}

// Замечание.  Задание 8 - не все условия обработаны. Попробуй 11, 12 и т.п.