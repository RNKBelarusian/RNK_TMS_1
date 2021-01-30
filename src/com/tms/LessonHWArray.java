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

    //******************************************************************************************************************

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

    //******************************************************************************************************************

    /* Задание 15. Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    еще один массив).  */

        // Динамичесская инициализация массива (Устанавливаем длинну массива)
        /*Random rand15 = new Random();
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
        }*/

    //******************************************************************************************************************

    /* Задание 16. Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.  */

        /*Random rand16 = new Random();
        int var16 = rand16.nextInt(8) + 8; // Эта будет длинна массива

        int array16[] = new int[var16]; // объявление массива

        System.out.println(var16 + " - Длинна массива");

        // Динамичесская инициализация массива (Заполняем массив)
        for (int i = 0; i < array16.length; i++) {
            Random rand16for = new Random();
            int var16for = rand16for.nextInt(12) + 3;
            array16[i] = var16for;
        }
        // Вывод всех динамически проинициализированных элементов массива
        for (int i = 0; i < array16.length; i++) {
            System.out.print(array16[i] + " ");
        }
        System.out.println(" - Сам массив)) ");
        // Определение максимального элемента массива и его индекса
        System.out.println();
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < array16.length; i++) {
            if (array16[i] > max) {
                max = array16[i];
                indexMax = i;
            }
        }
        // Определение минимального элемента массива
        int min = 100;
        int indexMin = 100;
        for (int i = 0; i < array16.length; i++) {
            if (array16[i] < min) {
                min = array16[i];
                indexMin = i;
            }
        }
        System.out.println(min + " - Минимальный элемент массива");
        System.out.println(indexMin + " - Индекс минимального элемента массива");
        System.out.println();
        System.out.println(max + " - Максимальный элемент массива");
        System.out.println(indexMax + " - Индекс максимального элемента массива");
        System.out.println();

        // Определяем сумму элементов массива
        // if - если индекс минимального значения меньше индекса максимального
        // else - если индекс максимального значения меньше индекса минимального
        int summm = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin; i < indexMax - 1; i++) {
                summm = summm + array16[i + 1];
            }
            System.out.println(summm + " - Сумма элементов массива между min и max элементами");
        } else {
            for (int i = indexMax; i < indexMin - 1; i++) {
                summm = summm + array16[i + 1];
            }
            System.out.println(summm + " - Сумма элементов массива между max и min элементами");
        }*/

    //******************************************************************************************************************

    /* Задание 17. Создать двухмерный квадратный массив, и заполнить его «бабочкой» */
        int fon = 0;
        int Zapolnenie = 1;

        int array17[][] = new int[10][10];
        // заполняем массив фоном
        for (int i = 0; i < array17.length; i++) {
            for (int j = 0; j < array17[i].length; j++) {
                array17[i][j] = fon;
            }
        }
        // заполняем массив рисунком

        for (int i = 0; i < array17.length; i++) {

            for (int j = 0; j < array17[i].length; j++) {
                array17[i][j] = Zapolnenie;
            }


        }


        // печатаем массив
        for (int i = 0; i < array17.length; i++) {
            System.out.println();
            for (int j = 0; j < array17[i].length; j++) {
                System.out.print(array17[i][j] + "  ");
            }
        }
    }
}
