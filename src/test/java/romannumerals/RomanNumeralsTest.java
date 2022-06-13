package romannumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    void shouldReturnFrom1to4() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
        assertEquals("II", romanNumerals.convert(2));
        assertEquals("III", romanNumerals.convert(3));
        assertEquals("IIII", romanNumerals.convert(4));
    }

    @Test
    void shouldReturnWhenNumberBiggerThan4() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V", romanNumerals.convert(5));
    }
}
