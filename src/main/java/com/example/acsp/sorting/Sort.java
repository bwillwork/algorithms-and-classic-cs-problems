package com.example.acsp.sorting;

import java.util.List;

public interface Sort <T extends Comparable<T>> {
    void sort(T [] array);
    void sort(List<T> list);
}
