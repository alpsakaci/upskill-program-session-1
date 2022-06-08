package com.example.session1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void shouldReturnSumOfNumbersWithNewLine() {
        Integer result = new StringCalculator().add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    void shouldReturnSumOfNumbersWithCustomSeparator() {
        Integer result = new StringCalculator().add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    void shouldThrowExceptionSumOfNumbersWithOneNegativeNumber() {
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> new StringCalculator().add("-1")
        );
        assertEquals("error: negatives not allowed: [-1]" , thrown.getMessage());
    }

    @Test
    void shouldThrowExceptionSumOfNumbersWithMultipleNegativeNumbers() {
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> new StringCalculator().add("-1,-2,-3")
        );
        assertEquals("error: negatives not allowed: [-1, -2, -3]" , thrown.getMessage());
    }

    @Test
    void shouldThrowExceptionSumOfNumbersWithBothPositiveAndNegativeNumbers() {
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> new StringCalculator().add("1,-2,-3")
        );
        assertEquals("error: negatives not allowed: [-2, -3]" , thrown.getMessage());
    }
}
