import com.example.session1.StringCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//        1	[]	doesn't have prime factors
//        2	[2]	It's a prime number
//        3	[3]	It's a prime number
//        4	[2, 2]	It's a compound number
//        6	[2, 3]	It's a compound number
//        8	[2, 2, 2]	It's a compound number
//        18	[2, 3, 3]	It's a compound number

class PrimeFactorsTest {

    @Test
    void shouldReturnPrimeFactorsOfGivenNumber() {
        assertEquals(List.of(), PrimeFactors.getPrimeFactors(1));
        assertEquals(List.of(2), PrimeFactors.getPrimeFactors(2));
        assertEquals(List.of(3), PrimeFactors.getPrimeFactors(3));
        assertEquals(List.of(2, 2), PrimeFactors.getPrimeFactors(4));
        assertEquals(List.of(2, 3), PrimeFactors.getPrimeFactors(6));
        assertEquals(List.of(2, 2, 2), PrimeFactors.getPrimeFactors(8));
        assertEquals(List.of(2, 3, 3), PrimeFactors.getPrimeFactors(18));
    }

}
