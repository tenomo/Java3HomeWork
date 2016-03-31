package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by tenom on 30.03.2016.
 */

public class Task_1 {

    // Функция для нахождение среднего арифметического GetAverage возвращающая значения типа float
    // Параметр функции int[] (множество целочисленых чисел)
    public float GetAverage(int[] array) {
        float sumOfElemets = 0;
        for (int item : array) {
            sumOfElemets += item;  // В цикле суммируем элементы множества
        }
        return sumOfElemets / array.length; // Возвращаем сумму элементов / на их количество
    }
    // Функция для нахождение элемента в множестве, значение которого близкое к среднему арефметическому
    // Принимает множество как параметр
    public void FindCloseToAverage(int[] array) {

        float average = GetAverage(array);

        int buff = 0;  // хранит предедущее ближайшее найденое значение

        double lastDiference = Integer.MAX_VALUE; // Хранит разницу между предедущим элементом и средним арефметическим

        int id = 0; // ИД текущего элемента

        for (int itemID = 0; itemID < array.length; itemID++) {

            double dif = Math.abs(difference(array[itemID], average)); // Вычисление разницы

            if (dif < lastDiference) { // Если "предедущаяя" разница  больше теперешней
                buff = array[itemID];  // сохраняем элемент
                lastDiference = dif;   // сохраняем текущую разницу
                id = itemID;           // сохраняем ид

            }
        }
        // Выводим в консоль наши нехитрые вычисления.
        System.out.println("Множество чисел: " + Arrays.toString(array));
        System.out.println("Среднее арфеметическое множества: " + average);
        System.out.println("Элемент множества c id: " + id + " значение которого близкое\n" +
                "к среднему арефметическому: " + buff);


    }

    double difference(double a, double b) {
        return a - b;
    }
}
