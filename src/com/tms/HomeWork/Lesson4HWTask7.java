package com.tms.HomeWork;

public class Lesson4HWTask7 {

    public static void main(String[] args) {

        /* Задание 7. Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью
       закрыть круглой картонкой радиусом r. */

        System.out.println("Задание 7");
        double a = 5.56; // сторона "a" прямоугольника.
        double b = 7.81; // сторона "b" прямоугольника.
        double r = 4.88; // радиус окружности.

        double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (diagonal <= (2 * r)) {
            System.out.println("Поздравляем!!! Отверстие закрыто)) ");
        } else {
            System.out.println("Облом!!! Отверстие закрыто не полностью(( ");
        }

    }

}
