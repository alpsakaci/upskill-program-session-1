package romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public String convert(int number) {
        Map<Integer, String> romanNumber = new HashMap();
        romanNumber.put(1, "I");
        romanNumber.put(5, "V");
        romanNumber.put(10, "X");
        romanNumber.put(50, "L");
        romanNumber.put(100, "C");
        romanNumber.put(500, "D");
        romanNumber.put(1000, "M");

        if (number == 10) {
            return romanNumber.get(10);
        }


        String result = "";
        if (number >= 5){
            if (number == 5){
                return romanNumber.get(5);
            }else{
                if ((number - 5) % 4 != 0){
                    result = result + romanNumber.get(5);
                    for(int i=5; i<number; i++) {
                        result = result + romanNumber.get(1);
                    }
                    return result;
                }else {
                    result = result + romanNumber.get(1);
                    result = result + romanNumber.get(10);
                    return result;
                }
            }

        }

        if (number % 4 != 0){
            result = result + romanNumber.get(1);
            for(int i=1; i<number; i++) {
                result = result + romanNumber.get(1);
            }
            return result;
        }else{
            result = result + romanNumber.get(1);
            result = result + romanNumber.get(5);
            return result;
        }
    }

}
