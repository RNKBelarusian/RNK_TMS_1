package com.tms;
import java.lang.Math;
import java.util.Random;

public class Lesson4HW {
    public static void main (String [] args) {
    /* Задание 3.  */

    /* Задание 4. Определить число, полученное выписыванием в обратном порядке цифр
       любого 4-х значного натурального числа.  */

        System.out.println ("Задание 4");
        int danoChislo = 8256;
        int oper1 =  danoChislo % 1000; // last three digits (Последние три цифры)
        int oper2 = (danoChislo - oper1) / 1000; // first digit (Первая цифра)
        int oper3 = oper1%100; // last two digits (Последние две цифры)
        int oper4 = (oper1 - oper3)/100; // second digit (вторая цифра)
        int oper5 = oper3%10; // fourth digit (четвертая цифра)
        int oper6 = (oper3 - oper5)/10; // third digit (третья цифра)
        int oper7 = (oper5*1000) + (oper6*100) + (oper4*10) + oper2 ; // build a four-digit number
        System.out.println ("Дано число - " + danoChislo + "." + " Это число записанное в обратном порядке - " + oper7 + ".");

    /* Задание 5. Дано любое натуральное 4-х значное число. Верно ли что все цифры числа различны? */
        System.out.println ("Задание 5");
        int natChislo = 1234;
        int var1 =  natChislo % 1000; // last three figure
        int firstNumber = (natChislo - var1) / 1000; // first number
        int var2 = var1%100; // last two figure
        int twoNumber = (var1 - var2)/100;  // two number
        int fourNumber = var2%10;  // four number
        int threeNumber = (var2 - fourNumber)/10;  // three number
        if (firstNumber == twoNumber || firstNumber == threeNumber || firstNumber == fourNumber || twoNumber ==  threeNumber || twoNumber == fourNumber || threeNumber == fourNumber) {
            System.out.println ("Число - " + natChislo + " Имеет одинаковые цифры!!!");
        } else { System.out.println ("Число - " + natChislo + " НЕ имеет одинаковых цифр!!!" );}


    /* Задание 6. Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя
       цифра семеркой. Определите, является ли число четным. */
        System.out.println ("Задание 6");
        int count = 0;
        int chislo = 699;
        if (chislo%2 == 0){count++; System.out.println ("Заданное число " + chislo + " чётное"); }
        if (chislo%10 == 7 ){count++; System.out.println ("Последняя цифра числа " + chislo + " - семёрка"); }
        if (chislo > 100 && chislo < 1000 ){count++; System.out.println ("Заданное число " + chislo + " - трёхзначное"); }
        if ( count==0 ) {System.out.println ("Заданное число " + chislo + " - Не трёхзначное, Не чётное, и последняя цифра НЕ семь!!!"); }

    /* Задание 7. Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью
       закрыть круглой картонкой радиусом r. */
        System.out.println ("Задание 7");
        double a = 5.56; // сторона "a" прямоугольника.
        double b = 7.81; // сторона "b" прямоугольника.
        double r = 4.88; // радиус окружности.

        double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (diagonal <= (2*r)){
            System.out.println("Поздравляем!!! Отверстие закрыто)) ");
        } else {
            System.out.println("Облом!!! Отверстие закрыто не полностью(( ");
        }


    /* Задание 8. Имеется целое число (задать с помощью Random rand = new Random();
       int x = rand.nextInt() ). Это число - количество денег в рублях. Вывести это число,
       добавив к нему слово <<рублей>> в правильном падеже.   */

        System.out.println ("Задание 8");
        Random rand = new Random();
        // int x = 102; // Можно задать ручками (предварительно закаментить Random() )
        int x = rand.nextInt(1000 );
        if (1 == x%10 || 1 == x%100 || 1 == x%1000 && x != 11 && x != 111 && x != 1111 ){
            System.out.println("Ваш баланс: " + x + " рубль.");
        } else if  (2 == x%10 || 2 == x%100 || 2 == x%1000 || 3 == x%10 || 3 == x%100 || 3 == x%1000 || 4 == x%10 || 4 == x%100 || 4 == x%1000 && x != 12 && x != 112 && x != 1112 && x != 13 && x != 113 && x != 1114 && x != 14 && x != 114 && x != 1114 ){
            System.out.println("Ваш баланс: " + x + " рубля.");
        } else {System.out.println("Ваш баланс: " + x + " рублей.");}

    }
}
