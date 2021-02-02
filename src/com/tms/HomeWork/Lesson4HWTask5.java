package com.tms.HomeWork;

public class Lesson4HWTask5 {

    public static void main(String[] args) {

        /* Задание 5. Дано любое натуральное 4-х значное число. Верно ли что все цифры числа различны? */
        System.out.println("Задание 5");
        int natChislo = 1234;
        int var1 = natChislo % 1000; // last three figure
        int firstNumber = (natChislo - var1) / 1000; // first number
        int var2 = var1 % 100; // last two figure
        int twoNumber = (var1 - var2) / 100;  // two number
        int fourNumber = var2 % 10;  // four number
        int threeNumber = (var2 - fourNumber) / 10;  // three number
        if (firstNumber == twoNumber || firstNumber == threeNumber || firstNumber == fourNumber || twoNumber == threeNumber || twoNumber == fourNumber || threeNumber == fourNumber) {
            System.out.println("Число - " + natChislo + " Имеет одинаковые цифры!!!");
        } else {
            System.out.println("Число - " + natChislo + " НЕ имеет одинаковых цифр!!!");
        }

    }
}
// Доработать есть замечания