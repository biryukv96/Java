package org.example;

public class IntToDoubleExample {
    public static void main(String[] args) {
        int myApples = 3;
        int yourApples = 10;
        double result = (myApples + yourApples) / 2.0;
        /*
        В задаче рассматривается такой случай как получить double при условии первая и вторая используемые переменные
        типа int. Решением является указание в одной из части вычисления дробного числа. Часть вычисления не смотрит
        на тип переменной и ей всё равно указан double или int, она смотрит лишь на данные с которыми ей придётся
        работать. Она делает вычесления с несколькими целыми числами - выдаст int.
         */
        System.out.println(result);
    }
}
