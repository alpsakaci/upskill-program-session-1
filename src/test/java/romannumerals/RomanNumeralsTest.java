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
        assertEquals("IV", romanNumerals.convert(4));
    }

    @Test
    void shouldReturnWhenNumberBiggerThan4() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V", romanNumerals.convert(5));
        assertEquals("VI", romanNumerals.convert(6));
        assertEquals("VII", romanNumerals.convert(7));
        assertEquals("VIII", romanNumerals.convert(8));
        assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    void shouldReturnWhenNumberBiggerThan10() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X", romanNumerals.convert(10));
    }
}
