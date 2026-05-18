package com.example.algorithms.essential_algorithms.numerical;

import org.springframework.stereotype.Component;

@Component
public class ArrayRandomizer {

    private static LinearCongruentGenerator lcg = LinearCongruentGenerator.getInstance();
    static {
        lcg.seed(0);
    }
    private static int modulo = 11;
    private static int multiplier = 7;
    private static int increment = 5;

    public <T> void run(T[] array) {

        if(array == null || array.length == 0) return;

        for(int i = 0; i < array.length; ++i) {
            int j = chooseNextIndex(0,array.length - 1);
            swap(array,i,j);
        }

    }

    private <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private <T> int chooseNextIndex(int min, int max) {
        return lcg.next(modulo,multiplier,increment, min, max);
    }

}
