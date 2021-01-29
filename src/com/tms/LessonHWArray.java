package com.tms;

import java.util.Random;

public class LessonHWArray {
    public static void main (String [] args) {

        /* Задание 13. Создать последовательность случайных чисел, найти и вывести наибольшее из них  */

        /*int array13 [] = new int[8]; // объявление массива

        // Динамичесская инициализация массива
        for (int i = 0; i < array13.length; i++){
            Random rand = new Random();
            int var13 = rand.nextInt(100);
            array13[i] = var13;
        }
        // Вывод всех динамически проинициализированных элементов массива
        for (int i = 0; i<array13.length; i++){
        System.out.print(array13[i] + " " );
        }
        // Поиск наибольшего элемента массива
            System.out.println();
            int max = 0;
            for (int i = 0; i < array13.length; i++){
                if(array13[i]>max){
                    max = array13[i];
                }
            }
        System.out.println(max + " - Максимальный элемент массива." );*/





    /* Задание 14. Создать массив оценок произвольной длины, вывести максимальную и
       минимальную оценку, её (их) номера.   */

        /*// Динамичесская инициализация массива (Устанавливаем длинну массива)
        Random rand = new Random();
        int varr = rand.nextInt(7)+3; // Эта будет длинна массива с оценками

        int array14 [] = new int[varr]; // объявление массива

        // Динамичесская инициализация массива (Заполняем массив оценками)
        for (int i = 0; i < array14.length; i++){
            Random rand1 = new Random();
            int var14 = rand1.nextInt(9)+1;
            array14[i] = var14;
        }
        // Вывод всех динамически проинициализированных элементов массива
        System.out.println("Все элемента массива ");
        for (int i = 0; i<array14.length; i++){
            System.out.print(array14[i] + " " );
        }

        // Поиск наибольшего элемента массива
        System.out.println();
        int max = 0;
        int min = 100;
        for (int i = 0; i < array14.length; i++){
            if(array14[i]>max){
                max = array14[i];
            }
        }
        // Поиск наименьшего элемента массива
        for (int i = 0; i < array14.length; i++){
            if(array14[i]<min){
                min = array14[i];
            }
        }
        System.out.println(max + " - Максимальная оценка." );
        System.out.println(min + " - Минимальная оценка." );*/


    /* Задание 15. Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    еще один массив).  */

        // Динамичесская инициализация массива (Устанавливаем длинну массива)
        Random rand15 = new Random();
        int var15 = rand15.nextInt(10)+5; // Эта будет длинна массива

        int array15 [] = new int[var15]; // объявление массива

        // Динамичесская инициализация массива (Заполняем массив)
        for (int i = 0; i < array15.length; i++){
            Random rand15for = new Random();
            int var15for = rand15for.nextInt(9)+1;
            array15[i] = var15for;
        }
        // Вывод всех динамически проинициализированных элементов массива
        System.out.println("Все элементы начального массива ");
        for (int i = 0; i<array15.length; i++){
            System.out.print(array15[i] + " " );
        }
        // Переворачиваем массив
        for (int i = 0; i< array15.length/2 ; i++){
            int tmp = array15[i];
            array15[i] = array15[array15.length-i-1] ;
            array15[array15.length-i-1] = tmp;
        }
        System.out.println();
        // Вывод перевернутого массива
        System.out.println("Все элементы перевернутого массива ");
        for (int i = 0; i<array15.length; i++){
            System.out.print(array15[i] + " " );
        }






    /* Задание 16. Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.  */



    /* Задание 17. Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
    таким образом: */


    }
}
