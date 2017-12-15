import ma.sccasa.fizzbuzzkata.FizzBuzzGenerator;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test that FizzBuzzGenerator generates correct sequence for 100
 * Game rule: Players take turns to count incrementally,
 * replacing <b>any number divisible by three with the word "fizz"</b>,
 * and <b>any number divisible by five with the word "buzz"</b>.
 * <p>
 * From: https://en.wikipedia.org/wiki/Fizz_buzz
 */
public class FizzBuzzTest {

    @Test
    public void testThatMultiplesOf3isReplacedByFizz() {

        //FizzBuzzGenerator.from(0).to(100).generate()
        int to = 1000;
        List<Object> generatedSequence = FizzBuzzGenerator.generateTo(to);

        for (int i = 1; i < generatedSequence.size() - 1; i++) {
            if (i % 3 == 0) {
                assertThat(generatedSequence.get(i - 1)).isEqualTo("Fizz");
            } else if (i % 5 == 0) {
                assertThat(generatedSequence.get(i - 1)).isEqualTo("Buzz");
            } else {
                assertThat(generatedSequence.get(i - 1)).isEqualTo(i);

            }

        }

        ;
    }


//            if (i % 5 == 0) {
//                assertTrue(generatedSequence.get(i+1).equals("Buzz"));
//            }


    @Test
    public void testThatMultiplesOf5isReplacedByBuzz() {

    }


}
