package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

class Sort{
    public static void  main(String[] args) {
        int[] array = {3, 2, -2, -4, 8, 6};

        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}