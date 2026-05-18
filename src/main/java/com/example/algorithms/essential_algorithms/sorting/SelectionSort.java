package com.example.algorithms.essential_algorithms.sorting;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SelectionSort implements Sort {

    // Note: Very slow, quadratic time

    @Override
    public <T extends Comparable<T>> List<T> sort(List<T> list) {
        List<T> result = new ArrayList<>(list);// copy original list
        for(int i = result.size() - 1 ; i >= 1 ; --i) {
            int maxIndex = getMaxIndex(result, 0, i);
            if(maxIndex != i) {
                swap(result,i,maxIndex);
            }
        }
        return result;
    }

    private <T extends Comparable<T>> int getMaxIndex(List<T> list, int left, int right) {
        int maxIndex = left;
        int i = left + 1;
        while (i <= right) {
            T value = list.get(maxIndex);
            if(list.get(i).compareTo(value) > 0) maxIndex = i;
            ++i;
        }
        return maxIndex;
    }

    private <T extends Comparable<T>> void swap(List<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
}
