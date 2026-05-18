package com.example.algorithms.essential_algorithms;

import com.example.algorithms.essential_algorithms.numerical.ArrayRandomizer;
import com.example.algorithms.essential_algorithms.numerical.GreatestCommonDivisors;
import com.example.algorithms.essential_algorithms.numerical.LinearCongruentGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class NumericalAlgorithmTests {

    @Autowired
    private ArrayRandomizer arrayRandomizer;

    @Autowired
    private GreatestCommonDivisors gcd;

    @Test
    public void linearCongruentGeneratorTest() {

        LinearCongruentGenerator lcg = LinearCongruentGenerator.getInstance();
        lcg.seed(0);

        int result1 = lcg.next(11,7,5);
        int result2 = lcg.next(11,7,5);
        int result3 = lcg.next(11,7,5);

        assertEquals(5, result1,"Result One isn't correct");
        assertEquals(7, result2,"Result Two isn't correct");
        assertEquals(10, result3,"Result Three isn't correct");

    }

    @Test
    public void linearCongruentGeneratorTest2() {

        LinearCongruentGenerator lcg = LinearCongruentGenerator.getInstance();
        lcg.seed(0);

        int result1 = lcg.next(11,7,5, 3, 45);
        int result2 = lcg.next(11,7,5, 3, 45);
        int result3 = lcg.next(11,7,5, 3, 45);

        assertEquals(8, result1,"Result One isn't correct");
        assertEquals(10, result2,"Result Two isn't correct");
        assertEquals(13, result3,"Result Three isn't correct");

    }

    @Test
    public void randomizedArrayTest() {
        String[] strings = new String[] {"one","two","three","four"};
        List<String> original = List.of(strings);
        arrayRandomizer.run(strings);
        List<String> result = List.of(strings);
        assertNotEquals(result,original,"Yo! They are the same and that isn't supposed to happen");
    }

    @Test
    public void GCDTest() {
        Integer result = gcd.gcd(33, 15);
        System.out.println(result);
    }

}
