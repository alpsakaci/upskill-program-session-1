package com.example.session1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'':0",
            "4:4",
            "1,2:3",
            "2,3:5",
            "40,23:63",
            "5,10,20:35",
            "1,2,3,4,5,6,7,8,9:45",
    }, delimiter = ':')
    void shouldReturnSumOfNumbers(String input, int expected) {
        Integer result = new StringCalculator().add(input);
        assertEquals(expected, result);
    }

}
