package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tenom on 31.03.2016.
 */
public class Task_5
{

    // имя переменной отлично отображает ее  назначение переменной так что.....

    private  int [] inputArray;

    private  int [] firstArray;

    private  int [] twoArray;

    private static final int input_Array_Lenght=10; // в задании сказано 10 ... значит 10


    public  void ReadArrayFromConsole ()
    {
      // Scanner инструмент в джава для считывания чего либо с консоли...
        Scanner scanner = new Scanner(System.in); // создаем обьект

        inputArray = new int[input_Array_Lenght];

        System.out.println("Заполнение массива. Введите 10 элементов");
        for (int id = 0; id<input_Array_Lenght;id++) {
            System.out.print("Элемент " + ((int)id+(int)1)+": ");
          inputArray[id]= scanner.nextInt();  // в цыкле  10 раз считываем значение с консоли
        }
        System.out.println("Входной массив: " + Arrays.toString(inputArray)); // выводим в консоль то что получилось
    }

    void BreakAnArray ()
    {
        System.out.println("Разбиение входного массива на 2 части"); // предупреждаем что нам терять нечего

        // инициализируем 2 масива как половнки входного. кол-во его деленное на  2 будет размером их...
        firstArray = new int[input_Array_Lenght/2];
        twoArray = new int[input_Array_Lenght/2];


        for (int i = 0; i < input_Array_Lenght/2 ; i++)
        {
            firstArray[i] = inputArray[i]; // тут ясно все
            twoArray[i] = inputArray[input_Array_Lenght/2+i]; // а тут отсчет будет от половины
        }
    }

    void  PrintAllArray ()
    {
        System.out.println("масств номер 1: " + Arrays.toString(firstArray));
        System.out.println("массив номер 2: " + Arrays.toString(twoArray));
    }
}
