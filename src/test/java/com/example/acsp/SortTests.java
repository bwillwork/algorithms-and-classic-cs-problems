package com.example.acsp;

import com.example.acsp.sorting.TranspositionSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class SortTests {

    @Test
    public void transpositionSortTest() {
        TranspositionSort<Integer> sort = new TranspositionSort<>();

        Integer [] someInts = new Integer[] {2,4,2,5,6,7,3,2,7,8,9};

        sort.sort(someInts);

        System.out.println(Arrays.toString(someInts));

    }

}
