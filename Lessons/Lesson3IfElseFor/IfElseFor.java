package org.example;

public class IfElseFor {
    public static void main(String[] args) {

        //boolean a = true; boolean b = false; - пример.
        //операторы сравнения: > - больше, < - меньше, == - сравнение, >= - больше либо равно, <= - меньше либо равно,
        //!= - не равно, то есть true когда сравнивание данные не равны.
        //&& - и, || - или. - булевые операторы.
        //+, -, *, / - это арифметический операторы, а операнд - это те значения над которыми производятся вычисления.

        double personAge = 45.5;

        int MinAge = 10;
        int MaxAge = 50;
//        System.out.println("Вы младше " + MinAge + " и старше " + MaxAge + " лет?");

//        int a = 24;
//        int b = 2;

        /*
        Конструкция if вернёт булевое значение true или false, от этого значения мы отталкиваемся далее.
        Конструкция if обязательная, а конструкция else опциональная
         */

//        if (personAge < MinAge || personAge > MaxAge) {
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }

        /*
        Конструкцию if можно использовать внутри конструкции if и внутри конструкции else
         */
        if (personAge > MinAge) {
            if (personAge < MaxAge) {
                System.out.println("Вам больше " + MinAge + " и меньше " + MaxAge);
            } else {
                System.out.println("Вам больше " + MaxAge);
            }
        } else {
            System.out.println("Вам меньше " + MinAge);
        }
    }
}
