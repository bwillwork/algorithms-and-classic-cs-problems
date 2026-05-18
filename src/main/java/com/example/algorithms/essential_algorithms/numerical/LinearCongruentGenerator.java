package com.example.algorithms.essential_algorithms.numerical;

import java.util.ArrayList;
import java.util.List;

public class LinearCongruentGenerator {

    private static LinearCongruentGenerator generator;
    private LinearCongruentGenerator() {}

    public static LinearCongruentGenerator getInstance() {
        if(generator == null) generator = new LinearCongruentGenerator();
        return generator;
    }

    private List<Integer> numbs = new ArrayList<>();

    public void reset(int seed) {
        numbs.clear();
        this.seed(seed);
    }

    public void seed(int seed) {
        numbs.add(seed);
    }

    public Integer next(Integer modulo, Integer multiplier, Integer increment) {
        if(numbs.isEmpty()) throw new RuntimeException("Please seed the random num generator");

        Integer lastNum = numbs.get(numbs.size() - 1);
        Integer newNum = ((lastNum * multiplier) + increment) % modulo;
        numbs.add(newNum);
        return newNum;
    }


    public Integer next(Integer modulo, Integer multiplier, Integer increment, Integer min, Integer max) {
        Integer result = this.next(modulo,multiplier,increment);
        return min + result % (max - min + 1);
    }




}
