package com.example.algorithms.essential_algorithms.sorting;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InsertionSort implements Sort {

    @Override
    public <T extends Comparable<T>> List<T> sort(List<T> list) {
        List<T> result = new ArrayList<>(list);// copy original list
        for(int i = 0; i < result.size(); ++i) insert(result,i,result.get(i));
        return result;
    }

    private <T extends Comparable<T>> void insert(List<T> list, int pos, T value) {
        int i = pos - 1;
        while(i >= 0 && list.get(i).compareTo(value) > 0) {
            list.set(i + 1,list.get(i));
            --i;
        }
        list.set(i + 1,value);
    }
}
