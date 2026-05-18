package com.example.algorithms.essential_algorithms.numerical;

import org.springframework.stereotype.Component;

@Component
public class GreatestCommonDivisors {

    public Integer gcd(Integer a, Integer b) {
        if(a == null || b == null) throw new RuntimeException("No nulls please");

        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

}
