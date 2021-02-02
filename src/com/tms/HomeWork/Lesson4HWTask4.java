package com.tms.HomeWork;

public class Lesson4HWTask4 {

    public static void main(String[] args) {

        /* Задание 4. Определить число, полученное выписыванием в обратном порядке цифр
       любого 4-х значного натурального числа.  */

        System.out.println("Задание 4");
        int danoChislo = 8256;
        int oper1 = danoChislo % 1000; // last three digits (Последние три цифры)
        int oper2 = (danoChislo - oper1) / 1000; // first digit (Первая цифра)
        int oper3 = oper1 % 100; // last two digits (Последние две цифры)
        int oper4 = (oper1 - oper3) / 100; // second digit (вторая цифра)
        int oper5 = oper3 % 10; // fourth digit (четвертая цифра)
        int oper6 = (oper3 - oper5) / 10; // third digit (третья цифра)
        int oper7 = (oper5 * 1000) + (oper6 * 100) + (oper4 * 10) + oper2; // build a four-digit number
        System.out.println("Дано число - " + danoChislo + "." + " Это число записанное в обратном порядке - " + oper7 + ".");

    }
}
