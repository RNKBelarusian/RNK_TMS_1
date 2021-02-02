package com.tms.HomeWork;

public class Lesson4HWTask6 {

    public static void main(String[] args) {

        /* Задание 6. Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя
       цифра семеркой. Определите, является ли число четным. */
        System.out.println("Задание 6");
        int count = 0;
        int chislo = 100;
        if (chislo % 2 == 0) {
            count++;
            System.out.println("Заданное число " + chislo + " чётное");
        }
        if (chislo % 10 == 7) {
            count++;
            System.out.println("Последняя цифра числа " + chislo + " - семёрка");
        }
        if (chislo > 99 && chislo < 1000) {
            count++;
            System.out.println("Заданное число " + chislo + " - трёхзначное");
        }
        if (count == 0) {
            System.out.println("Заданное число " + chislo + " - Не трёхзначное, Не чётное, и последняя цифра НЕ семь!!!");
        }

    }
}
// Замечание -  Задание 6 - 100 - трехзначное, а ты его не включил :)
// Замечание исправил