package com.javarush.task.task12.task1210;

/*
Программа не должна выводить текст на экран.
2. Класс Solution должен содержать четыре метода.
3. Класс Solution должен содержать статический метод int max(int, int).
4. Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
5. Класс Solution должен содержать статический метод long max(long, long).
6. Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
7. Класс Solution должен содержать статический метод double max(double, double).
8. Метод double max(double, double) должен возвращать максимальное из двух чисел типа double.
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {
    }
        public static int max (int a , int b){
            return Math.max(a,b);

        }

        public static  long max(long a, long b){
            return (a>b)?a:b ;
        }
        public static double max (double a , double b){
        double number;
        if (a>b){
            number=a;
        }
        else {number=b;};
        return number ;

        }



    }

    //Напишите тут ваши методы

