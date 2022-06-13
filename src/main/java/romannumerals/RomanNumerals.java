package romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public String convert(int number) {
        Map<Integer, String> romanNumber = new HashMap();
        romanNumber.put(1, "I");
        romanNumber.put(5, "V");

        if (number==5) return "V";

        String result = "I";
        for(int i=1; i<number; i++) {
            result = result + "I";
        }
        return result;
    }

}
