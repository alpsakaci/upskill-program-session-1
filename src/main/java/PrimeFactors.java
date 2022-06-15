import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> getPrimeFactors(int givenNumber) {
        ArrayList<Integer> primeFactors = new ArrayList<>();


        while(givenNumber > 1){

            for (int i = 2; i <= givenNumber; i++) {

                if (givenNumber % i == 0) {
                    primeFactors.add(i);
                    givenNumber = givenNumber / i;
                    break;
                }
            }
        }

        return primeFactors;
    }
}
