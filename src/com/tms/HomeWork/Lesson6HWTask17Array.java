package com.tms.HomeWork;

import java.util.Random;

public class Lesson6HWTask17Array {
    public static void main(String[] args) {

        /* Задание 17. Создать двухмерный квадратный массив, и заполнить его «бабочкой» */
        System.out.println(" ");

        char array17[][] = new char[12][12];
        int i, j;

        for (i = 0; i < array17.length / 2 + 1; i++) {
            for (j = 0; j < array17[i].length; j++) {
                if ((j < i) || (j >= (array17[i].length - i)))
                    array17[i][j] = 35;
                else
                    array17[i][j] = 176;
            }
        }
        for (i = array17.length - 1; i >= array17.length / 2; i--) {
            for (j = 0; j < array17[i].length; j++) {
                if ((j < (array17[i].length - 1 - i)) || (j > i))
                    array17[i][j] = 35;
                else
                    array17[i][j] = 176;
            }
        }
        for (i = 0; i < array17.length; i++) {
            for (j = 0; j < array17[i].length; j++) {
                System.out.print(array17[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
