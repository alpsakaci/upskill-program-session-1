package com.example.session1;

public class StringCalculator {

    public Integer add(String input) {
        String[] numbers = input.split(",");
        if (input.isEmpty()) return 0;
        return sumArrayElements(numbers);
    }

    private Integer sumArrayElements(String[] numbers) {
        int result = 0;
        for (String strNumber : numbers) {
            result += Integer.parseInt(strNumber);
        }
        return result;
    }
}
