package com.example.acsp.sorting;

import java.util.List;

public class TranspositionSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] array) {
        int n = array.length;
        for(int j = 0; j < n; ++j) {
            int i = j - 1;
            T temp = array[j];
            while(i >= 0 && temp.compareTo(array[i]) < 0) {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = temp;
        }
    }

    @Override
    public void sort(List<T> list) {
        int n = list.size();
        for(int j = 0; j < n; ++j) {
            int i = j - 1;
            T temp = list.get(j);
            while(i >= 0 && temp.compareTo(list.get(i)) < 0) {
                list.set(i + 1,list.get(i));
                --i;
            }
            list.set(i + 1, temp);
        }
    }
}
