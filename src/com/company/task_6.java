package com.company;

import sun.java2d.pipe.AAShapePipe;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tenom on 31.03.2016.
 */
public class task_6 {

    private String str = "!@qwer9876543tyu#$%^#$%^fgdfgf&*()&kjhg*()_-87gvdfdfhtyujtgq3t5u68i54jwq56452654+=987654";

    ArrayList letters= new ArrayList();
    ArrayList numbers= new ArrayList();
    ArrayList others= new ArrayList();

    void ParceStringAndPrint() {
        char[] bufferChars = str.toCharArray();
        int lenghtChars = bufferChars.length;

        for (int i = 0; i < lenghtChars; i++) {
            int idASCI_currentChar = (int) bufferChars[i];

            if (idASCI_currentChar >= 48 && idASCI_currentChar <= 57)
                numbers.add(bufferChars[i]);
            else if (idASCI_currentChar >= 97 && idASCI_currentChar <= 122)
                letters.add(bufferChars[i]);
            else
                others.add(bufferChars[i]);
        }

        System.out.println("Случайній симолы который мы будем парсить: "+str);

        System.out.println("Буквы только нижнего реестра: " +  Arrays.deepToString(letters.toArray()));

        System.out.println("Цыфры: " +   Arrays.deepToString(numbers.toArray()));

        System.out.println( "Другие символы: " +  Arrays.deepToString(others.toArray()));
    }

}
