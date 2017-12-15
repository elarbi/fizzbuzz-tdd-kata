package ma.sccasa.fizzbuzzkata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {


    public static List<Object> generateTo(int to) {
        List<Object> sequence = new ArrayList<>();

        for (int i = 1 ; i < to; i++) {
            if (i % 3 == 0) {
                sequence.add("Fizz");
            }else if(i % 5 == 0) {
                sequence.add("Buzz");
            }else {
                sequence.add(i);
            }
        }
        return sequence;

    }


}
