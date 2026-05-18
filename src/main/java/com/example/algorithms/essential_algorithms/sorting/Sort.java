package com.example.algorithms.essential_algorithms.sorting;

import java.util.List;

public interface Sort {
    <T extends Comparable<T>> List<T> sort(List<T> list);
}
