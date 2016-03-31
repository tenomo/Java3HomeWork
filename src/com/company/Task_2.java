package com.company;

/**
 * Created by tenom on 31.03.2016.
 */
public class Task_2
{
    // функция принимает множество, и делает его инверсию.
    double [] InversionArray (double [] array)
    {
        double buff;                             // временная переменная
        int oppositeTheIndex = array.length-1;   // противоположный индекс от текущего
        double [] resultarray = array.clone();   // копируем массив, что быс ним работать
        for (int i = 0; i < array.length; i++) {
            buff = array[i];                     // Сохраняем и-й эллемент в мнимый буфер
            resultarray[i] = resultarray[oppositeTheIndex]; // Сохраняем элемент с противоположным индексом
                                                            // в и-й элемент
            resultarray[oppositeTheIndex] = buff; // на его место заносим сохраненное значение
            oppositeTheIndex--;                   // обратная итерация
        }
        return   resultarray;                    // возвращаем результат..
    }
}
