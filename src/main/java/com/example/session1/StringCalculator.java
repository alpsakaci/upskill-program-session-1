package com.example.session1;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public Integer add(String input) {
        if (input.isEmpty()) return 0;

        String separator = "\n";
        if (input.startsWith("//")) {
            String[] inputArray = input.split("\n");
            separator = inputArray[0].substring(2);
            input = inputArray[1];
        }

        String regex = "([," + separator + "\n])";
        String[] numbers = input.split(regex);

        checkNegativeNumbers(numbers);
        return addArrayElements(numbers);
    }

    private void checkNegativeNumbers(String[] numbers) {
        List<Integer> negatives = new ArrayList<>();
        for (String strNumber : numbers) {
            int number = Integer.parseInt(strNumber);
            if (number < 0) {
                negatives.add(number);
            }
        }
        if (!negatives.isEmpty()) {
            throw new RuntimeException("error: negatives not allowed: " + negatives);
        }
    }

    private Integer addArrayElements(String[] numbers) {
        int result = 0;
        for (String strNumber : numbers) {
            result += Integer.parseInt(strNumber);
        }
        return result;
    }

}
