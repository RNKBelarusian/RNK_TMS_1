package com.tms;

public class Lesson2HW {
    public static void main (String [] args){
        System.out.println("Hello World and TMS))"); // Задание 1
        System.out.println("Hello, Roman))"); // Задание 2

        int s = 3700;
        int sec = s % 60;
        int m = (s - sec)/60;
        int min = m % 60;
        int h = (m - min)/60;
        System.out.println(h + " часов, " + min + " минут, " + sec + " секунд.");


        /* Задание 3. Имеется 4500 секунд. Вывести в кансоль содержащихся в этом количестве секунд:
        A) минут + секунд
        B) часов + минут + секунд
        C) дней + часов + минут + секунд
        D) недель + дней + часов + минут + секунд
        */
        int s1 = 1584992;  // 4500
        int sec1 = s1 % 60;
        int m1 = (s1 - sec1)/60;
        int min1 = m1 % 60;
        int h1 = (m1 - min1)/60;
        int hour1 = h1 % 24;
        int d1 = (h1-hour1)/24;
        int day1 = d1 % 7;
        int w1 = (d1-day1)/7;

        System.out.println(m1 + " минута ,"  + sec1 +  " секунда");
        System.out.println(h1 + " час, "+ min1 + " минута ,"  + sec1 +  " секунда");
        System.out.println(d1 + " день, " + hour1 + " час, "+ min1 + " минута ,"  + sec1 +  " секунда");
        System.out.println(w1 + " неделя,  " + day1 + " день, " + hour1 + " час, " + min1 + " минута, " + sec1 + " секунда.");
    }
}