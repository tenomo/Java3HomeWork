package com.company;

/**
 * Created by tenom on 31.03.2016.
 */
public class Task_3 {
    boolean Polindrom(int[] array)
    {
        int countIterations = array.length-1;

        for (int i = 0; i <= countIterations/2; i++) {

            if (array [i] != array[countIterations-i])  // сраниваем i-й и зеркальній ему элемент/
                                                        // если есть хотя бы одно не соответствие
                                                        // функция возвращает лож
            {
                return false;
            }
        }
        return true;                                    // если все сравнение прошли успешно - возвращаем истину
    }

}
